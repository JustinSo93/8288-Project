package domain;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Venues {
	protected Address address;
	protected int seatingCapacity;
	
	protected int numberOfRows;
	
	
	protected PhoneNumber phoneNumber;
	
	
	public Venues(){
		this.address = new Address();
		this.seatingCapacity = 0;
		
		this.numberOfRows = 0;
		this.venueTickets = new ArrayList<Tickets>();
	}
	
	public Venues (Address a, int s, int n, ArrayList<Tickets> v){
		this.address = a;
		this.seatingCapacity = s;
		this.numberOfRows = n;
		this.venueTickets = v;
	}
	
	/**
	 * @return the seating_capacity
	 */
	public int getseatingCapacity() {
		return seatingCapacity;
	}
	
	
	/**
	 * @param seating_capacity the seating_capacity to set
	 */
	public void setseatingCapacity(int seatingCapacity) {
		if (seatingCapacity>0)
			this.seatingCapacity = seatingCapacity;
		else{
			while(seatingCapacity <0){
				String s = JOptionPane.showInputDialog("Enter a number greater than 0");
				seatingCapacity = Integer.parseInt(s);
			}
			this.seatingCapacity = seatingCapacity;
		}
	}
	
		
	
	
	
	public Address getAddress() {
		
		return this.address;
	}


	
	public void setAddress(Address address) {
		this.address = address;
		
	}
	
	

	/**
	 * @return the seatingCapacity
	 */
	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	/**
	 * @param seatingCapacity the seatingCapacity to set
	 */
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	/**
	 * @return the numberOfRows
	 */
	public int getNumberOfRows() {
		return numberOfRows;
	}

	/**
	 * @param numberOfRows the numberOfRows to set
	 */
	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}




	/**
	 * @return the phoneNumber
	 */
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public static void main(String[] args){
		
		
	}


	






	

}

