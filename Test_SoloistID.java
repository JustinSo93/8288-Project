package symphonytest;

import domain.SoloistID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_SoloistID extends TestCase{
	
	public Test_SoloistID(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_SoloistID.class);		}

	protected void setUp() throws Exception { System.out.println("Test_SoloistID Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_SoloistID End");	}

 	/**
 	 * Test toString to make sure its printing out the right string
 	 */
	public void testBehavious() {
	      System.out.println("\tExecuting Test_SoloistID.testBehaviours");
	      SoloistID calc = new SoloistID();
			assertNotNull("\t\tTest_SoloistID.testBehaviours: SoloistID is null", calc);
			
			calc.createID();
			assertEquals("SOL"+ 0, calc.toString());

			
		}

SoloistID accomp = null;

}

