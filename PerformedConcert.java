package domain;

import java.util.ArrayList;

/**
 * 
 * PerformedConcert extends ScheduledConcert. 
 *
 */
public class PerformedConcert extends ScheduledConcert{
	
	
	/* CONSTRUCTORS -------------------------------------------------- */
	/** Empty Constructor */
	public PerformedConcert(){
		super();
		this.numberOfTicketsSold = 0;
	}
	
	/** Fully parameterized constructor */
	public PerformedConcert(ArrayList<Composition> lC, Conductor c, ArrayList<Accompanist> lA, VenueDate vd, ArrayList<Tickets> tL, int numTicketsSold){
		super( lC,  c,  lA,  vd,  tL);
		this.numberOfTicketsSold = numTicketsSold;
	}
	
	/* ACCESSORS ----------------------------------------------------- */
	/** Returns the numberOfTicketsSold */
	public int getNumberOfTicketsSold(){
		return this.numberOfTicketsSold;
	}
	
	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * @param numberOfTicketsSold the numberOfTicketsSold to set
	 */
	public void setNumberOfTicketsSold(int numberOfTicketsSold) {
		this.numberOfTicketsSold = numberOfTicketsSold;
	}
	
	
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/** Calculates the number of tickets sold based on its list of tickets and how many have been set to sold */
	public void calculate(){
		for (int i = 0; i < ticketList.size(); i++){
			if (ticketList.get(i).getIsSold()){
				numberOfTicketsSold++;
			}
		}
		
	}
	
	/* ATTRIBUTES ----------------------------------------------------- */
	/** numberOfTicketsSold is of type int*/
	private int numberOfTicketsSold;
	
	
	
	
}
