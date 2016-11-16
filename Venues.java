package domain;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Venues {
	private Address address;
	private int seatingCapacity;
	
	private double revenue;
	private int numberOfRows;
	private ArrayList<Tickets> venueTickets = new ArrayList<Tickets>();
	
	private PhoneNumber phoneNumber;
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
		this.seatingCapacity = seatingCapacity;
	}
	
		
	public void generateTickets ()	{
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y','Z'};
		try{
			String rownumberstring = JOptionPane.showInputDialog("Enter the number of rows in the venue");
			Integer numberOfRows = Integer.parseInt(rownumberstring);
			System.out.println("Number of rows/26: " + numberOfRows*1.0/26.0);
			double numChars = Math.ceil(numberOfRows*1.0/26.0); //Upper limit is A, AA, AAA?
			System.out.println("numChars: " + numChars);
			ArrayList<String> rows = new ArrayList<String>();
			for (int i = 0; i<numChars; i++){
				for (char alphabet = 'A'; alphabet<='Z';alphabet++){
					if (i!=0){
						String s = Character.toString(letters[i-1]);
						rows.add(s+Character.toString(alphabet));
						System.out.println("Added row: " + s+Character.toString(alphabet));
					}else{
						rows.add(Character.toString(alphabet));
						System.out.println("Added row: " + Character.toString(alphabet));
					}
					
				}
			}
			ArrayList <Tickets> rowTickets = new ArrayList<Tickets>();
			/**
			 * The implementation of the ArrayList of Tickets here is a little clumsy. This arraylist contains all tickets for all rows.
			 * 
			 */
			for (int i = 0; i<numberOfRows; i++){
				String numSeatsPerRowString = JOptionPane.showInputDialog("Enter the number of seats in row " + rows.get(i)+": ");
				Integer numSeatsPerRow = Integer.parseInt(numSeatsPerRowString);
				
				
				for (int j = 0; j<numSeatsPerRow;j++){
					rowTickets.add(new Tickets(rows.get(i)+j));
					
				}
				
			}
			for (int i = 0; i< rowTickets.size();i++){
				System.out.println(rowTickets.get(i).getSeat()+ " price: " + rowTickets.get(i).getPrice());
			}
		}catch( java.lang.NumberFormatException e){
			System.out.println("You didn't put a number");
		}
		
	}
	public void sellTicket(Tickets ticket){
		revenue += ticket.getPrice();
		boolean a = true;
		ticket.setIsSold(a);
	}
	
	
	public Address getAddress() {
		
		return this.address;
	}


	
	public void setAddress(Address address) {
		this.address = address;
		
	}
	
	

	public static void main(String[] args){
		Venues v = new Venues();
		v.generateTickets();
	}


	public void setPhoneNumber(PhoneNumber phoneNumber) {
		// TODO Auto-generated method stub
		this.phoneNumber = phoneNumber;
		
		
	}


	
	public PhoneNumber getPhoneNumber() {
		// TODO Auto-generated method stub
		return phoneNumber;
	}



	

}
