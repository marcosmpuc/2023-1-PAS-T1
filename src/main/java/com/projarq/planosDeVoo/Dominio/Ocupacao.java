package com.projarq.planosDeVoo.Dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.time.LocalDateTime;

@Entity
public class Ocupacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long idAerovia;
	private ArrayList<Integer> slots;
	private LocalDateTime dataHorarioInicio;
	private LocalDateTime dataHorarioFim;

	public Ocupacao idAerovia(Long idAerovia) {
		this.idAerovia = idAerovia;
		return this;
	}

	public Ocupacao dataHorarioInicio(LocalDateTime dataHorarioInicio) {
		this.dataHorarioInicio = dataHorarioInicio;

		if (dataHorarioFim != null)
			calcularSlots();

		return this;
	}

	public Ocupacao dataHorarioFim(LocalDateTime dataHorarioFim) {
		this.dataHorarioFim = dataHorarioFim;

		if (dataHorarioInicio != null)
			calcularSlots();

		return this;
	}

	private void calcularSlots() {
		int hora = dataHorarioInicio.getHour();
		while (hora < dataHorarioFim.getHour()) {
			slots.add(hora);
			hora++;
		}
		if (dataHorarioFim.getMinute() > 0)
			slots.add(dataHorarioFim.getHour());
	}
	
	// Obrigatório para geração automática dos id's pela JPA
	protected Ocupacao() {}
}