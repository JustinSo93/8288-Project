

package domain;

import java.util.ArrayList;

/**This class is contains all the attributes of a composition object.
 * @author Tyler Woyiwada
 *
 */
public class Composition {
	
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
	/**
	 * constructor
	 * @param movement
	 * @param soloist
	 */
	public Composition(){
		
		movement = new ArrayList<>();
		soloist = new ArrayList<>();
		
	}

	/**
	 * public get method that returns the composition name.
	 * @return compositionName;
	 */
	public String getCompositionName(){
		return compositionName;
		
	}
	/**
	 * public set method that sets the compositionName
	 * @param compositionName
	 */
	public void setCompositionName(String compositionName){
		this.compositionName = compositionName;
	}
	/**
	 * public get method that returns the movement
	 * @return movement
	 */
	public ArrayList<Movement> getMovement(){
		return movement;
	}
	
	/**
	 * public set method that sets the movements.
	 * @param movement
	 */
	public void setMovement(ArrayList<Movement> movement){
		this.movement = movement;
	}
    /**
     * public get method that returns the soloist
     * @return soloist
     */
	public ArrayList<Soloist> getSoloist(){
		return soloist;
	
		
		
	}
	/**
	 * public set method that sets the soloist
	 * @param soloist
	 */
	public void setSoloist(ArrayList<Soloist> soloist){
		this.soloist = soloist;
	}
	/**
	 * public get method that returns the composerName
	 * @return String composerName
	 */
	
	public String getComposer(){
		return composerName;
		
	}
	/**
	 * public set method that sets the composerName
	 * @param composerName
	 */
	public void setComposer(String composerName){
		this.composerName = composerName;
	}
}