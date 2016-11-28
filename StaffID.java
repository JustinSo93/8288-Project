package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for a Staff Member.  
 * @author tyyyl
 *
 */
public class StaffID implements ID{
/**Variables that form the ID Key.
 * @param public int soloCount
 * @param public String soloCode
 * 
 */
	private int id;
	String staffCode = "STA";
    private static int staffCount;
/**
 * constructor that increments the ID code
 */
public StaffID(){
this.id = staffCount++;

}
	
/**
 * get method for the soloCode
 * @return soloCode.toString
 * 
 */
	@Override
	public String createID() {
		    
				return staffCode.toString();
				}
/**
 * toString method for the ID code.
 * @return soloCount + soloCode toString.
 */
	@Override 
	public String toString(){
		
		return staffCode + id;
	}

	
}
