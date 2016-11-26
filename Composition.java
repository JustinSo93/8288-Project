
package domain;

import java.util.ArrayList;

public class Composition {
	
	private String compositionName;
	private ArrayList<Movement> movement;
	private ArrayList<Soloist> soloist;
	private String composerName;
	
	public Composition(){
		
		this.movement = new ArrayList<Movement>();
		this.soloist = new ArrayList<Soloist>();
		this.compositionName = "";
		this.composerName = "";
		
		
	}
	
	public Composition (String compositionName, ArrayList<Movement> m, ArrayList<Soloist> s, String composerName){
		this.compositionName = compositionName;
		this.movement = m;
		this.soloist = s;
		this.composerName = composerName;
	}
	
	public String getCompositionName(){
		return this.compositionName;
		
	}
	
	public void setCompositionName(String compositionName){
		this.compositionName = compositionName;
	}
	
	public ArrayList<Movement> getListOfMovements(){
		return movement;
	}
	
	
	public void setListOfMovements(ArrayList<Movement> movement){
		this.movement = movement;
	}

	public ArrayList<Soloist> getListOfSoloists(){
		return soloist;
	
		
		
	}
	
	public void setListOfSoloists(ArrayList<Soloist> soloist){
		this.soloist = soloist;
	}
	
	public String getComposer(){
		return composerName;
		
	}
	
	public void setComposer(String composerName){
		this.composerName = composerName;
	}
}
