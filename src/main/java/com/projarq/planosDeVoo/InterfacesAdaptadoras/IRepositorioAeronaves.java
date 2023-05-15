package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aeronave;
import com.projarq.planosDeVoo.Dominio.TipoDeAeronave;

import java.util.List;

public interface IRepositorioAeronaves {
    List<Aeronave> todas();
    Aeronave getById(Long id);
    Aeronave getByPrefixo(String prefixo);
    Aeronave getByTipo(TipoDeAeronave tipo);
    Aeronave getById(String id);
}