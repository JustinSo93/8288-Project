package domain;
/**
 * This class creates a Ticket ID code 
 * 
 * @author Tyler Woyiwada
 *
 */
public class TicketID implements ID{
	/**
	 * attributes to be used within the class
	 * @param String tickCode
	 * @param int tickCount
	 */
	public static int tickCount = 0;
	String tickCode = "TIC";
	/**
	 * public get method that returns tickCode to the toString method
	 * @param String tickCode
	 */
	@Override
	public String createID() {

		return tickCode.toString();
	}
	/**
	 * public toString method that returns a String version of the TicketID object
	 * @param String tickCode
	 * @param int tickCount
	 * @return tickCode + tickCount
	 */
	@Override 
	public String toString(){
		tickCount++;
		return tickCode + tickCount;
	}
}


