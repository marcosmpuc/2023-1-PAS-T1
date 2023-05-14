package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class RepositorioAeroviasJPA implements IRepositorioAerovias {

    @Override
    public ArrayList<Aerovia> findAll(){
        return null;
    }

    @Override
    public ArrayList<Aerovia> listarAerovias(@Param("origem") String origem, @Param("destino") String destino) {
        return null;
    }

    @Override
    public Aerovia getByOrigem(String origem){
        return null;
    }

    @Override
    public Aerovia getByDestino(String destino){
        return null;
    }
}
