package symphonytest;

import domain.CustomerID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_CustomerID extends TestCase{

		
		public Test_CustomerID(String name) { super(name);	}

		public static Test suite() { return new TestSuite(Test_CustomerID.class);		}

		protected void setUp() throws Exception { System.out.println("Test_CustomerID Begin");	}

		protected void tearDown() throws Exception { System.out.println("Test_CustomerID End");	}

	 	/**
	 	 * Test toString to make sure its printing out the right string
	 	 */
		public void testBehavious() {
		      System.out.println("\tExecuting Test_CustomerID.testBehaviours");
		      CustomerID calc = new CustomerID();
				assertNotNull("\t\tTest_CustomerID.testBehaviours: CustomerID is null", calc);
				
				calc.createID();
				assertEquals("CUS"+ 1, calc.toString());

				
			}

	CustomerID customer = null;

	}
