package InterfacesAdaptadoras;

import java.util.LinkedList;
import Dominio.Aerovias;
import Repository.IRepositorioAerovias;

@Repository
public class RepositorioAeroviasJPA implements IRepositorioAerovias {
    private List<Aerovia> aerovias;

    public RepositorioAeroviasJPA(){
        aerovias = new LinkedList<>();

        // id, origem, destino, tamanho, altura
        aerovias.add(new Aerovia("1", "Porto Alegre","São Paulo", 27.098, 70 ));
        aerovias.add(new Aerovia("2", "Rio de Janeiro","Porto Alegre", 67.341, 56 ));
        aerovias.add(new Aerovia("3", "São Paulo","Salvador", 89.216, 47 ));
    }

    @Override
    public List<aerovias> todas(){return new ArrayList<>(aerovias);}

    @Override
    public Aerovia getById(String id){
        return aerovias.stream().filter(c->(c.getId() == id)).findAny().orElse(null);
    }

    @Override
    public Aerovia getByOrigem(String origem){
        return aerovias.stream().filter(c->c.getByOrigem().equals(origem)).findAny().orElse(null);
    }

    @Override
    public Aerovia getByDestino(String destino){
        return aerovias.stream().filter(c->c.getByDestino().equals(destino)).findAny().orElse(null);
    }


}
