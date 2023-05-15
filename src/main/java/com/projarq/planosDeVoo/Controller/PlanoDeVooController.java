package com.projarq.planosDeVoo.Controller;

import com.projarq.planosDeVoo.Dominio.AltitudeSlots;
import com.projarq.planosDeVoo.Dominio.PlanoDeVoo;
import com.projarq.planosDeVoo.Service.ServicoPlano;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/scta/planoDeVoo")
public class PlanoDeVooController {

    @Autowired
    private ServicoPlano servicoPlano;

    @GetMapping("/cancela/{idplano}")
    public String cancelarPlano(@PathVariable(value = "idplano") Long idplano) {
        return servicoPlano.cancelarPlano(idplano);
    }

    @PostMapping(value = "/scta/slotslivres", consumes = "application/json", produces = "application/json")
    public AltitudeSlots slotsLivres(@RequestAttribute(name = "rota") Long idAerovia,
            @RequestAttribute(name = "data") LocalDate data,
            @RequestAttribute(name = "horario") LocalTime horario,
            @RequestAttribute(name = "idAeronave") Long idAeronave){
        return servicoPlano.getSlotsLivres(idAerovia, LocalDateTime.of(data, horario), idAeronave);
    }

    @PostMapping(value = "/scta/aprovaPlanoDeVoo", consumes = "application/json", produces = "application/json")
    public String aprovaAltitudeSlots(@RequestAttribute(name = "rota") Long idAerovia,
            @RequestAttribute(name = "id") BigInteger id,
            @RequestAttribute(name = "altitude") Integer altitude,
            @RequestAttribute(name = "cancelado") Boolean cancelado,
            @RequestAttribute(name = "data_horario_inicio") LocalTime inicio,
            @RequestAttribute(name = "data_horario_fim") LocalTime fim,
            @RequestAttribute(name = "id_aeronave") BigInteger id_aeronave,
            @RequestAttribute(name = "id_aerovia") BigInteger id_aerovia,
            @RequestAttribute(name = "matric_piloto") BigInteger matric_piloto,
            @RequestAttribute(name = "slots") Integer[] slots){
                
                String zeDaManga = "";
        return zeDaManga;
    }

    @PostMapping(value = "/scta/avaliaPlanoDeVoo", consumes = "application/json", produces = "application/json")
    public String avaliaPlanoDeVoo(@RequestAttribute(name = "id") Long id,
            @RequestAttribute(name = "idAeronave") Long idAeronave,
            @RequestAttribute(name = "idAerovia") Long idAerovia,
            @RequestAttribute(name = "altitude") int altitude,
            @RequestAttribute(name = "slots") ArrayList<Integer> slots) {
        return servicoPlano.avaliarPlanoDeVoo(new PlanoDeVoo(id)
                .idAeronave(idAeronave)
                .idAerovia(idAerovia)
                .altitude(altitude)
                .slots(slots));
    }

}