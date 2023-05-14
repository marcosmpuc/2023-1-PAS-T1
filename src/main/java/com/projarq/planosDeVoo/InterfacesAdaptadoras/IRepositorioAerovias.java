package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aerovia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface IRepositorioAerovias {
    ArrayList<Aerovia> findAll();
    ArrayList<Aerovia> listarAerovias(String origem, String destino);
    Aerovia getByOrigem(String origem);
    Aerovia getByDestino(String destino);
}
