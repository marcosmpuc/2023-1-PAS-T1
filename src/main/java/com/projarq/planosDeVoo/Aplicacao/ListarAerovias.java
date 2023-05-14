package com.projarq.planosDeVoo.Aplicacao;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Service.ServicoAerovia;

import java.util.ArrayList;

public class ListarAerovias {

    private ServicoAerovia servicoAerovias;

    public ArrayList<Aerovia> listarAerovias(String origem, String destino){
        ServicoAerovia servicoAerovias = new ServicoAerovia();
        return servicoAerovias.listarAerovias(origem, destino);
    }
}
