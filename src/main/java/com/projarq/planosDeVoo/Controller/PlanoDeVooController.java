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
import java.util.Arrays;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
            @RequestAttribute(name = "idAeronave") Long idAeronave) {
        return servicoPlano.getSlotsLivres(idAerovia, LocalDateTime.of(data, horario), idAeronave);
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

    @PostMapping(value = "/aprovaPlanoDeVoo", consumes = "application/json", produces = "application/json")
    public String aprovaPlanoVoo(@RequestBody String json) {
        System.out.println("fala zeze bom dia cara");
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);

            BigInteger id = new BigInteger(jsonNode.get("id").asText());
            Integer altitude = jsonNode.get("altitude").asInt();
            Boolean cancelado = jsonNode.get("cancelado").asBoolean();
            LocalTime inicio = LocalTime.parse(jsonNode.get("data_horario_inicio").asText());
            LocalTime fim = LocalTime.parse(jsonNode.get("data_horario_fim").asText());
            BigInteger id_aeronave = new BigInteger(jsonNode.get("id_aeronave").asText());
            BigInteger id_aerovia = new BigInteger(jsonNode.get("id_aerovia").asText());
            BigInteger matric_piloto = new BigInteger(jsonNode.get("matric_piloto").asText());

            Integer[] slots = objectMapper.convertValue(jsonNode.get("slots"), Integer[].class);

            System.out.println("id: " + id);
            System.out.println("altitude: " + altitude);
            System.out.println("cancelado: " + cancelado);
            System.out.println("inicio: " + inicio);
            System.out.println("fim: " + fim);
            System.out.println("id_aeronave: " + id_aeronave);
            System.out.println("id_aerovia: " + id_aerovia);
            System.out.println("matric_piloto: " + matric_piloto);
            System.out.println("slots: " + Arrays.toString(slots));

            String zeDaManga = "";
            return zeDaManga;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
}