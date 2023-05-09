package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import org.springframework.data.repository.CrudRepository;
import com.projarq.planosDeVoo.Dominio.Aeronave;
import com.projarq.planosDeVoo.Dominio.TipoDeAeronave;

import java.util.List;

public interface IRepositorioAeronaves extends CrudRepository<Aeronave, Long> {
    List<Aeronave> todas();
    Aeronave getById(Long id);
    Aeronave getByPrefixo(String prefixo);
    Aeronave getByTipo(TipoDeAeronave tipo);
}
