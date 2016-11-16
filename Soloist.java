package domain;

import java.util.ArrayList;

public class Soloist extends Person {
	
	ArrayList<CompLastDatePlayed> compositionsDate;
	ID soloistID;
	String instrumentName;
	String instrumentGroup;
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
	public ID getSoloistID() {
		
		return soloistID;
	}


	public void setSoloistID() {
		 soloistID = IDFactory.getID("S");
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
	return "\nID : " + this.soloistID.toString() + ", name: " + firstName + " " + lastName + ", \naddress: " + address.toString()
	+ ", \nphone number: " + phoneNumber  + ", \ninstrument group: " + instrumentGroup
	+ ", instrument name: " + instrumentName + "\nCompositions and last date played: " + compositionsDate.toString() +
	"\n***************************************************** \n ";
}
}
