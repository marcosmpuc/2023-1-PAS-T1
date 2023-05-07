package Repository;

import Dominio.Aerovias;
import java.util.List;

public interface IRepositorioAerovias {
    List <Aerovias>todas();
    Aerovias getById(String id);
    Aerovias getByOrigem(String origem);
    Aerovias getByDestino(String destino);
}
