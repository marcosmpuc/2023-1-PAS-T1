package InterfacesAdaptadoras;

import org.springframework.data.repository.CrudRepository;
import Dominio.Aeronave;
import Dominio.TipoDeAeronave;

import java.util.List;

public interface IRepositorioAeronaves extends CrudRepository<Aeronave, Long> {
    List<Aeronave> todas();
    Aeronave getById(Long id);
    Aeronave getByPrefixo(String prefixo);
    Aeronave getByTipo(TipoDeAeronave tipo);
}
