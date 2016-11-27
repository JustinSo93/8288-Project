package symphonytest;

import java.util.ArrayList;

import domain.Accompanist;
import domain.Address;
import domain.Composition;
import domain.Conductor;
import domain.Movement;
import domain.PhoneNumber;
import domain.Soloist;
import domain.TemplateConcert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_TemplateConcert extends TestCase {
	
	public Test_TemplateConcert(String name) { super(name);	}
	public static Test suite() { return new TestSuite(Test_TemplateConcert.class);		}
	protected void setUp() throws Exception { System.out.println("Test_TemplateConcert Begin");	}
	protected void tearDown() throws Exception { System.out.println("Test_TemplateConcert End");	}
	
	/** Tests the constructors for TemplateConcert */
	public void testConstructors(){
		/*Empty constructor*/
		TemplateConcert tc = new TemplateConcert();
		assertTrue(tc.getConductor().getFirstName().equals(""));
		/* Fully parameterized constructor */
		ArrayList<Composition> c = new ArrayList<Composition>();
		Movement m = new Movement("O Lord, Save Thy People");
		ArrayList<Movement> listofMovements = new ArrayList <Movement>();
		listofMovements.add(m);
		Soloist s = new Soloist();
		ArrayList<Soloist> listofsoloists = new ArrayList<Soloist>();
		listofsoloists.add(s);
		Composition c1 = new Composition("1812 Overture", listofMovements, listofsoloists, "Tchaikovsky");
		c.add(c1);
		Accompanist a = new Accompanist("Tom","Morello",new PhoneNumber("1234567890"),new Address.AddressBuilder(1, "Rage Against the Machine").build(),"@hotmail.com","guitar","strings");
		ArrayList<Accompanist> listofAccompanists = new ArrayList<Accompanist>();
		listofAccompanists.add(a);
		Conductor conductor = new Conductor();
		conductor.setFirstName("Phil");
		TemplateConcert tc1 = new TemplateConcert(c,conductor, listofAccompanists);
		assertTrue(tc1.getListOfCompositions().get(0).getCompositionName().equals("1812 Overture"));
		assertTrue(tc1.getConductor().getFirstName().equals("Phil"));
		assertTrue(tc1.getListOfAccompanists().get(0).getFirstName().equals("Tom"));
			
		
	}
	
	/** Test the accessors */
	public void testAccessors(){
		ArrayList<Composition> c = new ArrayList<Composition>();
		Movement m = new Movement("O Lord, Save Thy People");
		ArrayList<Movement> listofMovements = new ArrayList <Movement>();
		listofMovements.add(m);
		Soloist s = new Soloist();
		ArrayList<Soloist> listofsoloists = new ArrayList<Soloist>();
		listofsoloists.add(s);
		Composition c1 = new Composition("1812 Overture", listofMovements, listofsoloists, "Tchaikovsky");
		c.add(c1);
		Accompanist a = new Accompanist("Tom","Morello",new PhoneNumber("1234567890"),new Address.AddressBuilder(1, "Rage Against the Machine").build(),"@hotmail.com","guitar","strings");
		ArrayList<Accompanist> listofAccompanists = new ArrayList<Accompanist>();
		listofAccompanists.add(a);
		Conductor conductor = new Conductor();
		conductor.setFirstName("Phil");
		TemplateConcert tc1 = new TemplateConcert(c,conductor, listofAccompanists);
		assertTrue(tc1.getListOfCompositions().get(0).getCompositionName().equals("1812 Overture"));
		assertTrue(tc1.getConductor().getFirstName().equals("Phil"));
		assertTrue(tc1.getListOfAccompanists().get(0).getFirstName().equals("Tom"));
	}
	
	/** Test the mutators */
	public void testMutators(){
		TemplateConcert tc = new TemplateConcert();
		Conductor conductor = new Conductor();
		conductor.setFirstName("Matthew");
		tc.setConductor(conductor);
		assertTrue(tc.getConductor().getFirstName().equals("Matthew"));
		Composition c = new Composition();
		c.setCompositionName("Blue Danube");
		tc.addComposition(c);
		assertTrue(tc.getListOfCompositions().get(0).getCompositionName().equals("Blue Danube"));
		Accompanist a = new Accompanist();
		a.setFirstName("Mark");
		tc.addAccompanist(a);
		assertTrue(tc.getListOfAccompanists().get(0).getFirstName().equals("Mark"));
		
	}
	
	

}
