package Repository;

import Dominio.PlanoDeVoo;

import java.util.List;

public interface IRepositorioPlanos {
    List<PlanoDeVoo> todos();
    PlanoDeVoo getById(String id);
    PlanoDeVoo getByMatricPiloto(String matricPiloto);
    PlanoDeVoo getByIdAeronave(String idAeronave);
    PlanoDeVoo getByIdAerovia(String idAerovia);

}
