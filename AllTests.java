package symphonytest;

import junit.framework.*;

/**
 * JUnit test class to execute all JUNIT tests for the "Shannons Theorem" Lab3.
 *
 */
public class AllTests extends TestCase {

	public AllTests(String name) { super(name);		}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		//suite.addTest(Test_Venues.suite());
		suite.addTest(Test_Address.suite());
		//suite.addTest(Test_Tickets.suite());
		return suite;
	}



	/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
	/**
	 *	Main line for standalone operation.
	 *	@param	args	Standard string command line parameters.
	 */
	 public static void main(String[] args) {
        System.out.println("Executing AllTests ...");
        junit.textui.TestRunner.run(suite());
    }

}	/*	End of CLASS:	AllTests.java			*/