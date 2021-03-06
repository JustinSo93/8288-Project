package symphonytest;

import java.util.ArrayList;

import domain.Address;
import domain.CompLastDatePlayed;
import domain.Composition;
import domain.Date;
import domain.Movement;
import domain.PhoneNumber;
import domain.Soloist;
import junit.framework.TestCase;

public class Test_Soloist extends TestCase{
	public Test_Soloist(String name) { super(name);	}
	protected void setUp() throws Exception { System.out.println("Test_Soloist Begin");	}

	protected void tearDown() throws Exception { System.out.println("Test_Soloist End");	}
	
	/**
	 * Tests the constructor for Address	 
	 */
	public void testConstructors() {
		/* testing empty constructor */
		Soloist s = new Soloist();
		assertTrue(s.getFirstName().equals(""));
		assertTrue(s.getInstrumentGroup().equals(""));
		assertTrue(s.getInstrumentGroup().equals(""));
		assertTrue(s.getSoloistID().toString().equals("SOL1"));
		/* testing fully parameterized constructor */
		Movement m = new Movement("1st Movement");
		ArrayList<Movement> aM = new ArrayList<Movement>();
		aM.add(m);
		ArrayList<Soloist> aS = new ArrayList<Soloist>();
		
		Composition comp = new Composition("Jingle Bells", aM,aS,"Mozart");
		CompLastDatePlayed c = new CompLastDatePlayed(comp,new Date(10,12,2010));
		ArrayList<CompLastDatePlayed> cldplist = new ArrayList<CompLastDatePlayed>();
		cldplist.add(c);
		Soloist s1 = new Soloist("Ella","Fitzgerald",new PhoneNumber("0123456789"),new Address.AddressBuilder(4, "Privet Dr.").build(),"@hotmail.com","Drums","Percussion", cldplist);
		assertNotNull(s1.getFirstName().equals("Ella"));
		assertNotNull(s1.getLastName().equals("Fitzgerald"));
		assertNotNull(s1.getphoneNumber().toString().equals("(012) 345-6789"));
		assertNotNull(s1.getAddress().getStreet().equals("Privet Dr."));
		assertNotNull(s1.getEmailAddress().equals("@hotmail.com"));
		assertNotNull(s1.getInstrumentName().equals("Drums"));
		assertNotNull(s1.getInstrumentGroup().equals("Percussion"));
		assertNotNull(s1.getcompositionsDate().get(0).getComposition().getCompositionName().equals("Jingle Bells"));
		
	}
	
	/** Tests the accessors */
	public void testAccessors(){
		Movement m = new Movement("1st Movement");
		ArrayList<Movement> aM = new ArrayList<Movement>();
		aM.add(m);
		ArrayList<Soloist> s = new ArrayList<Soloist>();
		
		Composition comp = new Composition("Jingle Bells", aM,s,"Mozart");
		CompLastDatePlayed c = new CompLastDatePlayed(comp,new Date(10,12,2010));
		ArrayList<CompLastDatePlayed> cldplist = new ArrayList<CompLastDatePlayed>();
		cldplist.add(c);
		Soloist s1 = new Soloist("Ella","Fitzgerald",new PhoneNumber("0123456789"),new Address.AddressBuilder(4, "Privet Dr.").build(),"@hotmail.com","Drums","Percussion", cldplist);
		assertTrue(s1.getFirstName().equals("Ella"));
		assertTrue(s1.getLastName().equals("Fitzgerald"));
		assertTrue(s1.getphoneNumber().toString().equals("(012) 345-6789"));
		assertTrue(s1.getAddress().getStreet().equals("Privet Dr."));
		assertTrue(s1.getEmailAddress().equals("@hotmail.com"));
		assertTrue(s1.getInstrumentName().equals("Drums"));
		assertTrue(s1.getInstrumentGroup().equals("Percussion"));
		assertTrue(s1.getcompositionsDate().get(0).getComposition().getCompositionName().equals("Jingle Bells"));
	}
	
	/** Tests the mutators */
	public void testMutators(){
		Soloist s = new Soloist();
		s.setInstrumentName("Piano");
		assertTrue(s.getInstrumentName().equals("Piano"));
		s.setInstrumentGroup("Keyboard");
		assertTrue(s.getInstrumentGroup().equals("Keyboard"));
		Movement m = new Movement("1st Movement");
		ArrayList<Movement> aM = new ArrayList<Movement>();
		aM.add(m);
		ArrayList<Soloist> aS = new ArrayList<Soloist>();
		
		Composition comp = new Composition("Enter Sandman", aM,aS,"Mozart");
		CompLastDatePlayed c = new CompLastDatePlayed(comp, new Date (12,4,2003));
		ArrayList<CompLastDatePlayed> cldplist = new ArrayList<CompLastDatePlayed>();
		cldplist.add(c);
		s.setCompositionDate(cldplist);
		assertTrue(s.getcompositionsDate().get(0).getComposition().getCompositionName().equals("Enter Sandman"));
		
	}
}
