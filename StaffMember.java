package domain;

import java.util.ArrayList;

public class StaffMember extends Person{

	String job;
	ArrayList<String>staffShows;
	PhoneNumber phone;
	ID staffID;
	
	public StaffMember(String fName, String lName, PhoneNumber phone, Address address, String job, ArrayList<String>staffShows) {
		super(fName, lName, phone, address);
		this.job = job;
		this.staffShows = staffShows;
		this.phone = phone;
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
		+ ", \nphone number: " + phone + ", \njob: " + job + 
		 ", \nShows : " + staffShows + "\n*****************************************************";
}
}
