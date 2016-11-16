package domain;

import java.util.ArrayList;

public class Composition {
	private int id;
	private String compositionName;
	private ArrayList<Movement> movement;
	private ArrayList<Soloist> soloist;
	private Composer composer;
	
	public Composition(){
		
		movement = new ArrayList<>();
		soloist = new ArrayList<>();
		
	}
	public int getId(){
		return id;
		
	}
	
	public void setId(int id){
		this.id = id;
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
	
	public Composer getComposer(){
		return composer;
		
	}
	
	public void setComposer(Composer composer){
		this.composer = composer;
	}
}
