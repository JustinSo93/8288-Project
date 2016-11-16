package domain;

import java.util.ArrayList;

public class StaffMember extends Person{

	String job;
	ArrayList<String>staffShows;
	ID staffID;
	
	public StaffMember(String fName, String lName, PhoneNumber phoneNumber, Address address, String emailAddress, String job, ArrayList<String>staffShows) {
		super(fName, lName, phoneNumber, address, emailAddress);
		this.job = job;
		this.staffShows = staffShows;
		this.emailAddress = emailAddress;
		this.setStaffID();; 
		
		// TODO Auto-generated constructor stub
	}
	

		

		public ID getStaffID() {
			
			return staffID;
		}


		public void setStaffID() {
			 staffID = IDFactory.getID("ST");
		}
	
		
		
		public String getJob() {
			return job;
		}




		public void setJob(String job) {
			this.job = job;
		}




		public ArrayList<String> getStaffShows() {
			return staffShows;
		}




		public void setStaffShows(ArrayList<String> staffShows) {
			this.staffShows = staffShows;
		}




		@Override
		public String toString() {
		return "\nID: " + this.staffID.toString() + ", name: " + firstName + " " + lastName + ", \naddress:  " + address.toString()
		+ ", \nphone number: " + phoneNumber + ", \njob: " + job + 
		 ", \nShows : " + staffShows + "\n*****************************************************\n ";
}
}
