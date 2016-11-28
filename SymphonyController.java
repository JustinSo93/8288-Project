package domain;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;

public class SymphonyController {

	
	
	protected ArrayList<Person> symphony;
	protected ArrayList<Composition> compositions;
	protected ArrayList<Movement> movements;
	protected ArrayList<VenueDate> venueDates;
	protected ArrayList<Tickets> tickets;
	protected ArrayList<CompLastDatePlayed> compsLastDates;
	protected ArrayList<Venues>venues;
	protected ArrayList<TemplateConcert>concerts;
	ArrayList<String> nameID;
	
		
	SymphonyController(){}
	public static SymphonyController getSymphonyControllerSingletonInstance(){
		
		if(instance == null){
		   instance = new SymphonyController();
		}
		return instance;
	}
	private static SymphonyController instance = null;
	SymphonyController controller = SymphonyController.getSymphonyControllerSingletonInstance();
    
	public void buyTicket(){}
	public void searchConcertsByDate(Date x, TemplateConcert y){}
	public void searchConcertsByPerson(Person x, TemplateConcert y){}
	public void searchConcertsByTime(Time x, TemplateConcert y){}
	public void searchVenuesByDate(VenueDate x, Venues y){}
	public void removeConcert(ArrayList<ScheduledConcert> x){}
	public void viewConcertList(ArrayList<ScheduledConcert>x){}
	public void editPerson(ArrayList<Person>x){}
	public void editConcert(ArrayList<ScheduledConcert> x){}
	public void adminLogin(Person x, Login y){}
	public void venueAdminLogin(Person x, Login y){}
	public void customerLogin(Person x, Login y){}
	public void employeeLogin(Person x, Login y){}
	public void viewCustomers(ArrayList<Customer> x){}
	public void viewTicketSales(ArrayList<FinancialTransaction>x){}
	
	
	
	
	
	public void addConcert(ConcertSeason season, ScheduledConcert x)
	{
	season.concerts.add(x);
	}
	
	        }
	
