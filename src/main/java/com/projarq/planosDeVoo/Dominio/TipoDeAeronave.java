package com.projarq.planosDeVoo.Dominio;

import java.time.LocalTime;

public enum TipoDeAeronave {
    PARTICULAR_DE_PEQUENO_PORTE {
        int altitudeMinima = 25000;
        int altitudeMaxima = 27000;
    },
    COMERCIAL_DE_PASSAGEIROS {
        int altitudeMinima = 28000;
        int altitudeMaxima = -1;
    },
    COMERCIAL_DE_CARGA {
        LocalTime horarioMinimo = LocalTime.of(0, 0);
        LocalTime horarioMaximo = LocalTime.of(6, 0);
    };
}
