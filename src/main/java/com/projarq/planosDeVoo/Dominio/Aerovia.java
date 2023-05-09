package com.projarq.planosDeVoo.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aerovia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String origem;

	private String destino;

	private double tamanho;

	private int altura;

	public Long getId() {
		return this.id;
	}

	public String getOrigem() {
		return this.origem;
	}

	public String getDestino() {
		return this.destino;
	}

	public double getTamanho() {
		return this.tamanho;
	}

	public int getAltura() {
		return this.altura;
	}

	public Aerovia(Long id) {
		this.id = id;
	}

	public Aerovia id(Long id) {
		this.id = id;
		return this;
	}

	public Aerovia origem(String origem) {
		this.origem = origem;
		return this;
	}

	public Aerovia destino(String destino) {
		this.destino = destino;
		return this;
	}

	public Aerovia tamanho(double tamanho) {
		this.tamanho = tamanho;
		return this;
	}

	public Aerovia altura(int altura) {
		this.altura = altura;
		return this;
	}

	// Obrigatório para geração automática dos id's pela JPA
	protected Aerovia() {}
}
