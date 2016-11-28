package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for an accompanist.  
 * @author tyyyl
 *
 */
public class TicketID implements ID{
/**Variables that form the ID Key.
 * @param public int musCount
 * @param public String musCode
 * 
 */
	private int id;
	String tickCode = "TIC";
    private static int tickCount;
/**
 * constructor that increments the ID code
 */
public TicketID(){
this.id = tickCount++;

}
	
/**
 * get method for the musCode
 * @return musCode.toString
 * 
 */
	@Override
	public String createID() {
		    
				return tickCode.toString();
				}
/**
 * toString method for the ID code.
 * @return musCount + musCode toString.
 */
	@Override 
	public String toString(){
		
		return tickCode + id;
	}

	
}
