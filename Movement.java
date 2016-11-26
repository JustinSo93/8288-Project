package domain;

/**
 * This class is about movement of composition.
 * @author Heesook
 * @version 1.0.0 11/25/2016
 *
 */
public class Movement {
	
	/* CONSTRUCTORS -------------------------------------------------- */
	/**
	 * Constructor Movement initializes variable
	 */
	public Movement(){ this.movementName=""; }
	
	/**
	 * Constructor Movement initializes with parameter m
	 * @param m 
	 */
	public Movement(String m){ this.movementName=m; }
	
	
	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * Get the movementName
	 * @return movementName
	 */
	public String getMovementName(){ return movementName; }
	
	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * Void method setMovementName sets a String variable movementName
	 * @param movementName
	 */
	public void setMovementName(String movementName){
		this.movementName = movementName;
	}
	
	/* ATTRIBUTES ----------------------------------------------------- */
	/** The attribute shows movement name as String */
	protected String movementName;
	
} /* end of class */
