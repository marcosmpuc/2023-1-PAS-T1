package com.projarq.planosDeVoo.Dominio;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aeronave {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String prefixo;
	private TipoDeAeronave tipo;
	private double velocidadeDeCruzeiroKmH;
	private double autonomiaKm;
	private ArrayList<Integer> altitudesValidas;
    public static final int ALTITUDE_MINIMA_PES = 25000;
    public static final int ALTITUDE_MAXIMA_PES = 35000;

	public Aeronave(String s, String pr512, TipoDeAeronave particularDePequenoPorte, double v, double v1) {
	}

	public Long getId() {
		return this.id;
	}

	public String getPrefixo() {
		return this.prefixo;
	}

	public TipoDeAeronave getTipo() {
		return this.tipo;
	}

	public double getVelocidadeDeCruzeiroKmH() {
		return this.velocidadeDeCruzeiroKmH;
	}

	public double getAutonomiaKm() {
		return this.autonomiaKm;
	}

	public ArrayList<Integer> getAltitudesValidas() {
		return this.altitudesValidas;
	}

	public Aeronave(Long id) {
		this.id = id;
	}

	public Aeronave id(Long id) {
		this.id = id;
		return this;
	}

	public Aeronave prefixo(String prefixo) {
		this.prefixo = prefixo;
		return this;
	}

	public Aeronave tipo(TipoDeAeronave tipo) {
		this.tipo = tipo;
		return this;
	}

	public Aeronave velocidadeDeCruzeiroKmH(double velocidadeDeCruzeiroKmH) {
		this.velocidadeDeCruzeiroKmH = velocidadeDeCruzeiroKmH;
		return this;
	}

	public Aeronave autonomiaKm(double autonomiaKm) {
		this.autonomiaKm = autonomiaKm;
		return this;
	}

	public ArrayList<Integer> obterAltitudesValidas() {
		ArrayList<Integer> altitudes = new ArrayList<>();
		for (int altitude = this.tipo.altitudeMinimaPes; altitude < this.tipo.altitudeMaximaPes; altitude += 1000)
			altitudes.add(altitude);
		return altitudes;
	}

	// Obrigatório para geração automática dos id's pela JPA
	protected Aeronave() {}

	@Override
	public String toString() {
		return "Aeronave [id=" + id + ", prefixo=" + prefixo + "tipo=" + tipo + "velocidade=" + velocidadeDeCruzeiroKmH + "autonomia=" +autonomiaKm + "]";

	}

}
