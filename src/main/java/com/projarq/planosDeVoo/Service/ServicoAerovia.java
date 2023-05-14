package com.projarq.planosDeVoo.Service;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAeronaves;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAerovias;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.RepositorioAeronaveJPA;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.RepositorioAeroviasJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class ServicoAerovia {

    @Autowired
    private RepositorioAeroviasJPA repositorioAerovias;
    @Autowired
    private RepositorioAeronaveJPA repositorioAeronaves;

    //Retorna string com os slots e altitudes [1, 2700], [1,2900], [2,3000].....
    public ArrayList<String> listarSlotsLivres(Long idAerovia, LocalDateTime data, Long idAeronave) {

        return null;
    }

    public ArrayList<Aerovia> listarAerovias(String origem, String destino) {
        repositorioAerovias = new RepositorioAeroviasJPA();
        return repositorioAerovias.listarAerovias(origem, destino);
    }
}
