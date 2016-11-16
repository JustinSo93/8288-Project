package domain;

import java.util.ArrayList;

public class Conductor extends Person{

	ID conductorID;
	String instrumentName;
	String instrumentGroup;
	private PhoneNumber phone;
	ArrayList<String> shows;	
	
	
		
	 Conductor(String firstName, String lastName, PhoneNumber phone, Address address, String instrument,
			String instrumentGroup, ArrayList<String> shows) {
	    	super(firstName, lastName, phone, address);
			this.instrumentName =instrument;
			this.instrumentGroup =instrumentGroup;
			this.phone = phone;
			this.shows = shows;
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
		+ ", \nphone number: " + phone + ", \nInstrument group: " + instrumentGroup
		+ ", Instrument name =" + instrumentName + "\nConcerts: " +shows + "\n*****************************************************";
}
}
