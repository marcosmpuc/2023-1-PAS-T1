package Dominio;

public class Aeronave {

	private String id;

	private String prefixo;

	private TipoDeAeronave tipo;

	private double velocidadeDeCruzeiroKmH;

	private double autonomiaKm;

	public String getId() {
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

	public Aeronave	(String id, String prefixo, TipoDeAeronave tipo, double velocidadeDeCruzeiroKmH, double autonomiaKm) {
		this.id = id;
		this.prefixo = prefixo;
		this.tipo = tipo;
		this.velocidadeDeCruzeiroKmH = velocidadeDeCruzeiroKmH;
		this.autonomiaKm = autonomiaKm;
	}

	@Override
	public String toString() {
		return "Aeronave [id=" + id + ", prefixo=" + prefixo + "tipo=" + tipo + "velocidade=" + velocidadeDeCruzeiroKmH + "autonomia=" +autonomiaKm + "]";

	}

}
