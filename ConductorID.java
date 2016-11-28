package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for a Conductor.  
 * @author tyyyl
 *
 */
public class ConductorID implements ID{
	
/* CONSTRUCTORS	--------------------------------------------------	*/
/**
 * constructor that increments the ID code
 */
public ConductorID(){
this.id = conCount++;

}
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * get method for the musCode
	 * @return musCode.toString
	 * 
	 */
	@Override
	public String createID() {
		    
				return conCode.toString();
				}
	/* HELPER METHODS	--------------------------------------------------	*/
	/**
	 * toString method for the ID code.
	 * @return musCount + musCode toString.
	 */
	@Override 
	public String toString(){
		
		return conCode + id;
	}
	
/* ATTRIBUTES	-----------------------------------------------------	*/
/**Variables that form the ID Key.
 * @param public int musCount
 * @param public String musCode
 * 
 */
	private int id;
	private String conCode = "CON";
    	private static int conCount;
	
}
