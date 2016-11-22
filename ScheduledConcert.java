package domain;
import java.util.ArrayList;

import javax.swing.JOptionPane;





public class ScheduledConcert  extends TemplateConcert{

	protected VenueDate venuedate;
	protected ArrayList<Tickets> ticketList;
	

	protected double revenue;
	
	public ScheduledConcert(){
		super();
		this.venuedate = new VenueDate();
		this.ticketList = new ArrayList<Tickets>();
	}
	
	public ScheduledConcert(ArrayList<Composition> lC, ArrayList<Soloist> s, Conductor c, ArrayList<Accompanist> lA, VenueDate vd, ArrayList<Tickets> tL){
		super(lC,s,c, lA);
		this.venuedate = vd;
		this.ticketList = tL;
	}
	
	public void sellTicket(Tickets ticket){
		revenue += ticket.getPrice();
		boolean a = true;
		ticket.setIsSold(a);
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
		
			/**
			 * The implementation of the ArrayList of Tickets here is a little clumsy. This arraylist contains all tickets for all rows.
			 * 
			 */
			for (int i = 0; i<numberOfRows; i++){
				String numSeatsPerRowString = JOptionPane.showInputDialog("Enter the number of seats in row " + rows.get(i)+": ");
				Integer numSeatsPerRow = Integer.parseInt(numSeatsPerRowString);
				
				
				for (int j = 0; j<numSeatsPerRow;j++){
					ticketList.add(new Tickets(rows.get(i)+j));
					
				}
				
			}
			
			for (int i = 0; i< ticketList.size();i++){
				System.out.println(ticketList.get(i).getSeat()+ " price: " + ticketList.get(i).getPrice());
			}
		}catch( java.lang.NumberFormatException e){
			System.out.println("You didn't put a number");
		}
		
	}
	
	public void removeTickets (Tickets t){
		for (int i = 0; i < ticketList.size();i++){
			if (t.getSeat().equals(ticketList.get(i).getSeat())){
				ticketList.remove(i);
				break;
			}
		}
		
	}
	
	public VenueDate getVenueDate(){
		return this.venuedate;
	}
	
	public void setVenueDate(VenueDate vd){
		this.venuedate = vd;
	}
	
	/**
	 * @return the revenue
	 */
	public double getRevenue() {
		return revenue;
	}

	/**
	 * @param revenue the revenue to set
	 */
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	
	
	
	
	
	
	
	
	
}
