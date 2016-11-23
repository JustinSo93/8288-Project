package symphonytest;

import domain.TransactionID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_TransactionID extends TestCase{
	
	public Test_TransactionID(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_TransactionID.class);		}

	protected void setUp() throws Exception { System.out.println("Test_TransactionID Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_TransactionID End");	}

 	/**
 	 * Test toString to make sure its printing out the right string
 	 */
	public void testBehavious() {
	      System.out.println("\tExecuting Test_TransactionID.testBehaviours");
	      TransactionID calc = new TransactionID();
			assertNotNull("\t\tTest_TransactionID.testBehaviours: TransactionID is null", calc);
			
			calc.createID();
			assertEquals("TRN"+ 1, calc.toString());

			
		}

TransactionID transact = null;

}
