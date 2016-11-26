package domain;
/**
 * This class creates a customer ID code 
 * 
 * @author Tyler Woyiwada
 *
 */
public class CustomerID implements ID {
/**
 * attributes to be used within the class
 * @param String musCode
 * @param int musCount
 */
public static int musCount;
	
	
	String musCode = "CUS";


/**
 * public get method that returns musCode to the toString method
 * @param String musCode
 */
	@Override
	public String createID() {
				return musCode.toString();
				}
/**
 * public toString method that returns a String version of the CustomerID object
 * @param String musCode
 * @param int musCount
 * @return musCode + musCount
 */
	@Override 
	public String toString(){
		musCount ++;
		return musCode + musCount;
	}
}