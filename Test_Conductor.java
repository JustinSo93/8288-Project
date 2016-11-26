package symphonytest;



import domain.Conductor;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Conductor extends TestCase{
	public Test_Conductor(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Conductor.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Conductor Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Conductor End");	}


	/**
	 * Testing the constructor
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Conductor.testConstructors");
		Conductor calc = new Conductor();
		assertNotNull("\t\tTest_Conductor.testConstructors: Conductor is null", calc);

	}

	/**
	 * Test getters
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_Conductor.testAccessors");
		Conductor calc = new Conductor();
		calc.setConductorID();
		assertEquals("CON" , calc.getConductorID().createID());
		calc.setInstrumentGroup("Woodwind");
		assertEquals("Woodwind" , calc.getInstrumentGroup());
		calc.setInstrumentName("Sax");
		assertEquals("Sax" , calc.getInstrumentName());
	}
	/**
	 * Test setters
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_Conductor.testMutators");
		Conductor calc = new Conductor();
		calc.setConductorID();
		assertEquals("CON" , calc.getConductorID().createID());
		calc.setInstrumentGroup("Woodwind");
		assertEquals("Woodwind" , calc.getInstrumentGroup());
		calc.setInstrumentName("Sax");
		assertEquals("Sax" , calc.getInstrumentName());
	}

	Conductor conduct = null;
}
