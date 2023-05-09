package com.projarq.planosDeVoo.Repository;

import com.projarq.planosDeVoo.Dominio.Aeronave;
import com.projarq.planosDeVoo.Dominio.TipoDeAeronave;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IRepositorioAeronaves extends CrudRepository<Aeronave, Long> {
    List<Aeronave> todas();
    Aeronave getById(Long id);
    Aeronave getByPrefix(Long prefixo);
    Aeronave getByType(TipoDeAeronave tipo);
}
