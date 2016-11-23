package symphonytest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import domain.ScheduledConcert;
import domain.Tickets;

public class Test_Tickets extends TestCase {
	public Test_Tickets(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Tickets.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Tickets Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Tickets End");	}

 	/**
 	 * Test constructors to make sure they work
 	 */
	public void testConstructors() {
	      System.out.println("\tExecuting Test_Tickets.testConstructors");
	      Tickets calc = new Tickets(300.0, "A1", true , new ScheduledConcert());

			assertNotNull("\t\tTest_Tickets.testConstructors: Tickets is null", calc);

			
		}
	
	/**
	 * Test getters to make sure they work
	 */
	public void testAccessors() {
      System.out.println("\tExecuting Test_Tickets.testAccessors");
      	
		Tickets calc = new Tickets(300.0, "A1", true , new ScheduledConcert());

		assertEquals(300.00, calc.getPrice());
		
		assertEquals("A1", calc.getSeat());
		
		assertEquals(true, calc.getIsSold());
		
	}


	/**
	 * Test setters to make sure they work
	 */
	public void testMutators() {
      System.out.println("\tExecuting Test_Tickets.testMutators");
      
		
		Tickets calc = new Tickets(300.0, "A1", true , new ScheduledConcert());
		
		calc.setIsSold(false);
		calc.setPrice(400.0);
		calc.setSeat("B1");
		
			

	}

	Tickets tickets = null;
}
