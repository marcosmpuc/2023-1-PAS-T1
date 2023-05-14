package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;

import java.util.List;

public class RepositorioOcupacaoJPA  implements IRepostiorioOcupação{
    @Override
    public List<PlanoDeVoo> getSlotsLivres(Aerovia aerovia) {
        return null;
    }
}
