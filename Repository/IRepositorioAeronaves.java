package Repository;

import Dominio.Aeronave;
import Dominio.TipoDeAeronave;

import java.util.List;

public interface IRepositorioAeronaves {
    List<Aeronave> todas();
    Aeronave getById(String id);
    Aeronave getByPrefix(String prefixo);
    Aeronave getByType(TipoDeAeronave tipo);
}
