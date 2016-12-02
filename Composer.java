package domain;

import java.util.ArrayList;

/**
 * The Composer class is extended from Person class.
 * It uses firstName, lastName, phoneNumber, address, emailAddress, 
 * instrument, instrumentName, instrumentGroup, shows from Person class.
 * @author Tyler, Heesook
 * @version 1.0.0 11/25/2016
 *
 */
public class Composer extends Person{
	
	/* CONSTRUCTORS -------------------------------------------------- */
	
	/** Empty constructor */
	public Composer(){
		this.firstName="";
		this.lastName = "";
		this.phoneNumber = new PhoneNumber("0000000000");
		this.address = new Address();
		this.emailAddress = "";
		this.instrumentName = "";
		this.instrumentGroup = "";
		this.setComposerID();
	}
	
	
	/** Constructor Composer initializes variable.*/
	public Composer(String firstName, String lastName, PhoneNumber phoneNumber, Address address, 
			String emailAddress, String instrument, String instrumentGroup, 
			ArrayList<Composition> comps) {
		super(firstName, lastName, phoneNumber, address, emailAddress);
		this.instrumentName =instrument;
		this.instrumentGroup =instrumentGroup;
		this.compositions = comps;
		this.emailAddress = emailAddress;
		
		this.setComposerID();	
	}
	
	/** Constructor Composer initializes variable.*/
	public Composer(String firstName, String lastName, PhoneNumber phoneNumber, Address address, 
			String emailAddress, String instrument, String instrumentGroup) {
		super(firstName, lastName, phoneNumber, address, emailAddress);
		this.instrumentName =instrument;
		this.instrumentGroup =instrumentGroup;
		
		this.emailAddress = emailAddress;
		this.compositions = new ArrayList<Composition>();
		this.setComposerID();	
	}

	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * This method gets ComposerID
	 * @return ComposerID
	 */
	public ID getComposerID() { return ComposerID; }

	/**
	 * This method gets InstrumentGrup
	 * @return instrumentGroup
	 */
	public String getInstrumentGroup() { return instrumentGroup; }
	
	/** 
	 * This method gets InstrumentName
	 * @return instrumentName
	 */
	public String getInstrumentName() { return instrumentName; }
	
	/**
	 * This method gets ScheduledConcerts
	 * @return ScheduledConcerts
	 */
	public ArrayList<Composition> getCompositions(){ return this.getCompositions(); }
	
	
	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * Void method setScheduledConcerts an ArrayList<ScheduledConcert> variable ScheduledConcerts
	 * @param aSC
	 */
	public void setCompositions( ArrayList<Composition> comps) { this.compositions  = comps;}
	
	/** Void method setComposerID sets a ComposerID */
	public void setComposerID() { ComposerID = IDFactory.getID("COM"); }

	/**
	 * Void method setInstrumentGroup sets a String variable instrumentGroup
	 * @param instrumentGroup
	 */
	public void setInstrumentGroup(String instrumentGroup) { this.instrumentGroup = instrumentGroup; }

	/**
	 * Void method setInstrumentName sets a String variable instrumentName
	 * @param instrumentName
	 */
	public void setInstrumentName(String instrumentName) { this.instrumentName = instrumentName; }
	
	/* HELPER METHODS ----------------------------------------------------- */
	/**
	 * This method toString sets the display format for the attributes
	 */
	@Override
	public String toString() {
		String compToString = new String();
		for (int i = 0; i < compositions.size();i++){
			compToString = compToString.concat(compositions.get(i).toString());
		}
		return "\nID: " + this.ComposerID.toString() + ", name: " + firstName + " " + lastName + ", \naddress:  " + address.toString()
		+ ", \nphone number: " + phoneNumber + ", \nInstrument group: " + instrumentGroup
		+ ", Instrument name =" + instrumentName + "\nConcerts: " +compositions + "\n*****************************************************\n ";
	}
	
	/* ATTRIBUTES ----------------------------------------------------- */
	/** The attribute shows conductID as ID */
	ID ComposerID;
	
	/** The attribute shows instrument name as String */
	String instrumentName;
	
	/** The attribute shows instrument group as String  */
	String instrumentGroup;
	
	/** The attribute shows ScheduledConcerts as ArrayList<ScheduledConcert>*/
	ArrayList<Composition> compositions;
}