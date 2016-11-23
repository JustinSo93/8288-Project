package symphonytest;

import domain.Address;
import domain.Date;
import domain.PhoneNumber;
import domain.Venues;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Venues extends TestCase {

	
	public Test_Venues(String name) { super(name);	}
	public static Test suite() { return new TestSuite(Test_Venues.class);		}
	
	protected void setUp() throws Exception { 
		System.out.println("Test_Date Begin");	
		
	
	}
	protected void tearDown() throws Exception { System.out.println("Test_Venues End");	}
	
	public void testConstructors(){
		 System.out.println("\tExecuting Test_Venues.testConstructors");
		 System.out.println("\tTesting Empty Constructor");
		 Venues venues = new Venues();
		 assertTrue(venues.getAddress().toString().equals("0   null"));
		 assertTrue(venues.getNumberOfRows()==0);
		 assertTrue(venues.getPhoneNumber().toString()=="(000) 000-0000");
		 assertTrue(venues.getSeatingCapacity()==0);
		 System.out.println("\tTesting fully parameterized constructor");
		 Venues venues2 = new Venues(new Address.AddressBuilder(4, "Finchley").build(),250,10,new PhoneNumber("1234567891"));
		 assertTrue(venues2.getAddress().toString().equals("4 Finchley"));
		 assertTrue(venues2.getNumberOfRows()==10);
		 assertTrue(venues2.getSeatingCapacity()==250);
		 assertTrue(venues2.getPhoneNumber().toString().equals("(123) 456-7891"));
	}
	
	public void testAccessors(){
		Venues v = new Venues(new Address.AddressBuilder(1755, "Merivale").build(), 300,20, new PhoneNumber("1234567891"));
		assertTrue(v.getAddress().toString().equals("1755 Merivale"));
		assertTrue(v.getNumberOfRows()==20);
		assertTrue(v.getSeatingCapacity()==300);
		assertTrue(v.getPhoneNumber().toString().equals("(123) 456-7891"));
	}
	
	public void testMutators(){
		Venues v = new Venues();
		v.setAddress(new Address.AddressBuilder(16, "Baseball St").build());
		v.setNumberOfRows(25);
		v.setSeatingCapacity(500);
		v.setPhoneNumber(new PhoneNumber("1234567890"));
		assertTrue(v.getAddress().toString().equals("16 Baseball St"));
		assertTrue(v.getNumberOfRows()==25);
		assertTrue(v.getSeatingCapacity()==500);
		assertTrue(v.getPhoneNumber().toString().equals("(123) 456-7890"));
	}

}
