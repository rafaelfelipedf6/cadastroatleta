package control;
import java.util.ArrayList;
import model.*;

public class ControleAtleta {
	ArrayList<Atleta> listaAtletas;
	
	public ControleAtleta(){
		listaAtletas = new ArrayList<Atleta>();
	}
	public void adicionar(Atleta umAtleta){
		
		listaAtletas.add(umAtleta);
		
	}
	public void remover(Atleta umAtleta){
		
		listaAtletas.remove(umAtleta);
	
	}
	public Atleta buscar(String umNome){
		
		for (Atleta umAtleta: listaAtletas){
			if (umAtleta.getNome().equalsIgnoreCase(umNome)){
				return umAtleta;
			}
		}
		return null;
	}
}	
