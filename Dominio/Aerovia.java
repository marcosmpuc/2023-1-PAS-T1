package Dominio;

public class Aerovia {

	private String id;

	private String origem;

	private String destino;

	private double tamanho;

	private int altura;

	public String getId() {
		return this.id;
	}

	public String getOrigem() {
		return this.origem;
	}

	public String getDestino() {
		return this.destino;
	}

	public double getTamanho() {
		return this.tamanho;
	}

	public int getAltura() {
		return this.altura;
	}

	public Aerovia id(String id) {
		this.id = id;
		return this;
	}

	public Aerovia origem(String origem) {
		this.origem = origem;
		return this;
	}

	public Aerovia destino(String destino) {
		this.destino = destino;
		return this;
	}

	public Aerovia tamanho(double tamanho) {
		this.tamanho = tamanho;
		return this;
	}

	public Aerovia altura(int altura) {
		this.altura = altura;
		return this;
	}
}
