package com.projarq.planosDeVoo.Dominio;

import java.time.LocalTime;

public enum TipoDeAeronave {
    PARTICULAR_DE_PEQUENO_PORTE (25000, 27000, null, null),
    COMERCIAL_DE_PASSAGEIROS (28000, Aeronave.ALTITUDE_MAXIMA_PES, null, null),
    COMERCIAL_DE_CARGA (Aeronave.ALTITUDE_MINIMA_PES, Aeronave.ALTITUDE_MAXIMA_PES, LocalTime.of(0, 0), LocalTime.of(6, 0));

    public int altitudeMinimaPes;
    public int altitudeMaximaPes;
    public LocalTime horarioMinimo;
    public LocalTime horarioMaximo;

    TipoDeAeronave (int altitudeMinimaPes, int altitudeMaximaPes, LocalTime horarioMinimo, LocalTime horarioMaximo) {
        this.altitudeMinimaPes = altitudeMinimaPes;
        this.altitudeMaximaPes = altitudeMaximaPes;
        this.horarioMinimo = horarioMinimo;
        this.horarioMaximo = horarioMaximo;
    }

    boolean validarAltitude(int altitude) {
        if (altitude < Aeronave.ALTITUDE_MINIMA_PES || altitude >= Aeronave.ALTITUDE_MAXIMA_PES)
            return false;
        return true;
    }

}
