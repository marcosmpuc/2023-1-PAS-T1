package Service;

import Dominio.Aerovia;
import InterfacesAdaptadoras.IRepositorioAeronaves;
import InterfacesAdaptadoras.IRepositorioAerovias;
import InterfacesAdaptadoras.IRepositorioPlanos;

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
