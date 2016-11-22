package symphonytest;

import domain.PhoneNumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_PhoneNumber extends TestCase {

		public Test_PhoneNumber(String name) {
			super(name);
		}

		public static Test suite() {
			return new TestSuite(Test_PhoneNumber.class);
		}

		protected void setUp() throws Exception {
			System.out.println("Test_PhoneNumber Begin");
		}

		protected void tearDown() throws Exception {
			System.out.println("Test_PhoneNumber End");
		}

		
		public void testConstructors() {
			System.out.println("\tExecuting Test_PhoneNumber.testConstructors");
			phone = new PhoneNumber("");
			assertNotNull("\t\tTest_PhoneNumber.testConstructors: PhoneNumber is null", phone);

		}

		/**
		 * Testing the toString function to make sure that the string builder builds the phone number properly
		 */
		public void testBehaviours() {
			System.out.println("\tExecuting Test_PhoneNumber.testBehaviours");
			phone = new PhoneNumber("");
			assertNotNull("\t\tTest_PhoneNumber.testBehaviours: PhoneNumber is null", phone);

			PhoneNumber calc = new PhoneNumber("");
			calc.createID("6138991627");
			
			assertEquals("(613) 899-1627", calc.sb.toString());
			
			
}
		PhoneNumber phone = null;
}
