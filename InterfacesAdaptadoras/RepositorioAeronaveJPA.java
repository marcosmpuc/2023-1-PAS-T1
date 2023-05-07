package InterfacesAdaptadoras;

//import org.springframework.data.jpa.repository.JpaRepository;
import java.util.LinkedList;
import Dominio.Aeronave;
import Dominio.TipoDeAeronave;
import Repository.IRepositorioAeronaves;

//@Repository
public class RepositorioAeronaveJPA implements IRepositorioAeronaves {
    private LinkedList<Aeronave> aeronaves;

    public RepositorioAeronaveJPA() {
        aeronaves = new LinkedList<>();

        /*                         id, prefixo, tipo, velocidadeDeCruzeiroKmH, autonomiaKm */
        aeronaves.add(new Aeronave("1", "PR512", TipoDeAeronave.PARTICULAR_DE_PEQUENO_PORTE, 700.0,50.0));
        aeronaves.add(new Aeronave("2", "PP1050", TipoDeAeronave.COMERCIAL_DE_PASSAGEIROS, 1000.0,100.0));
        aeronaves.add(new Aeronave("3", "PT13", TipoDeAeronave.COMERCIAL_DE_CARGA, 950.0,75.0));
    }

    @Override
    public LinkedList<Aeronave> todas() { return new LinkedList<>(aeronaves); }

    @Override
    public Aeronave getById(String id) {
        return aeronaves.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    }

    @Override
    public Aeronave getByPrefix(String prefixo) {
        return aeronaves.stream().filter(c->(c.getPrefixo() == prefixo)).findAny().orElse(null);
    }

    @Override
    public Aeronave getByType(TipoDeAeronave tipo) {
        return aeronaves.stream().filter(c->(c.getTipo() == tipo)).findAny().orElse(null);
    }
}
