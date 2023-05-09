package com.projarq.planosDeVoo.Service;

import com.projarq.planosDeVoo.Dominio.Aerovia;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAeronaves;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAerovias;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioPlanos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ServicoAerovia {

	private IRepositorioAerovias iRepositorioAerovias;

	private IRepositorioAeronaves iRepositorioAeronaves;

	private IRepositorioPlanos iRepositorioPlanos;

	public ArrayList<Integer> altitudesOcupadas(Long idAerovia, LocalDateTime data) {
		return null;
	}

	public ArrayList<Integer> slotsOcupados(Long idAerovia, LocalDateTime data, int altitude) {
		return null;
	}

	public boolean ocupa(Long idAerovia, LocalDateTime data, int altitude, int slot) {
		return false;
	}

	public boolean libera(Long idAerovia, LocalDateTime data, int altitude, int slot) {
		return false;
	}

	public boolean isOcupado(Long idAerovia, LocalDateTime data, int altitude, int slot) {
		return false;
	}

	public ArrayList<Aerovia> recupera(String origem, String destino) {
		return null;
	}

}
