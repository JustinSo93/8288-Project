package symphonytest;

import domain.Address;
import domain.Person;
import domain.PhoneNumber;
import domain.Person.PersonBuilder;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Person extends TestCase{

	public Test_Person(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Person.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Person Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Person End");	}


	/**
	 * Test toString to make sure its printing out the right string
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Person.testConstructors");
		Person calc = new Person("Jess", "Stratton", new PhoneNumber("6138991627"), new Address(), "");
		assertNotNull("\t\tTest_Person.testConstructors: Person is null", calc);


	}

	/**
	 * Test getters
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_Person.testAccessors");
		Person calc = new Person("Jess", "Stratton", new PhoneNumber("6138991627"), new Address(), "jj@google.com");
		calc.setFirstName("Jess");
		assertEquals("Jess" , calc.getFirstName());
		calc.setLastName("Stratton");
		assertEquals("Stratton" , calc.getLastName());
		calc.setphoneNumber(new PhoneNumber("6138991627"));
		assertEquals("(613) 899-1627", calc.getphoneNumber().toString());
		calc.setAddress(new Address());
		calc.setEmailAddress("jj@google.com");
		assertEquals("jj@google.com" , calc.getEmailAddress());
	}
	/**
	 * Test setters
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_Person.testMutators");
		Person calc = new Person("Jess", "Stratton", new PhoneNumber("6138991627"), new Address(), "jj@google.com");
		calc.setFirstName("Jess");
		assertEquals("Jess" , calc.getFirstName());
		calc.setLastName("Stratton");
		assertEquals("Stratton" , calc.getLastName());
		calc.setphoneNumber(new PhoneNumber("6138991627"));
		assertEquals("(613) 899-1627", calc.getphoneNumber().toString());
		calc.setAddress(new Address());
		calc.setEmailAddress("jj@google.com");
		assertEquals("jj@google.com" , calc.getEmailAddress());
	}

	/**
	 * Test the Person Builder to make sure it's building the person properly
	 */
	public void testBehavious() {
		System.out.println("\tExecuting Test_Person.testBehaviours");
		PersonBuilder calc = new PersonBuilder("Jess").lastName("Stratton").phoneNumber(new PhoneNumber("6138991627"));
		assertEquals("Jess Stratton (613) 899-1627" , calc.build().toString());

	}

	Person person = null;
}
