package domain;

public class PerformedConcert extends ScheduledConcert{
	private int numberOfTicketsSold = 0;
	
	public int getNumberOfTicketsSold(){
		return this.numberOfTicketsSold;
	}
	
	public void calculate(){
		for (int i = 0; i < ticketList.size(); i++){
			if (ticketList.get(i).getIsSold()){
				numberOfTicketsSold++;
			}
		}
		
	}
	
	
	
	
}
