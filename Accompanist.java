package symphony;

import java.util.ArrayList;

public class Accompanist extends Person{

	
Accompanist(){
	super();
}
	
	ID musicianID;
	String firstName;
	String lastName;
	Address address;
	PhoneNumber phone;
	String instrumentGroup;
	String instrumentName;
	private Person personBuilder;
	



	public Accompanist(Person person1) {
	    this.personBuilder = person1;
		this.setMusicianID("A");
		this.setPhoneNumber(phone);
//		this.setMusicianName(name);
//		this.setAddress(address);
		
		
	}
    public ID getMusicianID() {
		return musicianID;
	}


	public void setMusicianID(Object musicianID) {
		 this.musicianID = IDFactory.getID("A");
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		firstName = super.firstName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Object getPhoneNumber() {
		return phone;
	}


	public void setPhoneNumber(PhoneNumber phone) {
		this.phone = phone;
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
		return "Musician [musicianID=" + musicianID + ", musicianName=" + firstName + " " + lastName + ", address=" + address
				+ ", phoneNumber=" + phone + ", instrumentGroup=" + instrumentGroup
				+ ", instrumentName=" + instrumentName + "]";
	}
	
}
