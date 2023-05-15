package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.Dominio.Aerovia;

import java.time.LocalDateTime;
import java.util.HashMap;

public interface IRepositorioOcupacao {
    HashMap<Integer, Integer> getSlotsLivres(Long idAerovia, LocalDateTime dataHorarioInicio, Long idAeronave);
}
