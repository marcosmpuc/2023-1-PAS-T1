package com.projarq.planosDeVoo.Dominio;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Entity
public class PlanoDeVoo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long matricPiloto;
	private Long idAeronave;
	private Long idAerovia;
	private LocalDateTime dataHorarioDeInicio;
	private LocalDateTime dataHorarioFim;
	private boolean cancelado;
	//altitude min 2500 max 35000
	private int altitude;

	public PlanoDeVoo(String s, String s1, String s2, String s3, LocalDateTime now,LocalDateTime dataHorarioFinal,boolean cancelado) {
	}

	public Long getId() {
		return this.id;
	}

	public void setMatricPiloto(Long matricPiloto) {
		this.matricPiloto = matricPiloto;
	}

	public Long getMatricPiloto() {
		return this.matricPiloto;
	}

	public void setIdAeronave(Long idAeronave) {
		this.idAeronave = idAeronave;
	}

	public Long getIdAeronave() {
		return this.idAeronave;
	}

	public void setIdAerovia(Long idAerovia) {
		this.idAerovia = idAerovia;
	}

	public Long getIdAerovia() {
		return this.idAerovia;
	}

	public LocalDateTime getHorarioDeEncerramento(){
		return this.dataHorarioFim;
	}

	public void setDataDeInicio(LocalDateTime dataHorarioDeInicio) {
		this.dataHorarioDeInicio = dataHorarioDeInicio;
	}

	public LocalDateTime getDataHorarioDeInicio() {
		return this.dataHorarioDeInicio;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	public boolean getCancelado() {
		return this.cancelado;
	}

	public PlanoDeVoo(Long id) {
		this.id = id;
	}

	public PlanoDeVoo id(Long id) {
		this.id = id;
		return this;
	}

	public PlanoDeVoo matricPiloto(Long matricPiloto) {
		this.matricPiloto = matricPiloto;
		return this;
	}

	public PlanoDeVoo idAeronave(Long idAeronave) {
		this.idAeronave = idAeronave;
		return this;
	}

	public PlanoDeVoo idAerovia(Long idAerovia) {
		this.idAerovia = idAerovia;
		return this;
	}

	public PlanoDeVoo dataHorarioDeInicio(LocalDateTime dataHorarioDeInicio) {
		this.dataHorarioDeInicio = dataHorarioDeInicio;
		return this;
	}

	public PlanoDeVoo cancDeVoo(boolean cancelado){
		this.cancelado= cancelado;
		return this;
	}

	// Obrigatório para geração automática dos id's pela JPA
	protected PlanoDeVoo() {}
}


