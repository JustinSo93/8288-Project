package domain;

public class IDFactory {

	
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







