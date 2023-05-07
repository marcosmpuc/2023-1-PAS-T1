package Dominio;

@Entity
public class Aeronave {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String prefixo;

	private TipoDeAeronave tipo;

	private double velocidadeDeCruzeiroKmH;

	private double autonomiaKm;

	public Long getId() {
		return this.id;
	}

	public String getPrefixo() {
		return this.prefixo;
	}

	public TipoDeAeronave getTipo() {
		return this.tipo;
	}

	public double getVelocidadeDeCruzeiroKmH() {
		return this.velocidadeDeCruzeiroKmH;
	}

	public double getAutonomiaKm() {
		return this.autonomiaKm;
	}

	public Aeronave id(Long id) {
		this.id = id;
		return this;
	}

	public Aeronave prefixo(String prefixo) {
		this.prefixo = prefixo;
		return this;
	}

	public Aeronave tipo(TipoDeAeronave tipo) {
		this.tipo = tipo;
		return this;
	}

	public Aeronave velocidadeDeCruzeiroKmH(double velocidadeDeCruzeiroKmH) {
		this.velocidadeDeCruzeiroKmH = velocidadeDeCruzeiroKmH;
		return this;
	}

	public Aeronave autonomiaKm (double autonomiaKm) {
		this.autonomiaKm = autonomiaKm;
		return this;
	}

	// Obrigatório para geração automática dos id's pela JPA
	protected Aeronave() {}

	@Override
	public String toString() {
		return "Aeronave [id=" + id + ", prefixo=" + prefixo + "tipo=" + tipo + "velocidade=" + velocidadeDeCruzeiroKmH + "autonomia=" +autonomiaKm + "]";

	}

}
