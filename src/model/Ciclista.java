package model;

public class Ciclista extends Atleta {
	private String marcaBike;
	private String tempoCarreira;
	private String recordCorrida;
	private int aroBike;
	private String nivel;
	
	public Ciclista(String nome,String nivel){
		super(nome);
		this.setNivel(nivel);
	}
	
	public String getMarcaBike() {
		return marcaBike;
	}
	public void setMarcaBike(String marcaBike) {
		this.marcaBike = marcaBike;
	}
	public String getTempoCarreira() {
		return tempoCarreira;
	}
	public void setTempoCarreira(String tempoCarreira) {
		this.tempoCarreira = tempoCarreira;
	}
	public String getRecordCorrida() {
		return recordCorrida;
	}
	public void setRecordCorrida(String recordCorrida) {
		this.recordCorrida = recordCorrida;
	}
	public int getAroBike() {
		return aroBike;
	}
	public void setAroBike(int aroBike) {
		this.aroBike = aroBike;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
}
