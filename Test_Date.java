package symphonytest;


import domain.Date;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** Test class which tests the Date class */
public class Test_Date extends TestCase{
	protected Date date;
	
	public Test_Date(String name) { super(name);	}
	public static Test suite() { return new TestSuite(Test_Date.class);		}
	
	protected void setUp() throws Exception { 
		System.out.println("Test_Date Begin");	
		date = new Date();
	
	}
	protected void tearDown() throws Exception { System.out.println("Test_Date End");	}
	
	/** tests the constructors */
	public void testConstructors() {
	      System.out.println("\tExecuting Test_Date.testConstructors");
	      System.out.println("Testing empty constructor");
	      Date date = new Date();
	      assertEquals(date.getDay(),1);
	      assertEquals(date.getMonth(),1);
	      assertEquals(date.getYear(),1900);
	      System.out.println("Testing parameterized constructor");
	      Date day9 = new Date(1,12,2013);
	      assertEquals(day9.getDay(),1);
	      assertEquals(day9.getMonth(),12);
	      assertEquals(day9.getYear(),2013);
			
	}
	/** tests the accessors */
	public void testAccessors(){
		date.setDay(1);
		date.setMonth(2);
		date.setYear(2003);
		assertEquals(1, date.getDay());
		assertEquals(2, date.getMonth());
		assertEquals(2003, date.getYear());
	}
	
	/** Tests the mutators */
	public void testMutators(){
		date.setDay(20);
		date.setMonth(1);
		date.setYear(2002);
		assertEquals(date.getDay(),20);
		assertEquals(date.getMonth(),1);
		assertEquals(date.getYear(),2002);
		
	}
	/**Tests the behaviours */
	public void testBehaviours(){
		date.setDay(20);
		date.setMonth(1);
		date.setYear(2003);
		assertTrue(date.toString().equals("20/1/2003"));
	}
	
}
