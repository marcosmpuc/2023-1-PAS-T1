package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface IRepositorioAerovias extends JpaRepository<Aerovia, Long> {
    ArrayList<Aerovia> findAll();

    List<Aerovia> findByOrigemAndDestino(String origem, String destino);
    Aerovia getByOrigem(String origem);
    Aerovia getByDestino(String destino);
}
