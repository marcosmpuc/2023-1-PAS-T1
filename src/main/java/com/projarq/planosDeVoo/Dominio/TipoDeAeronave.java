package com.projarq.planosDeVoo.Dominio;

import java.time.LocalTime;

public enum TipoDeAeronave {

    PARTICULAR_DE_PEQUENO_PORTE (25000, 27000, null, null),
    COMERCIAL_DE_PASSAGEIROS (28000, ALTITUDE_MAXIMA_PES, null, null),
    COMERCIAL_DE_CARGA (ALTITUDE_MINIMA_PES, ALTITUDE_MAXIMA_PES, LocalTime.of(0, 0), LocalTime.of(6, 0));
    
    public static final int ALTITUDE_MINIMA_PES = 25000;
    public static final int ALTITUDE_MAXIMA_PES = 35000;

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

    void altitudeMinimaPes(int altitudeMinimaPes) {
        this.altitudeMinimaPes = altitudeMinimaPes;
    }
    void altitudeMaximaPes(int altitudeMaximaPes) {
        this.altitudeMaximaPes = altitudeMaximaPes;
    }
    void horarioMinimo(LocalTime horarioMinimo) {
        this.horarioMinimo = horarioMinimo;
    }
    void horarioMaximo(LocalTime horarioMaximo) {
        this.horarioMaximo = horarioMaximo;
    }
}
