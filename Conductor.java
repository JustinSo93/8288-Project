package domain;

import java.util.ArrayList;

/**
 * The Conductor class is extended from Person class.
 * It uses firstName, lastName, phoneNumber, address, emailAddress, 
 * instrument, instrumentName, instrumentGroup, shows from Person class.
 * @author Tyler, Heesook
 * @version 1.0.0 11/25/2016
 *
 */
public class Conductor extends Person{
	
	/* CONSTRUCTORS -------------------------------------------------- */
	/** Constructor Conductor initializes variable.*/
	Conductor(String firstName, String lastName, PhoneNumber phoneNumber, Address address, 
			String emailAddress, String instrument, String instrumentGroup, 
			ArrayList<ScheduledConcert> shows) {
		super(firstName, lastName, phoneNumber, address, emailAddress);
		this.instrumentName =instrument;
		this.instrumentGroup =instrumentGroup;
		this.ScheduledConcerts = shows;
		this.emailAddress = emailAddress;
		this.setConductorID();	
	}

	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * This method gets conductorID
	 * @return conductorID
	 */
	public ID getConductorID() { return conductorID; }

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
	
	/* MODIFIERS ----------------------------------------------------- */
	/** Void method setConductorID sets a conductorID */
	public void setConductorID() { conductorID = IDFactory.getID("CON"); }

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
		String ScheduledConcertsString = new String();
		for (int i = 0; i < ScheduledConcerts.size();i++){
			ScheduledConcertsString = ScheduledConcertsString.concat(ScheduledConcerts.get(i).toString());
		}
		return "\nID: " + this.conductorID.toString() + ", name: " + firstName + " " + lastName + ", \naddress:  " + address.toString()
		+ ", \nphone number: " + phoneNumber + ", \nInstrument group: " + instrumentGroup
		+ ", Instrument name =" + instrumentName + "\nConcerts: " +ScheduledConcertsString + "\n*****************************************************\n ";
	}
	
	/* ATTRIBUTES ----------------------------------------------------- */
	/** The attribute shows conductID as ID */
	ID conductorID;
	
	/** The attribute shows instrument name as String */
	String instrumentName;
	
	/** The attribute shows instrument group as String  */
	String instrumentGroup;
	
	/** The attribute shows shows as ArrayList<ScheduledConcert>*/
	ArrayList<ScheduledConcert> ScheduledConcerts;
}