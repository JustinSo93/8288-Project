package domain;

import java.util.ArrayList;

public class StaffMember extends Person{

	String job;
	ArrayList<ScheduledConcert>staffShows;
	ID staffID;
	
	public StaffMember(){
		super();
		this.job = "";
		this.staffShows = new ArrayList<ScheduledConcert>();
		this.setStaffID();
	}
	
	public StaffMember(String fName, String lName, PhoneNumber phone, Address address, String emailAddress, String job, ArrayList<ScheduledConcert>staffShows) {
		super(fName, lName, phone, address, emailAddress);
		this.job = job;
		this.staffShows = staffShows;
		this.setStaffID(); 
		
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




		public ArrayList<ScheduledConcert> getStaffShows() {
			return staffShows;
		}




		public void setStaffShows(ArrayList<ScheduledConcert> staffShows) {
			this.staffShows = staffShows;
		}




		@Override
		public String toString() {
			String ScheduledConcertsString = new String();
			for (int i = 0; i < staffShows.size();i++){
				ScheduledConcertsString = ScheduledConcertsString.concat(staffShows.get(i).toString());
			}
		return "\nID: " + this.staffID.toString() + ", name: " + firstName + " " + lastName + ", \naddress:  " + address.toString()
		+ ", \nphone number: " + this.getphoneNumber() + ", \njob: " + job + 
		 ", \nShows : " + ScheduledConcertsString + "\n*****************************************************";
}
}