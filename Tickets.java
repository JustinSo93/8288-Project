package domain;

import javax.swing.JOptionPane;

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
	
	public Tickets (double price, String seat, boolean isSold, ScheduledConcert sC){
		ticketmodel = new TicketModel();
		ticketmodel.setPrice(price);
		ticketmodel.setSeat(seat);
		ticketmodel.setIsSold(isSold);
		ticketmodel.setsC(sC);
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
		if (price > 0){
			ticketmodel.setPrice(price);
		}else{
			while(price<0){
				String s = JOptionPane.showInputDialog("Error: Enter a price greater than $0");
				price = Integer.parseInt(s);
			}
			ticketmodel.setPrice(price);
		}
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
	
	public boolean getIsSold(){
		return ticketmodel.getIsSold();
	}
	
	public ScheduledConcert getScheduledConcert(){
		return ticketmodel.getsC();
	}
	
	public void setScheduledConcert (ScheduledConcert sC){
		ticketmodel.setsC(sC);
	}



	

}
