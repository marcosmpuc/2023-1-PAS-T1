package com.projarq.planosDeVoo.Service;

import com.projarq.planosDeVoo.Dominio.Aeronave;
import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Dominio.AltitudeSlots;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAeronaves;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAerovias;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioPlanos;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoPlano {

    @Autowired
    private IRepositorioPlanos iRepositorioPlanos;

    @Autowired
    private IRepositorioAeronaves iRepositorioAeronaves;

    @Autowired
    private IRepositorioAerovias iRepositorioAerovias;

    public String cancelarPlano(Long idPlano) {
        String retorno;
        var planoDeVoo = iRepositorioPlanos.getPlanoDeVooById(idPlano);
        if (planoDeVoo != null) {
            planoDeVoo.setCancelado(true);
            planoDeVoo.zeraSlots();
            var ret = iRepositorioPlanos.save(planoDeVoo);
            retorno = "ok";
            return "Status: " + retorno + ", PlanoDeVoo: " + ret.toString();
        } else {
            retorno = "não encontrado";
            return "Status: " + retorno;
        }
    }

    


    public AltitudeSlots getSlotsLivres(Long idAerovia, LocalDateTime dataHorarioInicio, Long idAeronave) {
        ArrayList<Integer> slots = calcularSlots(idAerovia, dataHorarioInicio, idAeronave);
        ArrayList<Integer> altitudesValidas = iRepositorioAeronaves.getById(idAeronave).obterAltitudesValidas();

        for (int altitude: altitudesValidas) {
            PlanoDeVoo planoTeste = iRepositorioPlanos.findAll().stream().filter(plano -> (plano.getDataHorarioDeInicio() == dataHorarioInicio
                    && plano.verificarSeSlotsConflitam(slots)
                    && plano.getAltitude() == altitude))
                .findAny()
                .orElse(null);

            if (planoTeste != null)
                return new AltitudeSlots().slots(slots).altitude(altitude);
        }
        
        return null;
    }

    public boolean slotsEstaoLivres(PlanoDeVoo planoSendoAvaliado) {
        PlanoDeVoo planoTeste = iRepositorioPlanos.findAll().stream().filter(
                plano -> (plano.getDataHorarioDeInicio() == planoSendoAvaliado.getDataHorarioDeInicio()
                && plano.verificarSeSlotsConflitam(planoSendoAvaliado.getSlots())
                && plano.getAltitude() == planoSendoAvaliado.getAltitude()))
            .findAny()
            .orElse(null);

        if (planoTeste == null)
            return true;
        else
            return false;
    }

    public ArrayList<Integer> calcularSlots(Long idAerovia, LocalDateTime dataHorarioInicio, Long idAeronave) {
        ArrayList<Integer> slots = new ArrayList<>();
        
        double duracaoDoVoo = iRepositorioAerovias.getById(idAerovia).getTamanho() / iRepositorioAeronaves.getById(idAeronave).getVelocidadeDeCruzeiroKmH();
        duracaoDoVoo = Math.ceil(duracaoDoVoo);
        for (int slot = dataHorarioInicio.getHour(); slot < dataHorarioInicio.getHour() + duracaoDoVoo; slot++) {
            slots.add(slot);
        }
        
        return slots;
    }

    public String avaliarPlanoDeVoo(PlanoDeVoo propostaPlano) {
        String output = "";

        Aeronave aeronave = iRepositorioAeronaves.getById(propostaPlano.getIdAeronave());

        if (!slotsEstaoLivres(propostaPlano))
            output += "\nProblema: slots não estão livres.";

        if (!aeronave.obterAltitudesValidas().contains(propostaPlano.getAltitude()))
            output += "\nProblema: altitude não é válida.";
        
        //if (!aeronave.obterHorariosValidos().contains(propostaPlano.getDataHorarioInicio())
           // || !aeronave.obterHorariosValidos().contains(propostaPlano.getDataHorarioFim()))
           output += "\nProblema: data ou horário, de início ou de fim, não são válidas.";

        if (output.equals(""))
            output = "Aprovado.";
        return output;
    }

}