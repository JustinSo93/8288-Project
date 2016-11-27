package domain;

/**
 * This class creates a Soloist ID code 
 * 
 * @author Tyler Woyiwada
 *
 */

public class SoloistID implements ID{
	/**
	 * attributes to be used within the class
	 * @param String soloCode
	 * @param int soloCount
	 */
	public static int soloCount = 0;
	String soloCode = "SOL";
	/**
	 * public get method that returns soloCode to the toString method
	 * @param String musCode
	 */
	@Override
	public String createID() {

		return soloCode.toString();
	}
	/**
	 * public toString method that returns a String version of the SoloistID object
	 * @param String soloCode
	 * @param int musCount
	 * @return soloCode + soloCount
	 */
	@Override 
	public String toString(){
		soloCount++;
		return soloCode + soloCount;
	}
}
