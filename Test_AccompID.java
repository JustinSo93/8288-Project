package symphonytest;

import domain.AccompID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_AccompID extends TestCase{
	
	public Test_AccompID(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_AccompID.class);		}

	protected void setUp() throws Exception { System.out.println("Test_AccompID Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_AccompID End");	}

 	/**
 	 * Test toString to make sure its printing out the right string
 	 */
	public void testBehavious() {
	      System.out.println("\tExecuting Test_AccompID.testBehaviours");
	      AccompID calc = new AccompID();
			assertNotNull("\t\tTest_AccompID.testBehaviours: AccompID is null", calc);
			
			calc.createID();
			assertEquals("ACC"+ 1, calc.toString());

			
		}

AccompID accomp = null;

}
