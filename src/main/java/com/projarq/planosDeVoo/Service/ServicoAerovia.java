package Service;

import Dominio.Aerovia;
import Repository.IRepositorioAeronaves;
import Repository.IRepositorioAerovias;
import Repository.IRepositorioPlanos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ServicoAerovia {

	private IRepositorioAerovias iRepositorioAerovias;

	private IRepositorioAeronaves iRepositorioAeronaves;

	private IRepositorioPlanos iRepositorioPlanos;

	public ArrayList<Integer> altitudesOcupadas(String idAerovia, LocalDateTime data) {
		return null;
	}

	public ArrayList<Integer> slotsOcupados(String idAerovia, LocalDateTime data, int altitude) {
		return null;
	}

	public boolean ocupa(String idAerovia, LocalDateTime data, int altitude, int slot) {
		return false;
	}

	public boolean libera(String idAerovia, LocalDateTime data, int altitude, int slot) {
		return false;
	}

	public boolean isOcupado(String idAerovia, LocalDateTime data, int altitude, int slot) {
		return false;
	}

	public ArrayList<Aerovia> recupera(String origem, String destino) {
		return null;
	}

}
