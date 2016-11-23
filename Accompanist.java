package domain;

import java.util.ArrayList;

/**
 * This Subclass of Person creates an accompanist with extra attributes.
 * @author Tyler Woyiwada
 *
 */

public class Accompanist extends Person{

/**
 * Additional attributes-
 * 
 * @param ID accompID- generated ID for the accompanist.  
 * @param String instrumentGroup- the instrument group of the instrument that the accompanist play.
 * @param String instrumentName- the instrument that the accompanist plays.
 */
	ID accompID;
	String instrumentGroup;
	String instrumentName;

/** Constructor.
 * 
 * @param firstName
 * @param lastName
 * @param phone
 * @param address
 * @param emailAddress
 * @param instrument
 * @param instrumentGroup
 */
Accompanist(String firstName, String lastName, PhoneNumber phone, 
		Address address, String emailAddress, String instrument, String instrumentGroup){
	
	super(firstName, lastName, phone, address, emailAddress);
	this.instrumentName =instrument;
	this.instrumentGroup =instrumentGroup;
	this.setAccompID();
	}
/** public get method for accompID
 * 
 */
    public ID getAccompID() {
		return accompID;
	}

/** public set method for accompID
 * 
 */
	public void setAccompID() {
		 accompID = IDFactory.getID("A");
	}

/** public get method for instrumentGroup
 * 
 * @return String instrumentGroup
 */
	public String getInstrumentGroup() {
		return instrumentGroup;
	}
/**
 * public set method for instrumentGroup.
 * @param instrumentGroup
 */

	public void setInstrumentGroup(String instrumentGroup) {
		this.instrumentGroup = instrumentGroup;
	}

/**
 * public get method for instrumentName.
 * @return instrumentName
 */
	public String getInstrumentName() {
		return instrumentName;
	}
/**
 * public set method for instrumentName
 * @param instrumentName
 */

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}
/**
 * public toString method returns a String value of Accompanist.
 * @return Accompanist.toString
 */
	@Override
	public String toString() {
		
		return "ID: " + this.accompID.toString() + ", name:" + firstName + " " + lastName + ", \naddress: " + address.toString()
				+ ", \nphoneNumber: " + phoneNumber + ", instrument group: " + instrumentGroup
				+ ", instrument name: " + instrumentName + "]\n*****************************************************\n ";
	}
	
	/**
	 * end of class.
	 */
	 
	
}
