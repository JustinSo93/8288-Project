package symphonytest;

import java.util.ArrayList;

import domain.Composition;
import domain.Movement;
import domain.Soloist;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 * This test class tests the Composition class.
 *
 */
public class Test_Composition extends TestCase{
	
	public Test_Composition(String name) { super(name);	}
	public static Test suite() { return new TestSuite(Test_Composition.class);		}
	protected void tearDown() throws Exception { System.out.println("Test_Composition End");	}
	
	

	
	/**
	 * Testing constructors
	 */
	public void testConstructors(){
		System.out.println("\tExecuting Test_Venues.testConstructors");
		//Testing the empty constructor
		Composition c = new Composition();
		assertTrue(c.getComposer().equals(""));
		assertTrue(c.getCompositionName().equals(""));
		
		//Testing a parameterized constructor. 
		Movement m = new Movement("O Lord, Save Thy People");
		ArrayList<Movement> listofMovements = new ArrayList <Movement>();
		listofMovements.add(m);
		Soloist s = new Soloist();
		ArrayList<Soloist> listofsoloists = new ArrayList<Soloist>();
		listofsoloists.add(s);
		Composition c1 = new Composition("1812 Overture", listofMovements, listofsoloists, "Tchaikovsky");
		assertTrue(c1.getCompositionName().equals("1812 Overture"));
		assertTrue(c1.getListOfMovements().get(0).getMovementName().equals("O Lord, Save Thy People"));
		assertTrue(c1.getListOfSoloists().get(0).getFirstName().equals(""));
		assertTrue(c1.getComposer().equals("Tchaikovsky"));
		
	}
	/**
	 * Tests the accessors
	 */
	public void testAccessors(){
		//Functionally, similar to the tests for the constructors as the getter methods are required in both
		Movement m = new Movement("O Lord, Save Thy People");
		ArrayList<Movement> listofMovements = new ArrayList <Movement>();
		listofMovements.add(m);
		Soloist s = new Soloist();
		ArrayList<Soloist> listofsoloists = new ArrayList<Soloist>();
		listofsoloists.add(s);
		Composition c1 = new Composition("1812 Overture", listofMovements, listofsoloists, "Tchaikovsky");
		assertNotNull(c1.getCompositionName().equals("1812 Overture"));
		assertNotNull(c1.getListOfMovements().get(0).getMovementName().equals("O Lord, Save Thy People"));
		assertNotNull(c1.getListOfSoloists().get(0).getFirstName().equals(""));
		assertNotNull(c1.getComposer().equals("Tchaikovsky"));
	}
	
	/**
	 * Tests the mutators
	 */
	public void testMutators(){
		//Creating an empty constructor first and then using mutator methods to set the parameters.
		//Afterwards, test the Composition object to ensure the parameters have been changed successfully
		Composition c = new Composition();
		c.setComposer("Beethoven");
		c.setCompositionName("Piano Sonata No.14");
		Movement m = new Movement("1st Movement");
		Soloist s = new Soloist();
		ArrayList<Movement> listofMovements = new ArrayList <Movement>();
		ArrayList<Soloist> listofsoloists = new ArrayList<Soloist>();
		listofMovements.add(m);
		listofsoloists.add(s);
		c.setListOfMovements(listofMovements);
		c.setListOfSoloists(listofsoloists);
		assertTrue(c.getComposer().equals("Beethoven"));
		assertTrue(c.getCompositionName().equals("Piano Sonata No.14"));
		assertTrue(c.getListOfMovements().get(0).getMovementName().equals("1st Movement"));
		assertTrue(c.getListOfSoloists().get(0).getFirstName().equals(""));
	}

}
