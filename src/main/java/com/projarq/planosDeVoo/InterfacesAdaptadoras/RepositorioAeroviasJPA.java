package com.projarq.planosDeVoo.InterfacesAdaptadoras;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAerovias;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class RepositorioAeroviasJPA implements IRepositorioAerovias {
    private List<Aerovia> aerovias;

    public RepositorioAeroviasJPA(){
        aerovias = new LinkedList<>();

        // id, origem, destino, tamanho, altura
        aerovias.add(new Aerovia("1", "Porto Alegre","São Paulo", 27.098, 70 ));
        aerovias.add(new Aerovia("2", "Rio de Janeiro","Porto Alegre", 67.341, 56 ));
        aerovias.add(new Aerovia("3", "São Paulo","Salvador", 89.216, 47 ));
    }

    @Override
    public List<Aerovia> findAll(){
        return new ArrayList<>(aerovias);
    }

    @Override
    public Optional<Aerovia> findById(Long id) {
        return Optional.ofNullable(aerovias.stream().filter(c -> (c.getId() == id)).findAny().orElse(null));
    }

    @Override
    public Aerovia getByOrigem(String origem){
        return aerovias.stream().filter(c->c.getOrigem().equals(origem)).findAny().orElse(null);
    }

    @Override
    public Aerovia getByDestino(String destino){
        return aerovias.stream().filter(c->c.getDestino().equals(destino)).findAny().orElse(null);
    }
}
