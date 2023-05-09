package com.projarq.planosDeVoo.Repository;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IRepositorioAerovias extends CrudRepository<Aerovia, Long> {
    List<Aerovias> todas();
    Aerovias getById(Long id);
    Aerovias getByOrigem(String origem);
    Aerovias getByDestino(String destino);
}
