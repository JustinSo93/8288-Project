package domain;
import java.util.ArrayList;

import javax.swing.JOptionPane;




/**
 * This class creates a ScheduledConcert and extends TemplateConcert
 * 
 * @author Tyler Woyiwada, Justin SO
 *
 */
public class ScheduledConcert  extends TemplateConcert {

	/* CONSTRUCTORS ----------------------------------------------------- */

	/**
	 * empty constructor
	 */
	public ScheduledConcert(){
		super();
		this.venuedate = new VenueDate();
		this.ticketList = new ArrayList<Tickets>();
	}
	/**
	 * parameterized constructor
	 * 
	 * @param lC
	 * @param c
	 * @param lA
	 * @param vd
	 * @param tL
	 */
	public ScheduledConcert(ArrayList<Composition> lC, Conductor c, ArrayList<Accompanist> lA, VenueDate vd, ArrayList<Tickets> tL){
		super(lC,c, lA);
		this.venuedate = vd;
		this.ticketList = tL;
		for (int i = 0; i<tL.size();i++){
			tL.get(i).setScheduledConcert(this);
		}
		c.ScheduledConcerts.add(this);
	}



	/* BEHAVIOURS ----------------------------------------------------- */	
	/**
	 * public method that generates the ticket based on available seating
	 * @param Array letters
	 * 
	 */
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
	
	/**
	 * public method that removes Tickets from the 
	 * @param t
	 */
	public void removeTickets (Tickets t){
		for (int i = 0; i < ticketList.size();i++){
			if (t.getSeat().equals(ticketList.get(i).getSeat())){
				ticketList.remove(i);
				break;
			}
		}

	}


	/**
	 * public get method that returns the ArrayList of Tickets
	 * @return ArrayList<Tickets> ticketlist
	 */
	public ArrayList<Tickets> getTicketList(){
		return this.ticketList;
	}
	/* ACCESSORS ----------------------------------------------------- */
	
	/**public get method that returns revenue
	 * @return double revenue
	 */
	public double getRevenue() {
		return revenue;
	}

	/**
	 * public get method that returns a VenueDate
	 * @return VenueDate venuedate
	 */
	public VenueDate getVenueDate(){
		return this.venuedate;
	}
	/**
	 * public set method that sets the value of the VenueDate object vd
	 * @param vd
	 */
	/* MUTATORS ----------------------------------------------------- */

	/**
	 * public set method that sets the value of the array of tickets
	 * 
	 * @param ArrayList<Tickets> t
	 */
	public void setTicketList(ArrayList <Tickets> t){
		this.ticketList = t;
	}

	public void setVenueDate(VenueDate vd){
		this.venuedate = vd;
	}

	/**public set method that sets the value of the double revenue
	 * @param double revenue
	 */
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	/* ATTRIBUTES ----------------------------------------------------- */

	/**
	 * attribute to be used within the class
	 * @param VenueDate venuedate
	 * @param ArrayList<Tickets> ticketList
	 * @param double revenue
	 */
	protected VenueDate venuedate;
	protected ArrayList<Tickets> ticketList;
	protected double revenue;








}