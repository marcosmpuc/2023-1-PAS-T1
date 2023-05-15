package com.projarq.planosDeVoo.Controller;

import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.Service.ServicoPlano;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/scta/cancela")
public class PlanoDeVooController {

    @Autowired
    private ServicoPlano servicoPlano;

    @GetMapping("/{idplano}")
    public PlanoDeVoo cancelarPlano(@PathVariable(value = "idplano")Long idplano){
        return servicoPlano.cancelarPlano(idplano);
    }
}