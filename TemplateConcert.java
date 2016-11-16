package domain;
import java.util.ArrayList;

public class TemplateConcert {
	
	
	
	private ArrayList<Composition> listOfCompositions;
	private ArrayList<Soloist> soloistList;
	private Conductor conductor;
	private ArrayList<Accompanist> listOfAccompanists;
	
	public TemplateConcert(){
		this.conductor = new Conductor(null,null, null, null, null, null, null, null);
		this.listOfAccompanists = new ArrayList<Accompanist>();
		this.listOfCompositions = new ArrayList<Composition>();
		this.soloistList = new ArrayList<Soloist>();
	}
	
	public TemplateConcert(ArrayList<Composition> lC, ArrayList<Soloist> s, Conductor c, ArrayList<Accompanist> lA){
		this.listOfCompositions = lC;
		this.listOfAccompanists = lA;
		this.soloistList = s;
		this.conductor = c;
	}
	public void addComposition (Composition c){
		listOfCompositions.add(c);
	}
	
	public void removeComposition(Composition c){
		for (int i =0; i<listOfCompositions.size();i++){
			if (listOfCompositions.get(i).getCompositionName() .equals(c.getCompositionName())){
				listOfCompositions.remove(i);
			}
		}
	}
	public void addSoloist(Soloist s){
		soloistList.add(s);
	}
	
	public void removeSoloist (Soloist s){
		for (int i =0; i<soloistList.size();i++){
			if (soloistList.get(i).equals(s)){
				soloistList.remove(i);
			}
		}
	}
	
	public void addAccompanist (Accompanist a){
		listOfAccompanists.add(a);
	}
	
	public void removeAccompanist (Accompanist a){
		for (int i = 0; i < listOfAccompanists.size();i++){
			if (listOfAccompanists.get(i).accompID == a.accompID){
				listOfAccompanists.remove(i);
			}
		}
	}
	
	public Conductor getConductor(){
		return this.conductor;
	}
	
	public void setConductor (Conductor c){
		this.conductor = c;
	}
	
	
	

}
