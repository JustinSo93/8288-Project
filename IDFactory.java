package symphony;

public class IDFactory {

	
	public static ID getID(String x){
		
switch(x){	
        case "M" : return (ID) new MusicianID();
		case "V" : return (ID) new VenueID();
		case "T" : return (ID) new TicketID();
		case "C" : return (ID) new CustomerID();
		      }
		return null;		
	                    }
                       }	







