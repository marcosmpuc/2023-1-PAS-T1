package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.AltitudeSlots;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioPlanos;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public class RepositorioPlanosJPA implements IRepositorioPlanos {
    private LinkedList<PlanoDeVoo> planosDeVoo;

    public RepositorioPlanosJPA() {
        planosDeVoo = new LinkedList<>();

        planosDeVoo.add(new PlanoDeVoo(1L, 42090L, 1L, 1L, LocalDateTime.now(),LocalDateTime.now().plusHours(2),true, 3000L));
        planosDeVoo.add(new PlanoDeVoo(2L, 89056L, 2L, 2L, LocalDateTime.now(),LocalDateTime.now().plusHours(2),true, 5000L));
        planosDeVoo.add(new PlanoDeVoo(3L, 11000L, 3L, 3L, LocalDateTime.now(),LocalDateTime.now().plusHours(2),true, 6000L));
    }

    @Override
    public PlanoDeVoo getById(Long id) {
        return planosDeVoo.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByMatricPiloto(Long matricPiloto) {
        return planosDeVoo.stream().filter(c->(c.getMatricPiloto() == matricPiloto)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByIdAeronave(Long idAeronave) {
        return planosDeVoo.stream().filter(c->(c.getIdAeronave() == idAeronave)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByIdAerovia(Long idAerovia) {
        return planosDeVoo.stream().filter(c->(c.getIdAerovia() == idAerovia)).findAny().orElse(null);
    }
    
    @Override
    public AltitudeSlots getSlotsLivres(Long idAerovia, LocalDateTime dataHorarioInicio, Long idAeronave) {
        ArrayList<Integer> slots = calcularSlots(idAerovia, dataHorarioInicio, idAeronave);
        int[] altitudesValidas = obterAltitudesValidas(idAeronave);

        for (int altitude: altitudesValidas) {
            PlanoDeVoo planoTeste = planosDeVoo.stream().filter(plano -> (plano.getDataHorarioDeInicio() == dataHorarioInicio
                    && plano.getSlots().verificarSeSlotsConflitam(slots)
                    && plano.getAltitude() == altitude))
                .findAny()
                .orElse(null);

            if (planoTeste != null)
                return new AltitudeSlots().slots(slots).altitude(altitude);
        }
        
        return null;
    }

    @Override
    public ArrayList<PlanoDeVoo> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public List<PlanoDeVoo> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
}