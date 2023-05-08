package InterfacesAdaptadoras;

import org.springframework.data.repository.CrudRepository;
import Dominio.PlanoDeVoo;
import java.util.List;

public interface IRepositorioPlanos extends CrudRepository<PlanoDeVoo, Long> {
    List<PlanoDeVoo> todos();
    PlanoDeVoo getById(Long id);
    PlanoDeVoo getByMatricPiloto(Long matricPiloto);
    PlanoDeVoo getByIdAeronave(Long idAeronave);
    PlanoDeVoo getByIdAerovia(Long idAerovia);

}
