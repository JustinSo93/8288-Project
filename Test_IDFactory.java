package symphonytest;

import domain.IDFactory;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_IDFactory extends TestCase {
	public Test_IDFactory(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_IDFactory.class);		}

	protected void setUp() throws Exception { System.out.println("Test_IDFactory Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_IDFactory End");	}


	/**
	 * Test IDFactory to make sure that when you declare which case it is it will 
	 * create the right ID tag for the Right ID class.
	 */
	public void testBehaviours() {
		System.out.println("\tExecuting Test_IDFactory.testBehaviours");

		IDFactory calc = new IDFactory();

		IDFactory.getID("A");

		assertEquals("ACC" , calc.getID("A").createID());

		IDFactory.getID("V");

		assertEquals("VEN" , calc.getID("V").createID());

		IDFactory.getID("T");

		assertEquals("TIC" , calc.getID("T").createID());

		IDFactory.getID("C");

		assertEquals("CUS" , calc.getID("C").createID());
		
		IDFactory.getID("CON");
		
		assertEquals("CON" , calc.getID("CON").createID());
		
		IDFactory.getID("S");
		
		assertEquals("SOL" , calc.getID("S").createID());
		
		IDFactory.getID("ST");
		
		assertEquals("STA" , calc.getID("ST").createID());
		
		IDFactory.getID("TRN");
		
		assertEquals("TRN" , calc.getID("TRN").createID());

	}
}
