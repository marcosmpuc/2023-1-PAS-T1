package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioPlanos;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;

@Repository
public class RepositorioPlanosJPA implements IRepositorioPlanos {
    private LinkedList<PlanoDeVoo> planoDeVoos;

    public RepositorioPlanosJPA() {
        planoDeVoos = new LinkedList<>();

        planoDeVoos.add(new PlanoDeVoo(1L, 42090L, 1L, 1L, LocalDateTime.now(),LocalDateTime.now().plusHours(2),true, 3000L));
        planoDeVoos.add(new PlanoDeVoo(2L, 89056L, 2L, 2L, LocalDateTime.now(),LocalDateTime.now().plusHours(2),true, 5000L));
        planoDeVoos.add(new PlanoDeVoo(3L, 11000L, 3L, 3L, LocalDateTime.now(),LocalDateTime.now().plusHours(2),true, 6000L));
    }

    @Override
    public ArrayList<PlanoDeVoo> findAll() {
        return new ArrayList<>(planoDeVoos);
    }

    @Override
    public PlanoDeVoo getById(Long id) {
        return planoDeVoos.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByMatricPiloto(Long matricPiloto) {
        return planoDeVoos.stream().filter(c->(c.getMatricPiloto() == matricPiloto)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByIdAeronave(Long idAeronave) {
        return planoDeVoos.stream().filter(c->(c.getIdAeronave() == idAeronave)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByIdAerovia(Long idAerovia) {
        return planoDeVoos.stream().filter(c->(c.getIdAerovia() == idAerovia)).findAny().orElse(null);
    }
}