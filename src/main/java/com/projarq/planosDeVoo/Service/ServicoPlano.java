package com.projarq.planosDeVoo.Service;

import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioPlanos;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoPlano {
  @Autowired
  private IRepositorioPlanos iRepositorioPlanos;

  public PlanoDeVoo cancelarPlano(Long idPlano) {
    var retorno = iRepositorioPlanos.getPlanoDeVooById(idPlano);
    return retorno;
  }
}