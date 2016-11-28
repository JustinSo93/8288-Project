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
		Movement m = new Movement("1st Movement");
		ArrayList<Movement> aM = new ArrayList<Movement>();
		aM.add(m);
		ArrayList<Soloist> aS = new ArrayList<Soloist>();
		Composition comp = new Composition("Enter Sandman", aM,aS,"Mozart");
		CompLastDatePlayed c = new CompLastDatePlayed(comp, new Date (12,4,2003));
		ArrayList<CompLastDatePlayed> cldplist = new ArrayList<CompLastDatePlayed>();
		cldplist.add(c);
		ArrayList<Soloist> soloists = new ArrayList<Soloist>();
		Soloist s1 = new Soloist("Ella","Fitzgerald",new PhoneNumber("0123456789"),(new Address.AddressBuilder(600, "Bank street").city("Ottawa").postalCode(new PostalCode("K1s2x4")).provinceState("ON").country("Canada").build()),"@hotmail.com","Drums","Percussion", cldplist);
		soloists.add(s1);
		Composition jingleBells = new Composition("Jingle Bells", null, soloists, "Santa Claus");
		ArrayList<Composition> compositions = new ArrayList<Composition>();
		compositions.add(jingleBells);	
		Conductor jack =  new Conductor("Jack", "Nicholson", new PhoneNumber("4747478484"),(new Address.AddressBuilder(600, "Bank street").city("Ottawa").postalCode(new PostalCode("K1s2x4")).provinceState("ON").country("Canada").build()), "jack@hotmail.com", "Baton", "Stick Group");
		Accompanist jill = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
		Accompanist jill2 = new Accompanist("Jill" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
		Soloist jill3 = new Soloist("Jill3" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind", cldplist);
		Soloist jill4 = new Soloist("Jill4" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind", cldplist);
		
		ArrayList<Accompanist> accomps = new ArrayList<Accompanist>();
		accomps.add(jill);
		Venues nac = new Venues();
		
		VenueDate christmasCarolOttawa = new VenueDate(nac, new Date(03,21,2017));
		Tickets tick001 = new Tickets(99.99, "AA55", true, null);
		ArrayList<Tickets>ticks = new ArrayList<Tickets>();
		ticks.add(tick001);
		
		ScheduledConcert aChristmasCarol = new ScheduledConcert(compositions, jack, accomps, christmasCarolOttawa, ticks);
		for (int i = 0; i < ticks.size(); i++){
		ticks.get(0).setScheduledConcert(aChristmasCarol);
		}
		
		ArrayList<ScheduledConcert> listofSC = new ArrayList<ScheduledConcert>();
		listofSC.add(aChristmasCarol);	
		jack.setScheduledConcerts(listofSC);
	season.concerts.add(aChristmasCarol);
	}
	
	        }
	
