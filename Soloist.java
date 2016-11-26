package domain;

import java.util.ArrayList;

public class Soloist extends Person {
	
	
	/* CONSTRUCTORS -------------------------------------------------- */
	
	/** Empty constructor */
	public Soloist(){
		super();
		this.instrumentName = "";
		this.instrumentGroup = "";
		this.setSoloistID();
	}
	/** Fully parameterized constructor */
	public Soloist(String firstName, String lastName, PhoneNumber phone, Address address, String emailAddress, String instrument,
			String instrumentGroup, ArrayList<CompLastDatePlayed> compositionsDate) {
		super(firstName, lastName, phone, address, emailAddress);
		this.instrumentName =instrument;
		this.instrumentGroup =instrumentGroup;
		this.emailAddress = emailAddress;
		this.compositionsDate = compositionsDate;
		this.setSoloistID();
		// TODO Auto-generated constructor stub
	}
	
	/* ACCESSORS ----------------------------------------------------- */
	
	/**
	 *  This method returns the soloistID 
	 * @return soloistID
	 */
	public ID getSoloistID() {
		return soloistID;
	}
	/**
	 * This method returns the instrumentGroup
	 * @return instrumentGroup
	 */
	public String getInstrumentGroup() {
		return instrumentGroup;
	}
	
	/**
	 * This method returns the instrumentName
	 * @return instrumentName
	 */
	public String getInstrumentName() {
		return instrumentName;
	}
	
	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * This void method sets the soloistID
	 */
	public void setSoloistID() {
		 soloistID = IDFactory.getID("S");
	}

	/**
	 * This void method sets the instrumentGroup
	 * @param instrumentGroup
	 */
	public void setInstrumentGroup(String instrumentGroup) {
		this.instrumentGroup = instrumentGroup;
	}
	
	/**
	 * This void method sets the instrumentName
	 * @param instrumentName
	 */
	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
	/* HELPER METHODS	--------------------------------------------------	*/
	/**
	 * This method returns a String and override the Object toString() method. Prints out all relevant information
	 * concerning the Soloist
	 */
	@Override
	public String toString() {
		return "\nID : " + this.soloistID.toString() + ", name: " + firstName + " " + lastName + ", \naddress: " + address.toString()
		+ ", \nphone number: " + phoneNumber  + ", \ninstrument group: " + instrumentGroup
		+ ", instrument name: " + instrumentName + "\nCompositions and last date played: " + compositionsDate.toString() +
		"\n***************************************************** \n ";
	}
	
	/* ATTRIBUTES ----------------------------------------------------- */
	/** compositionsDate is of type ArrayList<CompLastDatePlayed>*/
	ArrayList<CompLastDatePlayed> compositionsDate;
	/** soloistID is a unique identifier for each soloist. It is of type ID */
	ID soloistID;
	/** Attribute instrumentName is of type String */
	String instrumentName;
	/** Attribute instrumentGroup is of type String */
	String instrumentGroup;
}