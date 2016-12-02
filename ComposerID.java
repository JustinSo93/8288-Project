package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for a Conductor.  
 * @author tyyyl
 *
 */
public class ComposerID implements ID{
/**Variables that form the ID Key.
 * @param public int musCount
 * @param public String musCode
 * 
 */
	private int id;
	String comCode = "COM";
    private static int musCount;
/**
 * constructor that increments the ID code
 */
public ComposerID(){
this.id = musCount++;

}
	
/**
 * get method for the musCode
 * @return musCode.toString
 * 
 */
	@Override
	public String createID() {
		    
				return comCode.toString();
				}
/**
 * toString method for the ID code.
 * @return musCount + musCode toString.
 */
	@Override 
	public String toString(){
		
		return comCode + id;
	}

	
}
