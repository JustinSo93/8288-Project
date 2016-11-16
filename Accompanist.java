package domain;

import java.util.ArrayList;

public class Accompanist extends Person{
	ID accompID;
	String instrumentGroup;
	String instrumentName;
	private PhoneNumber phone;
	
Accompanist(String firstName, String lastName, PhoneNumber phone, 
		Address address, String instrument, String instrumentGroup){
	
	super(firstName, lastName, phone, address);
	this.instrumentName =instrument;
	this.instrumentGroup =instrumentGroup;
	this.phone = phone;
	this.setAccompID();
	}
	
    public ID getAccompID() {
		return accompID;
	}


	public void setAccompID() {
		 accompID = IDFactory.getID("A");
	}


	public String getInstrumentGroup() {
		return instrumentGroup;
	}


	public void setInstrumentGroup(String instrumentGroup) {
		this.instrumentGroup = instrumentGroup;
	}


	public String getInstrumentName() {
		return instrumentName;
	}


	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

	@Override
	public String toString() {
		
		return "ID: " + this.accompID.toString() + ", name:" + firstName + " " + lastName + ", \naddress: " + address.toString()
				+ ", \nphoneNumber: " + phone + ", instrument group: " + instrumentGroup
				+ ", instrument name: " + instrumentName + "]\n*****************************************************";
	}
	
}
