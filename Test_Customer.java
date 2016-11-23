package symphonytest;

import java.util.ArrayList;

import domain.Address;
import domain.Customer;
import domain.PhoneNumber;
import domain.ScheduledConcert;
import domain.Tickets;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class Test_Customer extends TestCase{
	
	public static Test suite() { return new TestSuite(Test_Customer.class);		}
	
	
	protected void setUp() throws Exception { System.out.println("Test_Customer Begin");	}
	
	protected void tearDown() throws Exception { System.out.println("Test_Customer End");	}
	
	
	public void testConstructors(){
		System.out.println("\tExecuting Test_Customers.testConstructors");
		Customer c = new Customer();
		assertNotNull("\t\tTest_Customer.testConstructors: Customer is not null", c);
		
		Customer c1 = new Customer ("Sylvia", "Plath", new PhoneNumber("6131234567"), new Address.AddressBuilder(22, "Sussex").build(), "SylviaPlath@hotmail.com");
		assertTrue("Customer's first name is Sylvia", c1.getFirstName().equals("Sylvia"));
		assertTrue("Customer's last name is Plath", c1.getLastName().equals("Plath"));
		assertTrue("Customer's phone number is (613) 123-4567", "(613) 123-4567".equals(c1.getphoneNumber().toString()) );
		assertTrue("Customer's email address is SylviaPlath@hotmail.com", "SylviaPlath@hotmail.com".equals(c1.getEmailAddress()));
	}
	
	public void testBehaviour(){
		System.out.println("\tExecuting Test_Customer.testBehaviour");
		
		System.out.println("\tTesting createPurchase");
		Customer c = new Customer();
		ScheduledConcert sC = new ScheduledConcert();
		Tickets t1 = new Tickets(100,"A00", false,sC);
		Tickets t2 = new Tickets(300,"A01", false, sC);
		ArrayList<Tickets> t = new ArrayList <Tickets>();
		t.add(t1); t.add(t2);
		sC.setTicketList(t);
		c.createPurchase("CDN $", t);
		assertTrue("Ticket 1 has been set to sold", t1.getIsSold()==true);
		assertTrue("Ticket 2 has been set to sold", t2.getIsSold()==true);
		assertTrue("Scheduled Concert has updated its revenue", sC.getRevenue()==400);
		
		System.out.println("\tTesting createRefund");
		c.createRefund("CDN $", t);
		assertTrue("Ticket 1 has been now set to unsold", t1.getIsSold()==false);
		assertTrue("Ticket 2 has been now set to unsold", t2.getIsSold()==false);
		assertTrue("Scheduled Concert's revenue has been reverted to 0", sC.getRevenue()==0);
		
		
		
		
	}



}
