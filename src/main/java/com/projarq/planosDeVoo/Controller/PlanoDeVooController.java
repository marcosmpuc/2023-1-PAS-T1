package com.projarq.planosDeVoo.Controller;

import com.projarq.planosDeVoo.Dominio.AltitudeSlots;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.Service.ServicoPlano;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scta/planoDeVoo")
public class PlanoDeVooController {

    @Autowired
    private ServicoPlano servicoPlano;

    @GetMapping("/cancela/{idplano}")
    public PlanoDeVoo cancelarPlano(@PathVariable(value = "idplano") Long idplano) {
        return servicoPlano.cancelarPlano(idplano);
    }

    @PostMapping(value = "/scta/slotslivres", consumes = "application/json", produces = "application/json")
    public AltitudeSlots slotsLivres(@RequestAttribute(name = "rota") Long idAerovia,
            @RequestAttribute(name = "data") LocalDate data,
            @RequestAttribute(name = "horario") LocalTime horario,
            @RequestAttribute(name = "idAeronave") Long idAeronave){
        return servicoPlano.getSlotsLivres(idAerovia, LocalDateTime.of(data, horario), idAeronave);
    }
}