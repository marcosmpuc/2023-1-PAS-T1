package com.projarq.planosDeVoo.Controller;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Service.ServicoAerovia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/aerovias")
public class AeroviasController {

    @Autowired
    private ServicoAerovia servicoAerovia;

    @GetMapping("/{origem}/{destino}")
    public ArrayList<Aerovia> listarAerovias(@PathVariable(value = "origem")String origem, @PathVariable(value = "destino") String destino){
        return servicoAerovia.listarAerovias(origem, destino);
    }
}
