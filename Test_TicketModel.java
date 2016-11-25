package symphonytest;

import domain.ScheduledConcert;
import domain.TicketModel;
import domain.Tickets;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_TicketModel extends TestCase {
	public Test_TicketModel(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_TicketModel.class);		}

	protected void setUp() throws Exception { System.out.println("Test_TicketModel Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_TicketModel End");	}

 	/**
 	 * Test constructors to make sure they work
 	 */
	public void testConstructors() {
	      System.out.println("\tExecuting Test_TicketModel.testConstructors");
	      TicketModel calc = new TicketModel();

			assertNotNull("\t\tTest_TicketModel.testConstructors: TicketModel is null", calc);

			
		}
	
	/**
	 * Test getters to make sure they work
	 */
	public void testAccessors() {
      System.out.println("\tExecuting Test_TicketModel.testAccessors");
      	
		TicketModel calc = new TicketModel();

		calc.setPrice(300.00);
		assertEquals(300.00, calc.getPrice());
		calc.setSeat("A1");
		assertEquals("A1", calc.getSeat());
		calc.setIsSold(true);
		assertEquals(true, calc.getIsSold());
		
		
	}
	/**
	 * Test setters to make sure they work
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_TicketModel.testMutators");
		
		TicketModel calc = new TicketModel();
		calc.setPrice(300.00);
		assertEquals(300.00, calc.getPrice());
		calc.setSeat("A1");
		assertEquals("A1", calc.getSeat());
		calc.setIsSold(true);
		assertEquals(true, calc.getIsSold());
	}
}
