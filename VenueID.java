package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for a Venue.  
 * @author tyyyl
 *
 */
public class VenueID implements ID{
/**Variables that form the ID Key.
 * @param public int musCount
 * @param public String musCode
 * 
 */
	private int id;
	String venCode = "VEN";
    private static int venCount;
/**
 * constructor that increments the ID code
 */
public VenueID(){
this.id = venCount++;

}
	
/**
 * get method for the musCode
 * @return musCode.toString
 * 
 */
	@Override
	public String createID() {
		    
				return venCode.toString();
				}
/**
 * toString method for the ID code.
 * @return musCount + musCode toString.
 */
	@Override 
	public String toString(){
		
		return venCode + id;
	}

	
}
