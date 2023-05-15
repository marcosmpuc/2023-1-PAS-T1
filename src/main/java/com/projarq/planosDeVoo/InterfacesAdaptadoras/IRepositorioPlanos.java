package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface IRepositorioPlanos {
    ArrayList<PlanoDeVoo> findAll();
    
    PlanoDeVoo getById(Long id);
    PlanoDeVoo getByMatricPiloto(Long matricPiloto);
    PlanoDeVoo getByIdAeronave(Long idAeronave);
    PlanoDeVoo getByIdAerovia(Long idAerovia);
}