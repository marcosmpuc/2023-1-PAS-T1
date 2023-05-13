package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.Dominio.Aerovia;

import java.util.List;

public interface IRepostiorioOcupação {
    List<PlanoDeVoo> getSlotsOcupados(Aerovia aerovia);    
}
