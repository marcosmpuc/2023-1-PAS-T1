package com.projarq.planosDeVoo.Controller;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Service.ServicoAerovia;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/aerovias")
public class AeroviasController {

    private ServicoAerovia servicoAerovia;

    @GetMapping("/{origem}{destino}")
    @CrossOrigin(origins = "*")
    public ArrayList<Aerovia> listarAerovias(@PathVariable("origem")String origem, @PathVariable("destino") String destino){
        servicoAerovia = new ServicoAerovia();
        return servicoAerovia.listarAerovias(origem, destino);
    }
}
