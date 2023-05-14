package com.projarq.planosDeVoo.Service;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAerovias;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.RepositorioAeronaveJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
public class ServicoAerovia {
    @Autowired
    private IRepositorioAerovias iRepositorioAerovias;
    //Retorna string com os slots e altitudes [1, 2700], [1,2900], [2,3000].....
    public ArrayList<String> listarSlotsLivres(Long idAerovia, LocalDateTime data, Long idAeronave) {

        return null;
    }

    public ArrayList<Aerovia> listarAerovias(String origem, String destino) {
        var ret = (ArrayList<Aerovia>) iRepositorioAerovias.findByOrigemAndDestino(origem, destino);
        return ret;
    }
}
