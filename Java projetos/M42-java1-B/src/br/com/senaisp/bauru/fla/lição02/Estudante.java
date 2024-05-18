package br.com.senaisp.bauru.fla.lição02;

public class Estudante {
	//campo das variaves fields 
	private int id;
	private String nome;
	private String documento;
	private float media;
	private boolean fumante;
	private double bolsaEestudo;
	//constructores
	//constructors sem parametro
	public Estudante() {
		id = 0;
		nome = " sem nome ";
		documento = "sem documento";
		media = 0.0f;
		fumante = false;
		bolsaEestudo = 0.0;
	}
	//constructor personalizado
	public Estudante(int id, String nome,String documento, 
			float media,double bolsa, boolean fum) {
		this.id = id;
		this.nome = nome;
		this.documento = documento;
		this.media = media;
		bolsaEestudo = bolsa;
		fumante = fum;
	}
	//gettes e stters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	public boolean isFumante() {
		return fumante;
	}
	public void setFumante(boolean fumante) {
		this.fumante = fumante;
	}
	public double getBolsaEestudo() {
		return bolsaEestudo;
	}
	public void setBolsaEestudo(double bolsaEestudo) {
		this.bolsaEestudo = bolsaEestudo;
	}
	//métodos
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:" + getId() + "\n" +
				"Nome:" + getNome() + "\n" + "Documeto:" + getDocumento() + "\n " + "Média:"
				+ getMedia() + "\n" + "Bolsa de estudo:" + getBolsaEestudo() + "\n" + "Fumante:" + isFumante();
	} 			
}
