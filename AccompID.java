package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for an accompanist.  
 * @author tyyyl
 *
 */
public class AccompID implements ID{
/**Variables that form the ID Key.
 * @param public int musCount
 * @param public String musCode
 * 
 */
	private int id;
	String musCode = "ACC";
    private static int musCount;
/**
 * constructor that increments the ID code
 */
public AccompID(){
this.id = musCount++;

}
	
/**
 * get method for the musCode
 * @return musCode.toString
 * 
 */
	@Override
	public String createID() {
		    
				return musCode.toString();
				}
/**
 * toString method for the ID code.
 * @return musCount + musCode toString.
 */
	@Override 
	public String toString(){
		
		return musCode + id;
	}

	
}

