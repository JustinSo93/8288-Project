package symphonytest;

import java.util.ArrayList;


import domain.StaffMember;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_StaffMember extends TestCase{
	public Test_StaffMember(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_StaffMember.class);		}

	protected void setUp() throws Exception { System.out.println("Test_StaffMember Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_StaffMember End");	}


	/**
	 * Testing the constructor
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_StaffMember.testConstructors");
		StaffMember calc = new StaffMember();
		assertNotNull("\t\tTest_StaffMember.testConstructors: StaffMember is null", calc);
		
	}

	/**
	 * Test getters
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_StaffMember.testAccessors");
		StaffMember calc = new StaffMember();
		calc.setStaffID();
		assertEquals("STA" , calc.getStaffID().createID());
		calc.setJob("Cleaner");
		assertEquals("Cleaner" , calc.getJob());
	}
		
	/**
	 * Test setters
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_StaffMember.testMutators");
		StaffMember calc = new StaffMember();
		calc.setStaffID();
		assertEquals("STA" , calc.getStaffID().createID());
		calc.setJob("Cleaner");
		assertEquals("Cleaner" , calc.getJob());
	
	}

	StaffMember staff = null;
}
