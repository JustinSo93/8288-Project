package domain;

import java.util.ArrayList;

public class Conductor extends Person{

	ID conductorID;
	String instrumentName;
	String instrumentGroup;
	ArrayList<String> shows;	
	
	
		
	 Conductor(String firstName, String lastName, PhoneNumber phoneNumber, Address address, String emailAddress, String instrument,
			String instrumentGroup, ArrayList<String> shows) {
	    	super(firstName, lastName, phoneNumber, address, emailAddress);
			this.instrumentName =instrument;
			this.instrumentGroup =instrumentGroup;
			this.shows = shows;
			this.emailAddress = emailAddress;
			this.setConductorID();
		// TODO Auto-generated constructor stub
	}

		











		public ID getConductorID() {
			
			return conductorID;
		}


		public void setConductorID() {
			 conductorID = IDFactory.getID("CON");
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
		return "\nID: " + this.conductorID.toString() + ", name: " + firstName + " " + lastName + ", \naddress:  " + address.toString()
		+ ", \nphone number: " + phoneNumber + ", \nInstrument group: " + instrumentGroup
		+ ", Instrument name =" + instrumentName + "\nConcerts: " +shows + "\n*****************************************************\n ";
}
}
