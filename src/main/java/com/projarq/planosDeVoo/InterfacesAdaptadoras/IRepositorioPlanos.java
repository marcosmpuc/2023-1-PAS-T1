package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.AltitudeSlots;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;

import java.time.LocalDateTime;
import java.util.List;

public interface IRepositorioPlanos {

    
    List<PlanoDeVoo> todos();
    
    PlanoDeVoo getById(Long id);
    PlanoDeVoo getByMatricPiloto(Long matricPiloto);
    PlanoDeVoo getByIdAeronave(Long idAeronave);
    PlanoDeVoo getByIdAerovia(Long idAerovia);
    AltitudeSlots getSlotsLivres(Long idAerovia, LocalDateTime dataHorarioInicio, Long idAeronave);
}