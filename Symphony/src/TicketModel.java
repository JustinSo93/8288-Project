import javax.swing.JOptionPane;

public class TicketModel {

	private double price;
	private String seat;
	private boolean isSold;






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
		this.price = price;
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
}
