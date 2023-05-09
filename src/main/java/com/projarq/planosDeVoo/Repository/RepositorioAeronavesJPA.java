package com.projarq.planosDeVoo.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.LinkedList;
import com.projarq.planosDeVoo.Dominio.Aeronave;
import com.projarq.planosDeVoo.Dominio.TipoDeAeronave;
import com.projarq.planosDeVoo.InterfacesAdaptadoras.IRepositorioAeronaves;

@Repository
public class RepositorioAeronavesJPA implements IRepositorioAeronaves {
    private LinkedList<Aeronave> aeronaves;

    public RepositorioAeronavesJPA() {
        aeronaves = new LinkedList<>();

        aeronaves.add(new Aeronave(new Long(1))
			.prefixo("PR512")
			.tipo(TipoDeAeronave.PARTICULAR_DE_PEQUENO_PORTE)
			.velocidadeDeCruzeiroKmH(700.0)
			.autonomiaKm(50.0)
	);
        aeronaves.add(new Aeronave(new Long(2))
			.prefixo("PP1050")
			.tipo(TipoDeAeronave.COMERCIAL_DE_PASSAGEIROS)
			.velocidadeDeCruzeiroKmH(1000.0)
			.autonomiaKm(100.0)
	);
        aeronaves.add(new Aeronave(new Long(3))
			.prefixo("PT13")
			.tipo(TipoDeAeronave.COMERCIAL_DE_CARGA)
			.velocidadeDeCruzeiroKmH(950.0)
			.autonomiaKm(75.0)
	);
    }

    @Override
    public LinkedList<Aeronave> todas() {
		return new LinkedList<>(aeronaves); 
	}

    @Override
    public Aeronave getById(Long id) {
        return aeronaves.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    }

    @Override
    public Aeronave getByPrefixo(String prefixo) {
        return aeronaves.stream().filter(c->(c.getPrefixo() == prefixo)).findAny().orElse(null);
    }

    @Override
    public Aeronave getByTipo(TipoDeAeronave tipo) {
        return aeronaves.stream().filter(c->(c.getTipo() == tipo)).findAny().orElse(null);
    }

	@Override
	public void deleteAll() {
		// a implementar
	}

	@Override
	public void deleteAll(LinkedList<Aeronave> aeronaves) {
		// a implementar
	}
}
