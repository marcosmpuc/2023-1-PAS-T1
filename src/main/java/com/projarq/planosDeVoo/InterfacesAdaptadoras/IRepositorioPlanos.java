package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.AltitudeSlots;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface IRepositorioPlanos {
    ArrayList<PlanoDeVoo> findAll();
    
    List<PlanoDeVoo> findById(Long id);
    PlanoDeVoo getById(Long id);
    PlanoDeVoo getByMatricPiloto(Long matricPiloto);
    PlanoDeVoo getByIdAeronave(Long idAeronave);
    PlanoDeVoo getByIdAerovia(Long idAerovia);
    AltitudeSlots getSlotsLivres(Long idAerovia, LocalDateTime dataHorarioInicio, Long idAeronave);
}