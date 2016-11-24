
package domain;

import java.util.ArrayList;

public class Composition {
	
	private String compositionName;
	private ArrayList<Movement> movement;
	private ArrayList<Soloist> soloist;
	private String composerName;
	
	public Composition(){
		
		this.movement = new ArrayList<>();
		this.soloist = new ArrayList<>();
		this.compositionName="";
		this.composerName="";
		
		
	}

	
	public String getCompositionName(){
		return compositionName;
		
	}
	
	public void setCompositionName(String compositionName){
		this.compositionName = compositionName;
	}
	
	public ArrayList<Movement> getMovement(){
		return movement;
	}
	
	
	public void setMovement(ArrayList<Movement> movement){
		this.movement = movement;
	}

	public ArrayList<Soloist> getSoloist(){
		return soloist;
	
		
		
	}
	
	public void setSoloist(ArrayList<Soloist> soloist){
		this.soloist = soloist;
	}
	
	public String getComposer(){
		return composerName;
		
	}
	
	public void setComposer(String composerName){
		this.composerName = composerName;
	}
}
