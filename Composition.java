package domain;

import java.util.ArrayList;

/**
 * This class is contains all the attributes of a composition object.
 * @author Tyler, Heesook, Justin
 * @version 1.0.0 11/26/2016
 */
public class Composition {

	/* CONSTRUCTORS -------------------------------------------------- */	
	/** Constructor Composition initializes variable.*/
	public Composition(){
		this.movement = new ArrayList<Movement>();
		this.soloist = new ArrayList<Soloist>();
		this.compositionName = "";
		this.composerName = "";
	}

	/**
	 * Constructor Composition initializes with parameter compositionName, m, s, composerName
	 * @param compositionName
	 * @param m
	 * @param s
	 * @param composerName
	 */
	public Composition (String compositionName, ArrayList<Movement> m, ArrayList<Soloist> s, String composerName){
		this.compositionName = compositionName;
		this.movement = m;
		this.soloist = s;
		this.composerName = composerName;
	}

	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * public get method that returns the composition name.
	 * @return compositionName;
	 */
	public String getCompositionName(){ return this.compositionName; }

	/**
	 * public get method that returns the movement
	 * @return movement
	 */
	public ArrayList<Movement> getListOfMovements(){ return movement;}

	/**
	 * public get method that returns the soloist
	 * @return soloist
	 */
	public ArrayList<Soloist> getListOfSoloists(){ return soloist; }

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
	public void setListOfMovements(ArrayList<Movement> movement){ this.movement = movement;}

	/**
	 * public set method that sets the soloist
	 * @param soloist
	 */
	public void setListOfSoloists(ArrayList<Soloist> soloist){ this.soloist = soloist; }

	/**
	 * public set method that sets the composerName
	 * @param composerName
	 */
	public void setComposer(String composerName){ this.composerName = composerName; }


	/* ATTRIBUTES ----------------------------------------------------- */
	/** The attribute shows compositionName as a String */
	private String compositionName;
	
	/** The attribute shows movement as ArrayList<Movement> */
	private ArrayList<Movement> movement;
	
	/** The attribute shows soloist as ArrayList<Soloist> */
	private ArrayList<Soloist> soloist;
	
	/** The attribute shows composerName as a string */
	private String composerName;

} /*	End of CLASS:	Composition.java			*/
