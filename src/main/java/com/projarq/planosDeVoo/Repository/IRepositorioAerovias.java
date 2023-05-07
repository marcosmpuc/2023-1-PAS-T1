package Repository;

import Dominio.Aerovias;
import java.util.List;

public interface IRepositorioAerovias extends CrudRepository<Aerovia, Long> {
    List<Aerovias> todas();
    Aerovias getById(Long id);
    Aerovias getByOrigem(String origem);
    Aerovias getByDestino(String destino);
}
