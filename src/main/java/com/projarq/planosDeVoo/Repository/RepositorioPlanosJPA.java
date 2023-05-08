package Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import Dominio.PlanoDeVoo;
import InterfacesAdaptadoras.IRepositorioPlanos;

import java.time.LocalDateTime;
import java.util.LinkedList;

@Repository
public class RepositorioPlanosJPA implements IRepositorioPlanos {
    private LinkedList<PlanoDeVoo> planosDeVoo;

    public RepositorioPlanosJPA() {
        planosDeVoo = new LinkedList<>();

        planosDeVoo.add(new PlanoDeVoo(new Long(1))
				.matricPiloto(new Long(42090))
				.idAeronave(new Long(1))
				.idAerovia(new Long(1))
				.dataHorarioDeInicio(LocalDateTime.now())
	);
        planosDeVoo.add(new PlanoDeVoo(new Long(2))
				.matricPiloto(new Long(89056))
				.idAeronave(new Long(2))
				.idAerovia(new Long(2))
				.dataHorarioDeInicio(LocalDateTime.now())
	);
        planosDeVoo.add(new PlanoDeVoo(new Long(3))
				.matricPiloto(new Long(11000))
				.idAeronave(new Long(3))
				.idAerovia(new Long(3))
				.dataHorarioDeInicio(LocalDateTime.now())
	);
    }

    @Override
    public LinkedList<PlanoDeVoo> todos() {
	return new LinkedList<>(planosDeVoo);
	}

    @Override
    public PlanoDeVoo getById(Long id) {
        return planosDeVoo.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByMatricPiloto(Long matricPiloto) {
        return planosDeVoo.stream().filter(c->(c.getMatricPiloto() == matricPiloto)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByIdAeronave(Long idAeronave) {
        return planosDeVoo.stream().filter(c->(c.getIdAeronave() == idAeronave)).findAny().orElse(null);
    }

    @Override
    public PlanoDeVoo getByIdAerovia(Long idAerovia) {
        return planosDeVoo.stream().filter(c->(c.getIdAerovia() == idAerovia)).findAny().orElse(null);
    }

	@Override
	public void deleteAll() {
		// a implementar
	}

	@Override
	public void deleteAll(LinkedList<PlanoDeVoo> planos) {
		// a implementar
	}

    //Ainda faltam futuras implementações
}
