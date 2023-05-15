package com.projarq.planosDeVoo.Controller;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.Service.ServicoPlano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/scta/cancela")
public class PlanoDeVooController {

    @Autowired
    private ServicoPlano servicoPlano;

    @GetMapping("/{idplano}")
    public String cancelaPlano(@PathVariable(value = "idplano")Long idplano){
        String teste = "chapou zé";
        //return servicoPlano.cancelaPlano(idplano);

        return teste;
    }
}
