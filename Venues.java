package domain;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Venues {
	protected Address address;
	protected int seatingCapacity;
	
	protected int numberOfRows;
	protected ArrayList<Tickets> venueTickets = new ArrayList<Tickets>();
	
	protected PhoneNumber phoneNumber;
	
	
	public Venues(){
		this.address = new Address();
		this.seatingCapacity = 0;
		
		this.numberOfRows = 0;
		this.venueTickets = new ArrayList<Tickets>();
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
	
	

	public static void main(String[] args){
		Venues v = new Venues();
		
	}


	






	

}

