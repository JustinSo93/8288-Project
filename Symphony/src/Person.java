
public class Person implements PhoneNumber{
	
	
	private String ID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	private String emailAddress;
	
	private Person (PersonBuilder builder){
		this.ID = builder.ID;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.phoneNumber = builder.phoneNumber;
		this.address = builder.address;
		this.emailAddress = builder.emailAddress;
	}
	
	public Person(){
		this.ID = "";
		this.firstName = "";
		this.lastName = "";
		this.phoneNumber = "";
		this.address = new Address();
		this.emailAddress = "";
	}
	public String getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static class PersonBuilder{
		private String ID;
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private Address address;
		private String emailAddress;
		
		public PersonBuilder (String firstName){
			this.firstName = firstName;
		}
		public PersonBuilder lastName (String lastName){
			this.lastName = lastName;
			return this;
		}
		public PersonBuilder phoneNumber (String phoneNumber){
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public PersonBuilder address (Address address){
			this.address = address;
			return this;
		}
		
		public PersonBuilder emailAddress (String emailAddress){
			this.emailAddress = emailAddress;
			return this;
		}
		public PersonBuilder ID (String ID){
			this.ID = ID;
			return this;
		}
	}
	
}
