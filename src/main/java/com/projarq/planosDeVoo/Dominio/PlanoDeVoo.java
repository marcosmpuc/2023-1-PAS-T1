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
	private ArrayList<Integer> slots;

	public PlanoDeVoo(Long string, Long string2, Long string3, Long string4, LocalDateTime dataHorarioDeInicio,LocalDateTime dataHorarioFim, boolean cancelado, Long altitude) {
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

	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	public int getAltitude() {
		return this.altitude;
	}

	public void setSlots(ArrayList<Integer> slots) {
		this.slots = slots;
	}

	public ArrayList<Integer> getSlots() {
		return this.slots;
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

	public PlanoDeVoo cancDeVoo(boolean cancelado) {
		this.cancelado = cancelado;
		return this;
	}

	public PlanoDeVoo altitude(int altitude) {
		if (altitude < 25000 || altitude > 35000)
			throw new IllegalArgumentException("Valor inválido");
		this.altitude = altitude;
		return this;
	}

	public PlanoDeVoo slots(ArrayList<Integer> slots) {
		for (Integer slot: slots)
			if (slot < 0 || slot > 23)
				return null;
		this.slots = slots;
		return this;
	}

	public boolean verificarSeSlotsConflitam(ArrayList<Integer> slots) {
		return verificarSeSlotsConflitam(this.slots, slots);
	}

	public boolean verificarSeSlotsConflitam(ArrayList<Integer> slots1, ArrayList<Integer> slots2) {
		for (Integer slot1: slots1)
			for (Integer slot2: slots2)
				if (slot1 == slot2)
					return true;
		return false;
	}

	// Obrigatório para geração automática dos id's pela JPA
	protected PlanoDeVoo() {}
}