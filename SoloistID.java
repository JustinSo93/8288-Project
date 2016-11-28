package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for an accompanist.  
 * @author tyyyl
 *
 */
public class SoloistID implements ID{
/**Variables that form the ID Key.
 * @param public int soloCount
 * @param public String soloCode
 * 
 */
	private int id;
	String soloCode = "SOL";
    private static int soloCount;
/**
 * constructor that increments the ID code
 */
public SoloistID(){
this.id = soloCount++;

}
	
/**
 * get method for the soloCode
 * @return soloCode.toString
 * 
 */
	@Override
	public String createID() {
		    
				return soloCode.toString();
				}
/**
 * toString method for the ID code.
 * @return soloCount + soloCode toString.
 */
	@Override 
	public String toString(){
		
		return soloCode + id;
	}

	
}
