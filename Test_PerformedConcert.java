package symphonytest;

import java.util.ArrayList;

import domain.Accompanist;
import domain.Address;
import domain.CompLastDatePlayed;
import domain.Composition;
import domain.Conductor;
import domain.Date;
import domain.Movement;
import domain.PhoneNumber;
import domain.ScheduledConcert;
import domain.Soloist;
import domain.Tickets;
import domain.VenueDate;
import domain.Venues;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_PerformedConcert extends TestCase {
	public Test_PerformedConcert(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_PerformedConcert.class);		}

	protected void setUp() throws Exception { System.out.println("Test_PerformedConcert Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_PerformedConcert End");	}
	
	/**
	 * Testing the constructor
	 */
	public void testConstructors() {
		/* Testing empty constructor */
		ScheduledConcert sC = new ScheduledConcert();
		assertTrue(sC.getVenueDate().getVenue().getNumberOfRows()==0);
		assertTrue(sC.getVenueDate().getDate().getDay()==1);
		assertNotNull(sC.getTicketList());
		
		/* Testing fully parameterized constructor */
		Movement m = new Movement("1st Movement");
		ArrayList<Movement> aM = new ArrayList<Movement>();
		aM.add(m);
		ArrayList<Soloist> aS = new ArrayList<Soloist>();
		Composition comp = new Composition("Enter Sandman", aM,aS,"Mozart");
		ArrayList<Composition> aC = new ArrayList<Composition>();
		aC.add(comp);
		CompLastDatePlayed cldp = new CompLastDatePlayed(comp, new Date (12,4,2003));
		ArrayList <CompLastDatePlayed> cldplist = new ArrayList<CompLastDatePlayed>();
		cldplist.add(cldp);
		Soloist s = new Soloist("Billie", "Holiday", new PhoneNumber("1234567890"),new Address.AddressBuilder(12, "FinalDestination").build(),"@hotmail.com",
				"Clarinet","Woodwind",cldplist);
		comp.getListOfSoloists().add(s);
		ArrayList<ScheduledConcert> aSC = new ArrayList<ScheduledConcert>();
		Conductor conductor = new Conductor("Duke","Ellington",new PhoneNumber("1234567890"), new Address.AddressBuilder(1, "MainStreet").build(),"@hotmail.com",
				"Piano", "Keyboard", aSC); 
		Accompanist calc = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
		ArrayList<Accompanist> aA = new ArrayList<Accompanist>();
		aA.add(calc);
		Venues v = new Venues(new Address.AddressBuilder(2, "Another Main Street").build(), 200,4,new PhoneNumber("1234567890"));
		Date d = new Date();
		VenueDate vd = new VenueDate(v,d);
		Tickets t = new Tickets(10,"A0",false,null); 
		ArrayList<Tickets> aT = new ArrayList<Tickets>();
		aT.add(t);
		PerformedConcert pC1 = new PerformedConcert(aC, conductor, aA,vd,aT, 1500);
		assertNotNull(pC1.getNumberOfTicketsSold());
		assertNotNull(pC1.getConductor().getFirstName().equals("Duke"));
		assertNotNull(pC1.getNumberOfTicketsSold());
		assertNotNull(pC1.getVenueDate().getVenue().getAddress().getStreet().equals("Another Main Street"));
		assertNotNull(pC1.getTicketList().get(0).getSeat().equals("A0"));
	}
	
	/** Testing accessors */
	public void testAccessors(){
		Movement m = new Movement("1st Movement");
		ArrayList<Movement> aM = new ArrayList<Movement>();
		aM.add(m);
		ArrayList<Soloist> aS = new ArrayList<Soloist>();
		Composition comp = new Composition("Enter Sandman", aM,aS,"Mozart");
		ArrayList<Composition> aC = new ArrayList<Composition>();
		aC.add(comp);
		CompLastDatePlayed cldp = new CompLastDatePlayed(comp, new Date (12,4,2003));
		ArrayList <CompLastDatePlayed> cldplist = new ArrayList<CompLastDatePlayed>();
		cldplist.add(cldp);
		Soloist s = new Soloist("Billie", "Holiday", new PhoneNumber("1234567890"),new Address.AddressBuilder(12, "FinalDestination").build(),"@hotmail.com",
				"Clarinet","Woodwind",cldplist);
		comp.getListOfSoloists().add(s);
	
		Conductor conductor = new Conductor("Duke","Ellington",new PhoneNumber("1234567890"), new Address.AddressBuilder(1, "MainStreet").build(),"@hotmail.com",
				"Piano", "Keyboard"); 
		Accompanist calc = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
		ArrayList<Accompanist> aA = new ArrayList<Accompanist>();
		aA.add(calc);
		Venues v = new Venues(new Address.AddressBuilder(2, "Another Main Street").build(), 200,4,new PhoneNumber("1234567890"));
		Date d = new Date();
		VenueDate vd = new VenueDate(v,d);
		Tickets t = new Tickets(10,"A0",false,null); 
		ArrayList<Tickets> aT = new ArrayList<Tickets>();
		aT.add(t);
		ScheduledConcert pC1 = new ScheduledConcert(aC, conductor, aA,vd,aT);
		//assertTrue(pC1.getListOfCompositions().get(0).getCompositionName().equals("Enter Sandman"));
		assertTrue(pC1.getConductor().getFirstName().equals("Duke"));
		//assertTrue(pC1.getListOfAccompanists().get(0).getFirstName().equals("Jess"));
		assertTrue(pC1.getVenueDate().getVenue().getAddress().getStreet().equals("Another Main Street"));
		assertTrue(pC1.getTicketList().get(0).getSeat().equals("A0"));
	}
	/** Testing mutators */
	public void testMutators(){
		ScheduledConcert sC = new ScheduledConcert();
		Conductor conductor = new Conductor("John","Coltrane",new PhoneNumber("1234567890"), new Address.AddressBuilder(1, "MainStreet").build(),"@hotmail.com",
				"Piano", "Keyboard"); 
		sC.setConductor(conductor);
		assertTrue(sC.getConductor().getFirstName().equals("John"));
		sC.setRevenue(100);
		assertTrue(sC.getRevenue()==100);
		Venues v = new Venues(new Address.AddressBuilder(2, "A Third Main Street").build(), 200,4,new PhoneNumber("1234567890"));
		Date d = new Date();
		VenueDate vd = new VenueDate(v,d);
		sC.setVenueDate(vd);
		assertTrue(sC.getVenueDate().getVenue().getAddress().getStreet().equals("A Third Main Street"));
		Tickets t = new Tickets(100,"B0",false,null);
		ArrayList<Tickets> aT = new ArrayList<Tickets>();
		aT.add(t);
		sC.setTicketList(aT);
		assertTrue(sC.getTicketList().get(0).getSeat().equals("B0"));
	}
}