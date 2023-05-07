package Repository;

import Dominio.Aeronave;
import Dominio.TipoDeAeronave;

import java.util.List;

public interface IRepositorioAeronaves extends CrudRepository<Aeronave, Long> {
    List<Aeronave> todas();
    Aeronave getById(Long id);
    Aeronave getByPrefix(Long prefixo);
    Aeronave getByType(TipoDeAeronave tipo);
}
