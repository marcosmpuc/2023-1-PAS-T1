package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IRepositorioPlanos extends JpaRepository<PlanoDeVoo, Long> {
    ArrayList<PlanoDeVoo> findAll();
    
    PlanoDeVoo getPlanoDeVooById(Long id);
    // PlanoDeVoo getByMatricPiloto(Long matricPiloto);
    // PlanoDeVoo getByIdAeronave(Long idAeronave);
    // PlanoDeVoo getByIdAerovia(Long idAerovia);
}