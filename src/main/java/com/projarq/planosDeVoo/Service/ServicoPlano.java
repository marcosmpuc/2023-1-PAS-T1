package com.projarq.planosDeVoo.Service;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioPlanos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoPlano {
    @Autowired
    private IRepositorioPlanos iRepositorioPlanos;

    public void consistePlano(PlanoDeVoo planoDeVoo){

    }

     public ArrayList<PlanoDeVoo> listarPlanos(){
      var ls = (ArrayList<PlanoDeVoo>) iRepositorioPlanos.todos();
      return ls;
     }

    //  public boolean cancelarPlano(Long idPlano) {
    //     PlanoDeVoo plano = iRepositorioPlanos.getById(idPlano);
    //     if (plano == null) {
    //         return false;
    //     }

    //     // Marca o plano como cancelado e libera os slots envolvidos
    //     plano.setCancelado(true);
    //     for (Aerovia aerovia : plano.getIdAerovia()) {
    //         aerovia.setSlotDisponivel(true);
    //     }

    //     // Atualiza o plano no repositório
    //     iRepositorioPlanos.salvar(plano);

    //     return true;
    // }

}