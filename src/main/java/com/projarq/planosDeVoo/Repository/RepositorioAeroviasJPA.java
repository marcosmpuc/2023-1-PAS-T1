package Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.LinkedList;
import Dominio.Aerovia;
import InterfacesAdaptadoras.IRepositorioAerovias;

@Repository
public class RepositorioAeroviasJPA implements IRepositorioAerovias {
    private LinkedList<Aerovia> aerovias;

    public RepositorioAeroviasJPA() {
        aerovias = new LinkedList<>();

        aerovias.add(new Aerovia(new Long(1))
			.origem("Porto Alegre")
			.destino("São Paulo")
			.tamanho(27.098)
			.altura(70)
	);
        aerovias.add(new Aerovia(new Long(2))
			.origem("Rio de Janeiro")
			.destino("Porto Alegre")
			.tamanho(67.341)
			.altura(56)
	);
        aerovias.add(new Aerovia(new Long(3))
			.origem("São Paulo")
			.destino("Salvador")
			.tamanho(89.216)
			.altura(47)
	);
    }

    @Override
	public LinkedList<Aerovia> todas() {
		return new LinkedList<>(aerovias);
	}

    @Override
    public Aerovia getById(Long id) {
        return aerovias.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    }

    @Override
    public Aerovia getByOrigem(String origem) {
        return aerovias.stream().filter(c->c.getOrigem().equals(origem)).findAny().orElse(null);
    }

    @Override
    public Aerovia getByDestino(String destino) {
        return aerovias.stream().filter(c->c.getDestino().equals(destino)).findAny().orElse(null);
    }

	@Override
	public void deleteAll() {
		// a implementar
	}

	@Override
	public void deleteAll(LinkedList<Aerovia> aerovias) {
		// a implementar
	}
}
