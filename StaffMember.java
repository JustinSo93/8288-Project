package domain;

import java.util.ArrayList;

/**
 * StaffMember Class extend to Person class with it's all functionality and 
 * this class is used for creating staffmember with specific staffID and job and 
 * ADD this new staffMember into StaffShows list.
 * @author Nirav
 *
 */
public class StaffMember extends Person{


	/* CONSTRUCTORS -------------------------------------------------- */
	/**
	 * Default Constructor of StaffMember Class.
	 */
	public StaffMember(){
		super();
		this.job = "";
		this.staffShows = new ArrayList<ScheduledConcert>();
		this.setStaffID();
	}
	
	/**
	 * Parameterized Constructor of StaffMember class.
	 * which is used to set parameter job, staffshows, and staffID. 
	 * and other parameter is set by calling super() method of class Person
	 */
	public StaffMember(String fName, String lName, PhoneNumber phone, Address address, String emailAddress, String job, ArrayList<ScheduledConcert>staffShows) {
		super(fName, lName, phone, address, emailAddress);
		this.job = job;
		this.staffShows = staffShows;
		this.setStaffID(); 
		
		// TODO Auto-generated constructor stub
	}
	
		/* ACCESSORS ----------------------------------------------------- */
		
		/**
		 * getter method for get staffID attribute.
		 * @return staffID of type ID
		 * 
		 */
		public ID getStaffID() {
			
			return staffID;
		}
		/**
		 * getter method for job attribute, used to get job.
		 * @return job as string.
		 */
		public String getJob() {
			return job;
		}
	
		/**
		 * getter method for staffShows attribute, used to get staffshows 
		 * @return staffShows as array list of scheduledConcert. 
		 */
		public ArrayList<ScheduledConcert> getStaffShows() {
			return staffShows;
		}
		
		/* MODIFIERS ----------------------------------------------------- */
	
		/**
		 * setter method for set staffID attribute.
		 *
		 */
		public void setStaffID() {
			 staffID = IDFactory.getID("ST");
		}
	
		
		


			
		/**
		 * setter method for job attribute, used to set job.
		 */
		public void setJob(String job) {
			this.job = job;
		}






		/**
		 * setter method for staffshows attribute, used to set staffshows.
		 */
		public void setStaffShows(ArrayList<ScheduledConcert> staffShows) {
			this.staffShows = staffShows;
		}
		
		/* HELPER METHODS	--------------------------------------------------	*/

		/**
		 * toString method that is used to display all information about staff 
		 * like name, address, phone number, job, shows
		 */

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
		
	/* ATTRIBUTES ----------------------------------------------------- */
		/**
	 * @param job is type of String
	 * @param staffShows is type of arrayList of ScheduledConcert
	 * @param staffID is type of ID
	 */
	protected String job;
	protected ArrayList<ScheduledConcert>staffShows;
	protected ID staffID;
}
