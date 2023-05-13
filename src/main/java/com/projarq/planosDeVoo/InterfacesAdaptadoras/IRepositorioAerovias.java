package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aerovia;

import java.util.List;
import java.util.Optional;

public interface IRepositorioAerovias {
    List<Aerovia> findAll();
    Optional<Aerovia> findById(Long id);

    Aerovia getByOrigem(String origem);
    Aerovia getByDestino(String destino);
}
