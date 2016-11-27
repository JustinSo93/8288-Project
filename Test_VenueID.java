package symphonytest;

import domain.VenueID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_VenueID extends TestCase{
	
	public Test_VenueID(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_VenueID.class);		}

	protected void setUp() throws Exception { System.out.println("Test_VenueID Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_VenueID End");	}

 	/**
 	 * Test toString to make sure its printing out the right string
 	 */
	public void testBehavious() {
	      System.out.println("\tExecuting Test_VenueID.testBehaviours");
	      VenueID calc = new VenueID();
			assertNotNull("\t\tTest_VenueID.testBehaviours: VenueID is null", calc);
			
			calc.createID();
			assertEquals("VEN"+ 0, calc.toString());

			
		}

VenueID accomp = null;

}

