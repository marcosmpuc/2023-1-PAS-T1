package InterfacesAdaptadoras;

import org.springframework.data.jpa.repository.JpaRepository;
import Dominio.PlanoDeVoo;
import Repository.IRepositorioPlanos;

import java.time.LocalDateTime;
import java.util.LinkedList;

@Repository
public class RepositorioPlanosJPA implements IRepositorioPlanos {
    private LinkedList<PlanoDeVoo> planoDeVoos;

    public RepositorioPlanosJPA() {
        planoDeVoos = new LinkedList<>();

        planoDeVoos.add(new PlanoDeVoo("1", "42090", "1", "1", LocalDateTime.now()));
        planoDeVoos.add(new PlanoDeVoo("2", "89056", "2", "2", LocalDateTime.now()));
        planoDeVoos.add(new PlanoDeVoo("3", "11000", "3", "3", LocalDateTime.now()));
    }

    @Override
    public LinkedList<PlanoDeVoo> todos() {return new LinkedList<>(planoDeVoos);}

    @Override
    public PlanoDeVoo getById(String id) {
        return planoDeVoos.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    };

    @Override
    public PlanoDeVoo getByMatricPiloto(String matricPiloto) {
        return planoDeVoos.stream().filter(c->(c.getMatricPiloto() == matricPiloto)).findAny().orElse(null);
    };

    @Override
    public PlanoDeVoo getByIdAeronave(String idAeronave) {
        return planoDeVoos.stream().filter(c->(c.getIdAeronave() == idAeronave)).findAny().orElse(null);
    };

    @Override
    public PlanoDeVoo getByIdAerovia(String idAerovia) {
        return planoDeVoos.stream().filter(c->(c.getIdAerovia() == idAerovia)).findAny().orElse(null);
    };

    //Ainda faltam futuras implementações
}
