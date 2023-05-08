package InterfacesAdaptadoras;

import org.springframework.data.repository.CrudRepository;
import Dominio.Aerovia;
import java.util.List;

public interface IRepositorioAerovias extends CrudRepository<Aerovia, Long> {
    List<Aerovia> todas();
    Aerovia getById(Long id);
    Aerovia getByOrigem(String origem);
    Aerovia getByDestino(String destino);
}
