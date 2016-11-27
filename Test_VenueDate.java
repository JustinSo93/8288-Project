package symphonytest;

import domain.Address;
import domain.Date;
import domain.PhoneNumber;
import domain.VenueDate;
import domain.Venues;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_VenueDate extends TestCase {

	public Test_VenueDate(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_VenueDate.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_VenueDate Begin");
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_VenueDate End");
	}

	/**
	 * Test toString to make sure its printing out the right string
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_VenueDate.testConstructors");
		VenueDate calc = new VenueDate();
		assertNotNull("\t\tTest_VenueDate.stestConstructors: VenueDate is null", calc);

		VenueDate calc1 = new VenueDate(
				new Venues(new Address.AddressBuilder(600, "Bank Street").build(), 1500, 30, new PhoneNumber("")),
				new Date(3,21,2017));

		assertNotNull("\t\tTest_VenueDate.testConstructors: VenueDate is null", calc1);
	}


	VenueDate vD = null;

}
