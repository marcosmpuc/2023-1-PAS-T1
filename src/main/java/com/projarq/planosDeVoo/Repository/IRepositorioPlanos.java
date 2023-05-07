package Repository;

import Dominio.PlanoDeVoo;

import java.util.List;

public interface IRepositorioPlanos extend CrudRepository<PlanoDeVoo, Long> {
    List<PlanoDeVoo> todos();
    PlanoDeVoo getById(Long id);
    PlanoDeVoo getByMatricPiloto(Long matricPiloto);
    PlanoDeVoo getByIdAeronave(Long idAeronave);
    PlanoDeVoo getByIdAerovia(Long idAerovia);

}
