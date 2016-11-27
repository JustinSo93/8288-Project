package symphonytest;


import domain.Refund;
import domain.ScheduledConcert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Refund extends TestCase{

	public Test_Refund(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Refund.class);		}

	protected void setUp() throws Exception { System.out.println("Test_Refund Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Refund End");	}


	/**
	 * Test empty and parameterized constructors
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Refund.testConstructors");
		Refund calc = new Refund();
		assertNotNull("\t\tTest_Refund.testConstructors: Refund is null", calc);
		Refund calc1 = new Refund("dollar" , new ScheduledConcert() , 30.00);
		assertNotNull("\t\tTest_Refund.testConstructors: Refund is null", calc1);
	}
	
	Refund refund = null;
}

