package symphonytest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import domain.Address;
import domain.Address.AddressBuilder;
import domain.PostalCode;

public class Test_Address extends TestCase{

		public Test_Address(String name) { super(name);	}

		public static Test suite() { return new TestSuite(Test_Address.class);		}

		protected void setUp() throws Exception { System.out.println("Test_Address Begin");	}

		protected void tearDown() throws Exception { System.out.println("Test_Address End");	}

	 
		public void testConstructors() {
		      System.out.println("\tExecuting Test_Address.testConstructors");
				address = new Address();
				assertNotNull("\t\tTest_ShannonsController.testConstructors: ShannonsController is null", address);

				
			}
		
		
		public void testAccessors() {
	      System.out.println("\tExecuting Test_ShannonsController.testAccessors");
	      address = new Address();
			assertNotNull("\t\tTest_ShannonsController.testAccessors: ShannonsController is null", address);
			


			Address calc = new Address();
			calc.setStreetNumber(30);
			assertEquals(30, calc.getStreetNumber(), 0.01);
			
			
		}

		public void testMutators() {
	      System.out.println("\tExecuting Test_ShannonsController.testMutators");
	      address = new Address();
			assertNotNull("\t\tTest_ShannonsControllr.testMutators: ShannonsController is null", address);

			Address calc = new Address();
			calc.setCountry("Canada");
		
			assertEquals("Canada", calc.getCountry());
			
			calc.setCity("Ottawa");
			
			assertEquals("Ottawa", calc.getCity());
			
			calc.setPostalCode(new PostalCode ("K1G4E2"));
			
			assertEquals("K1G4E2", calc.getPostalCode().toString());
			
			calc.setProvinceState("Ontario");
		
			assertEquals("Ontario", calc.getProvinceState());
			
			calc.setStreet("Baseball Street");
			
			assertEquals("Baseball Street", calc.getStreet());
			
			calc.setStreetNumber(90);
			
			assertEquals(90, calc.getStreetNumber());
			

		}

	
		 
		public void testBehaviours() {
	      System.out.println("\tExecuting Test_ShannonsController.testConstructors");
	      address = new Address();
			assertNotNull("\t\tTest_ShannonsController.testConstructors: ShannonsController is null", address);
			
			AddressBuilder calc = new AddressBuilder(90,"Baseball Street").city("Ottawa").postalCode(new PostalCode("K1G4E2")).provinceState("Ontario").country("Canada");
			
			assertEquals("90 Baseball Street Ottawa K1G4E2 Ontario Canada", calc.build().toString());
			
			
			
		}

		Address address = null;
	}

