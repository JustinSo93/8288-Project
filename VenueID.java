package symphony;

public class VenueID implements ID{

	public static int venueCount = 0;
		String venueCode = "VEN";

		@Override
		public String createID() {
					
					return venueCode.toString();
		}
		
		@Override 
		public String toString(){
			venueCount ++;
			return venueCode + venueCount;
		}
	}


