package domain;

import java.util.ArrayList;

/**This class is contains all the attributes of a composition object.
 * @author Tyler, Heesook
 *
 */
public class Composition {

	/* CONSTRUCTORS -------------------------------------------------- */
	/**
	 * Constructor Composition initializes variable
	 * @param movement
	 * @param soloist
	 */
	public Composition(){
		movement = new ArrayList<>();
		soloist = new ArrayList<>();
	}

	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * public get method that returns the composition name.
	 * @return compositionName;
	 */
	public String getCompositionName(){ return compositionName; }
	
	/**
	 * public get method that returns the movement
	 * @return movement
	 */
	public ArrayList<Movement> getMovement(){ return movement; }
	
	/**
	 * public get method that returns the soloist
	 * @return soloist
	 */
	public ArrayList<Soloist> getSoloist(){ return soloist; }
	
	/**
	 * public get method that returns the composerName
	 * @return String composerName
	 */
	public String getComposer(){ return composerName; }
	
	
	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * public set method that sets the compositionName
	 * @param compositionName
	 */
	public void setCompositionName(String compositionName){ this.compositionName = compositionName; }
	
	/**
	 * public set method that sets the movements.
	 * @param movement
	 */
	public void setMovement(ArrayList<Movement> movement){ this.movement = movement; }
	
	/**
	 * public set method that sets the soloist
	 * @param soloist
	 */
	public void setSoloist(ArrayList<Soloist> soloist){ this.soloist = soloist; }

	/**
	 * public set method that sets the composerName
	 * @param composerName
	 */
	public void setComposer(String composerName){ this.composerName = composerName; }
	
	
	/* ATTRIBUTES ----------------------------------------------------- */
	/**
	 * attributes of the composition class.
	 * @param String compositionName
	 * @param ArrayList<Movement> movements;
	 * @param ArrayList<Soloist> movements;
	 * @param String composerName;
	 */
	private String compositionName;
	private ArrayList<Movement> movement;
	private ArrayList<Soloist> soloist;
	private String composerName;
}
