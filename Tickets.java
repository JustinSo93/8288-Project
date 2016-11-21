package domain;

public class Tickets {
	
private TicketModel ticketmodel;

	public Tickets(){
		ticketmodel = new TicketModel();
		ticketmodel.setPrice();
	}
	
	public Tickets (String seat){
		ticketmodel = new TicketModel();
		ticketmodel.setSeat(seat);
		ticketmodel.setPrice();
			}
	
	/**
	 * @return the price
	 */
	public double getPrice() {
		return ticketmodel.getPrice();
	}
	
	
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		ticketmodel.setPrice(price);
	}
	
	public void setPrice(){
		ticketmodel.setPrice();
	}
	
	
	/**
	 * @return the seat
	 */
	public String getSeat() {
		return ticketmodel.getSeat();
	}
	
	
	/**
	 * @param seat the seat to set
	 */
	public void setSeat(String seat) {
		ticketmodel.setSeat(seat);
	}
	
	public void setIsSold(boolean a){
		ticketmodel.setIsSold(a);
	}
}
