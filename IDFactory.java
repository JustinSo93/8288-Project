package domain;
/**
 * This class is a factory pattern that takes in Strings based on which type of object is calling it, and delegates 
 * creating an ID to a coresponding subclass
 * 
 * @author Tyler Woyiwada
 *
 */
public class IDFactory {

	/**
	 * public method that is a switch statement that decides which type of ID to create based on input.
	 * @param String x
	 * @return null
	 */
	
	public static ID getID(String x){
		
switch(x){	
        case "A" : return (ID) new AccompID();
		case "V" : return (ID) new VenueID();
		case "T" : return (ID) new TicketID();
		case "C" : return (ID) new CustomerID();
		case "CON" : return (ID) new ConductorID();
		case "S" : return (ID) new SoloistID();
		case "ST" : return (ID) new StaffID();

		      }
		return null;		
	                    }
                       }	







