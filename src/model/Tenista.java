package model;

public class Tenista extends Atleta{
	private String modelTaco;
	private String marcaBolas;
	private String campoPreferido;
	private String nivel;
	
	public Tenista(String nome,String nivel){
		super(nome);
		this.setNivel(nivel);
	}
	
	
	public String getModelTaco() {
		return modelTaco;
	}
	public void setModelTaco(String modelTaco) {
		this.modelTaco = modelTaco;
	}
	public String getMarcaBolas() {
		return marcaBolas;
	}
	public void setMarcaBolas(String marcaBolas) {
		this.marcaBolas = marcaBolas;
	}
	public String getCampoPreferido() {
		return campoPreferido;
	}
	public void setCampoPreferido(String campoPreferido) {
		this.campoPreferido = campoPreferido;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
