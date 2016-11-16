package domain;

import java.util.ArrayList;

public class ConcertSeason {
	
	private ArrayList<VenueDate> venuedate = new ArrayList<VenueDate>();
	
	public class VenueDate{
		private Venues venue;
		private Date date;
		
		public VenueDate(Venues venue, Date date){
			this.venue = venue;
			this.date = date;
		}
		
		public String toString(){
			return venue+" "+date;
		}
		public Venues getVenue(){
			return venue;
		}
		
		public Date getDate(){
			return date;
		}
		
	}
	
	public void addVenueDate(Venues v, Date d){
		VenueDate vd = new VenueDate(v,d);
		venuedate.add(vd);
	}
	
	public void removeVenueDate(Venues v, Date d){
		for (int i = 0 ; i < venuedate.size(); i++){
			if (venuedate.get(i).getVenue().equals(v)&& venuedate.get(i).getDate()==d){
				venuedate.remove(i);
				System.out.println("Venue+date removed");
			}
		}
		
	}
	
	public void printVenueDates(){
		for (int i = 0; i<venuedate.size();i++){
			System.out.println(venuedate.get(i).toString());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}