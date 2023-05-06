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

	public Aeronave id(String id) {
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

}
