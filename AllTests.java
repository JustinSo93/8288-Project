package symphonytest;

import junit.framework.*;

/**
 * JUnit test class to execute all JUNIT tests for "Symphony".
 *
 */
public class AllTests extends TestCase {

	public AllTests(String name) { super(name);		}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(Test_Venues.suite());
		suite.addTest(Test_Address.suite());
		suite.addTest(Test_PhoneNumber.suite());
		suite.addTest(Test_Tickets.suite());
		suite.addTest(Test_AccompID.suite());;
		suite.addTest(Test_ConductorID.suite());
		suite.addTest(Test_Customer.suite());
		suite.addTest(Test_CustomerID.suite());
		suite.addTest(Test_Date.suite());
		suite.addTest(Test_IDFactory.suite());
		suite.addTest(Test_StaffID.suite());
		suite.addTest(Test_TicketID.suite());
		suite.addTest(Test_TicketModel.suite());
		suite.addTest(Test_TransactionID.suite());
		suite.addTest(Test_VenueID.suite());
		
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