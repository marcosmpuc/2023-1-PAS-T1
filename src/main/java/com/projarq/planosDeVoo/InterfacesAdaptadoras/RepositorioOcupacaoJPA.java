package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.Dominio.Ocupacao;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;

public class RepositorioOcupacaoJPA implements IRepositorioOcupacao {

    private LinkedList<Ocupacao> ocupacoes;

    public RepositorioOcupacaoJPA() {
        ocupacoes = new LinkedList<>();        
    }

    @Override
    public HashMap<Integer, Integer> getSlotsLivres(Long idAerovia, LocalDateTime dataHorarioInicio, Long idAeronave) {
        return null;
    }
}
