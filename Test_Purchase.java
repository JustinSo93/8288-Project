package symphonytest;

import domain.Purchase;
import domain.ScheduledConcert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Purchase extends TestCase{

	public Test_Purchase(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Purchase.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Purchase Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Purchase End");	}


	/**
	 * Test both empty and parameterized constructor
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Purchase.testConstructors");
		Purchase calc = new Purchase();
		assertNotNull("\t\tTest_Purchase.testConstructors: Purhcase is null", calc);
		Purchase calc1 = new Purchase("dollar" , new ScheduledConcert() , 30.00);
		assertNotNull("\t\tTest_Purchase.testConstructors: Purchase is null", calc1);
	}
	
	Purchase purhcase = null;
}
