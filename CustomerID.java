package domain;

/**
 * This class creates a customer ID code 
 * 
 * @author Tyler Woyiwada
 *
 */
public class CustomerID implements ID {

	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * constructor that increments the ID code
	 */
	public CustomerID(){
		this.id = musCount++;

	}

	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
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
	 * @param int id
	 * @return musCode + id
	 */
	@Override 
	public String toString(){
	
		return musCode + id;
	}

	/* ATTRIBUTES	--------------------------------------------------	*/	
	/**
	 * attributes to be used within the class
	 * @param String musCode
	 * @param int musCount
	 * @param int id
	 */
	private static int musCount;
	public String musCode = "CUS";
	private int id;
}