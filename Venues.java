package domain;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Venues {
	
	
	/* CONSTRUCTORS	--------------------------------------------------	*/
	public Venues(){
		this.address = new Address();
		this.seatingCapacity = 0;
		this.phoneNumber = new PhoneNumber("0000000000");
		this.numberOfRows = 0;
	
	}
	
	public Venues (Address a, int s, int n, PhoneNumber p){
		this.address = a;
		this.seatingCapacity = s;
		this.numberOfRows = n;
		this.phoneNumber = p;

	}
	

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * 
	 * @returns the address
	 */
	public Address getAddress() {
			
			return this.address;
		}
	
	/**
	 * @return the seatingCapacity
	 */
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	
	/**
	 * @return the numberOfRows
	 */
	public int getNumberOfRows() {
		return numberOfRows;
	}
	
	/**
	 * @return the phoneNumber
	 */
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

/* MODIFIERS	-----------------------------------------------------	*/

	/**
	 * @param seating_capacity the seating_capacity to set
	 */
	public void setSeatingCapacity(int seatingCapacity) {
		if (seatingCapacity>this.numberOfRows)
			this.seatingCapacity = seatingCapacity;
		else{
			while(seatingCapacity < this.numberOfRows){
				String s = JOptionPane.showInputDialog("Enter a number greater than 0");
				seatingCapacity = Integer.parseInt(s);
			}
			this.seatingCapacity = seatingCapacity;
		}
	}
	
	
	/**
	 * Void method which sets the address
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
		
	}


	/**
	 * @param numberOfRows the numberOfRows to set
	 */
	public void setNumberOfRows(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}






	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/
	/** address is of type Address */
	protected Address address;
	/**seatingCapacity is an integer used to denote the maximum numver of tickets for ScheduledConcert using this venue */
	protected int seatingCapacity;
	/** numberOfRows is an integer used to denote the number of rows in the venue */
	protected int numberOfRows;
	/** phoneNumber is of type PhoneNumber */
	
	protected PhoneNumber phoneNumber;

	






	

}


