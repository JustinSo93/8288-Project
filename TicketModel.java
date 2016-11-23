package domain;
import javax.swing.JOptionPane;

public class TicketModel {

	private double price;
	private String seat;
	private boolean isSold;
	private ScheduledConcert sC;






	/**
	 * @return the sC
	 */
	public ScheduledConcert getsC() {
		return sC;
	}


	/**
	 * @param sC the sC to set
	 */
	public void setsC(ScheduledConcert sC) {
		this.sC = sC;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if (price >0){
			this.price = price;
		}else{
			while(price<0){
				String priceString = JOptionPane.showInputDialog("Enter the price of ticket: ");
				this.price = Double.parseDouble(priceString);
			}
		}
	}
	
	public void setPrice(){
		String priceString = JOptionPane.showInputDialog("Enter the price of ticket: ");
		this.price = Double.parseDouble(priceString);
	}


	/**
	 * @return the seat
	 */
	public String getSeat() {
		return seat;
	}


	/**
	 * @param seat the seat to set
	 */
	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	

	public void setIsSold(boolean a){
		this.isSold = a;
	}
	
	public boolean getIsSold(){
		return this.isSold;
	}
}
