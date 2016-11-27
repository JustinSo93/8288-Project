package symphonytest;

import domain.ConductorID;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_ConductorID extends TestCase{

		
		public Test_ConductorID(String name) { super(name);	}

		public static Test suite() { return new TestSuite(Test_ConductorID.class);		}

		protected void setUp() throws Exception { System.out.println("Test_ConductorID Begin");	}

		protected void tearDown() throws Exception { System.out.println("Test_ConductorID End");	}

	 	/**
	 	 * Test toString to make sure its printing out the right string
	 	 */
		public void testBehavious() {
		      System.out.println("\tExecuting Test_ConductorID.testBehaviours");
		      ConductorID calc = new ConductorID();
				assertNotNull("\t\tTest_ConductorID.testBehaviours: ConductorID is null", calc);
				
				calc.createID();
				assertEquals("CON"+ 0, calc.toString());

				
			}

	ConductorID conduct = null;

	}

