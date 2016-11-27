package symphonytest;

import domain.TicketID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_TicketID extends TestCase{
	
	public Test_TicketID(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_TicketID.class);		}

	protected void setUp() throws Exception { System.out.println("Test_TicketID Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_TicketID End");	}

 	/**
 	 * Test toString to make sure its printing out the right string
 	 */
	public void testBehavious() {
	      System.out.println("\tExecuting Test_TicketID.testBehaviours");
	      TicketID calc = new TicketID();
			assertNotNull("\t\tTest_TicketID.testBehaviours: TicketID is null", calc);
			
			calc.createID();
			assertEquals("TIC"+ 0, calc.toString());

			
		}

TicketID accomp = null;

}
