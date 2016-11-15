package symphony;

import java.util.ArrayList;

public class Accompanist extends Person{

	

	
	ID musicianID;
	String name;
	String address;
	PhoneNumber phone;
	String instrumentGroup;
	String instrumentName;
	



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
		 this.musicianID = IDFactory.getID("M");
	}


	public String getMusicianName() {
		return name;
	}


	public void setMusicianName(String name) {
		name = super.name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
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
		return "Musician [musicianID=" + musicianID + ", musicianName=" + name + ", address=" + address
				+ ", phoneNumber=" + phone + ", instrumentGroup=" + instrumentGroup
				+ ", instrumentName=" + instrumentName + "]";
	}
	
}
