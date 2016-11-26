package symphonytest;

import domain.Accompanist;
import domain.Address;
import domain.PhoneNumber;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Accompanist extends TestCase{
	public Test_Accompanist(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Accompanist.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Accompanist Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Accompanist End");	}


	/**
	 * Testing the constructor
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Accompanist.testConstructors");
		Accompanist calc = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
		assertNotNull("\t\tTest_Accompanist.testConstructors: Accompanist is null", calc);

	}

	/**
	 * Test getters
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_Accompanist.testAccessors");
		Accompanist calc = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
		calc.setAccompID();
		assertEquals("ACC" , calc.getAccompID().createID());
		calc.setInstrumentGroup("Woodwind");
		assertEquals("Woodwind" , calc.getInstrumentGroup());
		calc.setInstrumentName("Sax");
		assertEquals("Sax" , calc.getInstrumentName());
	}
	/**
	 * Test setters
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_Accompanist.testMutators");
		Accompanist calc = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
		calc.setAccompID();
		assertEquals("ACC" , calc.getAccompID().createID());
		calc.setInstrumentGroup("Woodwind");
		assertEquals("Woodwind" , calc.getInstrumentGroup());
		calc.setInstrumentName("Sax");
		assertEquals("Sax" , calc.getInstrumentName());
	}


	Accompanist accompanist = null;

}
