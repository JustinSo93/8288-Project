package domain;

public class VenueDate {
	private Venues venue;
	private Date date;
	
	public VenueDate(){
		this.venue = new Venues();
		this.date = new Date();
		
	}
	public VenueDate(Venues venue, Date date){
		this.venue = venue;
		this.date = date;
	}
	

	public Venues getVenue(){
		return venue;
	}
	
	public Date getDate(){
		return date;
	}
}
