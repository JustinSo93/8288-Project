package symphonytest;

import domain.CompLastDatePlayed;
import domain.Date;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_CompLastDatePlayed extends TestCase {
	public Test_CompLastDatePlayed(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_CompLastDatePlayed.class);		}

	protected void setUp() throws Exception { System.out.println("Test_CompLastDatePlayed Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_CompLastDatePlayed End");	}


	/**
	 * Test parameterized constructor
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_CompLastDatePlayed.testConstructors");
		CompLastDatePlayed calc = new CompLastDatePlayed("Sonata", new Date(03, 21, 1992));
		assertNotNull("\t\tTest_CompLastDatePlayed.testConstructors: CompLastDatePlayed is null", calc);
		
	}
	/**
	 * Testing getters
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_CompLastDatePlayed.testAccessors");
		CompLastDatePlayed calc = new CompLastDatePlayed("Sonata", new Date(05,12,2014));
		assertNotNull("\t\tTest_CompLastDatePlayed.testAccessors: CompLastDatePlayed is null", calc);
	calc.setComposition("Sonata");
	assertEquals("Sonata" , calc.getComposition());
	calc.setLastDatePlayed(new Date(5,12,2014));
	assertEquals("5/12/2014" , calc.getLastDatePlayed().toString());
	
	}
	
	/**
	 * Testing setters
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_CompLastDatePlayed.testMutators");
		CompLastDatePlayed calc = new CompLastDatePlayed("Sonata", new Date(05,12,2014));
		assertNotNull("\t\tTest_CompLastDatePlayed.testMutators: CompLastDatePlayed is null", calc);
		calc.setComposition("Sonata");
		assertEquals("Sonata" , calc.getComposition());
		calc.setLastDatePlayed(new Date(5,12,2014));
		assertEquals("5/12/2014" , calc.getLastDatePlayed().toString());
	}
	
	CompLastDatePlayed comp = null;
}
