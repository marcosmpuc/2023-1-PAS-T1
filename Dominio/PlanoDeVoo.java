package Dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PlanoDeVoo {

	private String id;

	private String matricPiloto;

	private String idAeronave;

	private String idAerovia;

	private LocalDateTime dataHorarioDeInicio;

	private ArrayList<Integer> slots;

	private boolean cancelado;

	public String getId() {
		return this.id;
	}

	public void setMatricPiloto(String matricPiloto) {
		this.matricPiloto = matricPiloto;
	}

	public String getMatricPiloto() {
		return this.matricPiloto;
	}

	public void setIdAeronave(String idAeronave) {
		this.idAeronave = idAeronave;
	}

	public String getIdAeronave() {
		return this.idAeronave;
	}

	public void setIdAerovia(String idAerovia) {
		this.idAerovia = idAerovia;
	}

	public String getIdAerovia() {
		return this.idAerovia;
	}

	public void setDataDeInicio(LocalDateTime dataHorarioDeInicio) {
		this.dataHorarioDeInicio = dataHorarioDeInicio;
	}

	public LocalDateTime getDataHorarioDeInicio() {
		return this.dataHorarioDeInicio;
	}

	public void setSlots(ArrayList<Integer> slots) {
		this.slots = slots;
	}

	public ArrayList<Integer> getSlots() {
		return this.slots;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	public boolean getCancelado() {
		return this.cancelado;
	}

}
