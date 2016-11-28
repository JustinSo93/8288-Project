package symphonytest;

import domain.Movement;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Class Test_Movement that tests the input date of Test_Movement
 * @author Heesook
 * @version 1.0.0 11/26/2016
 */
public class Test_Movement extends TestCase {

	/**
	 * Default constructor
	 * @param name string that is inherited from TestCase
	 */
	public Test_Movement(String name) { super(name);	}

	/**
	 * static method suite returns Test_ShannonsTheorem as an object
	 * @return object TestSuite
	 */
	public static TestSuite suite() { return new TestSuite(Test_Movement.class);		}

	/**
	 * Void method setup throws exception
	 */
	protected void setUp() throws Exception { System.out.println("Test_Movement Begin");	}

	/**
	 * Void method tearDown throws exception
	 */
	protected void tearDown() throws Exception { System.out.println("Test_Movement End");	}

	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Movement.testConstructors");
		movement = new Movement();
		assertNotNull("\t\tTest_Movement.testConstructors: Movement is null", movement);
	}


	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Movement.testAccessors");
		movement = new Movement();
		assertNotNull("\t\tTest_Movement.testAccessors: Movement is null", movement);

		movement.getMovementName();
		assertEquals("concerto no2", movement.getMovementName() == "concerto no2", false);
		
	}


	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Movement.testMutators");
		movement = new Movement();
		assertNotNull("\t\tTest_Movement.testMutators: Movement is null", movement);

		/* Test with valid Input */
		movement.setMovementName("concerto no2");
		assertEquals("concerto no2", movement.getMovementName());
	}

	/* ATTRIBUTES	-----------------------------------------------	*/
	/** This attribute is that Movement object initialize as null value */
	private Movement movement = null;

} /* end of class : Test_Movement.java*/
