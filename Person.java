package domain;
	
	public class Person{
		
		protected String firstName;
		protected String lastName;
		protected PhoneNumber phoneNumber;
		protected Address address;
		protected String emailAddress;
		
		
		private Person (PersonBuilder builder){
			
			this.firstName = builder.firstName;
			this.lastName = builder.lastName;
			this.phoneNumber = builder.phoneNumber;
			this.address = builder.address;
			this.emailAddress = builder.emailAddress;
		}
		
		public Person(String fName, String lName, PhoneNumber phone, Address address, String emailAddress){
	
			this.firstName = fName;
			this.lastName = lName;
			this.phoneNumber = phone;
			this.address = address;
			this.emailAddress = emailAddress;
		}
		public Person(){
			this.firstName = "";
			this.lastName = "";
			this.phoneNumber = new PhoneNumber("");
			this.address = new Address();
			this.emailAddress = "";
		}
		/**
		 * @return the emailAddress
		 */
		public String getEmailAddress() {
			return emailAddress;
		}
		
		@Override
		public String toString(){
			return this.firstName+ " " +this.lastName+ " " + phoneNumber ;
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
		 * @return the phoneNumberNumber
		 */
		public PhoneNumber getphoneNumber() {
			return phoneNumber;
		}
		/**
		 * @param phoneNumberNumber the phoneNumberNumber to set
		 */
		public void setphoneNumber(PhoneNumber phoneNumber) {
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
			
			private String firstName;
			private String lastName;
			private PhoneNumber phoneNumber;
			private Address address;
			private String emailAddress;
			
			public PersonBuilder (String firstName){
				this.firstName = firstName;
			}
			public PersonBuilder lastName (String lastName){
				this.lastName = lastName;
				return this;
			}
			public PersonBuilder phoneNumber (PhoneNumber p){
				this.phoneNumber = p;
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

			public Person build(){
				return new Person(this);
			}
		}

		
	}
