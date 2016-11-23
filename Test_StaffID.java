package symphonytest;

import domain.StaffID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_StaffID extends TestCase{
	
	public Test_StaffID(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_StaffID.class);		}

	protected void setUp() throws Exception { System.out.println("Test_StaffID Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_StaffID End");	}

 	/**
 	 * Test toString to make sure its printing out the right string
 	 */
	public void testBehavious() {
	      System.out.println("\tExecuting Test_StaffID.testBehaviours");
	      StaffID calc = new StaffID();
			assertNotNull("\t\tTest_StaffID.testBehaviours: StaffID is null", calc);
			
			calc.createID();
			assertEquals("STA"+ 1, calc.toString());

			
		}

StaffID staff = null;

}
