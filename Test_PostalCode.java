package symphonytest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import domain.PostalCode;

/**
 * Test_PostalCode class is used for testing of PostalCode class. it check and
 * test all constructor, mutator, accessors, behavior.
 * 
 * @author Nirav
 *
 */
public class Test_PostalCode extends TestCase {

	public Test_PostalCode(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_PostalCode.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_PostalCode Begin");
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_PostalCode End");
	}

	/**
	 * Tests the constructor for postalCode
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_PostalCode.testConstructors");
		PostalCode postalCode = new PostalCode("k1g3n9");
		assertNotNull("\t\tTest_Address.testConstructors: Address is  null", postalCode);

	}

	/**
	 * Tests the Accessors of PostalCode class
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_PostalCode.testAccessors");
		PostalCode p1 = new PostalCode("k1g3n9");
		assertNotNull("\t\tTest_Address.testAccessors: Address is null", p1);

		p1.setPostalCode("k1g3n9");
		;

		assertEquals("k1g3n9", p1.getPostalCode());
	}

	/**
	 * Test the Mutators of PostalCode Class
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_PostalCode.testMutators");
		PostalCode p2 = new PostalCode("b2n9p3");
		assertNotNull("\t\tTest_Address.testMutators: Address is null", p2);

		p2.setPostalCode("k1g3n9");

		assertEquals("k1g3n9", p2.getPostalCode());
	}

	/**
	 * Tests the Behaviours of PostalCode class.
	 */
	public void testBehaviours() {
		System.out.println("\tExecuting Test_PostalCode.testBehaviours");
		PostalCode p3 = new PostalCode("b2n9p3");
		assertNotNull("\t\tTest_PostalCode.testBehaviours: Address is null", p3);
		assertEquals(true, p3.checkPostalCode("k1g3n9"));
		assertEquals(false, p3.checkPostalCode("z1g3n9"));
		assertEquals("b2n9p3", p3.toString());

	}

}
