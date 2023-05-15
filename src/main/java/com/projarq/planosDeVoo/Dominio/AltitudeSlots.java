package com.projarq.planosDeVoo.Dominio;

import java.util.ArrayList;

public class AltitudeSlots {
    public int altitude;
    public ArrayList<Integer> slots;

    public int getAltitude() {
        return this.altitude;
    }

    public ArrayList<Integer> getSlots() {
        return this.slots;
    }

    public AltitudeSlots altitude(int altitude) {
        this.altitude = altitude;
        return this;
    }

    public AltitudeSlots slots(ArrayList<Integer> slots) {
        this.slots = slots;
        return this;
    }
}
