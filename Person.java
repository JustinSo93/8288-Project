package domain;
	
	public class Person{
		
		private ID id;
		protected String firstName;
		public String lastName;
		private PhoneNumber phoneNumber;
		protected Address address;
		private String emailAddress;
		
		
		private Person (PersonBuilder builder){
			this.id = builder.id;
			this.firstName = builder.firstName;
			this.lastName = builder.lastName;
			this.phoneNumber = builder.phoneNumber;
			this.address = builder.address;
			this.emailAddress = builder.emailAddress;
		}
		
		public Person(String fName, String lName, PhoneNumber phone, Address address){
	
			this.firstName = fName;
			this.lastName = lName;
			this.phoneNumber = phone;
			this.address = address;
			this.emailAddress = "";
		}
		public ID getID() {
			return id;
		}
		/**
		 * @param iD the iD to set
		 */
		public void setID(ID id) {
			id = this.id;
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
			private domain.ID id;
			
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
			public PersonBuilder ID (ID id){
				this.id = id;
				return this;
			}
			public Person build(){
				return new Person(this);
			}
		}
		
	}
	
//	public String name;
//	public Object personBuilder;
//	
//	public Person() {
//		// TODO Auto-generated constructor stub
//	}
//    
//	// TODO Auto-generated constructor stub
//
//	public Person(PersonBuilder personBuilder) {
//	
//		// TODO Auto-generated constructor stub
//	}
//
//	public static class PersonBuilder{
//	private String name;
//	private String address;
//	private phoneNumberNumberNumber phoneNumberNumber;
//	
//	public PersonBuilder(String name){
//		this.name = name;
//	}
//	
//	public PersonBuilder address(String s){
//		address = s;
//		return this;
//		
//	}
//	public PersonBuilder phoneNumberNumber(phoneNumberNumberNumber p){
//		phoneNumberNumber = p;
//		return this;
//	}
//	
//	public Person build(){
//		return new Person(this);
//	}
//	
//	private void Person(PersonBuilder builder){
//		address = builder.address;
//		phoneNumberNumber = builder.phoneNumberNumber;
//	}
//
//	public String getName() {
//		return name;
//	}
//	
//	public String setName(){
//		this.name = name;
//		return name;
//	}
//	
//	@Override
//	public String toString() {
//		return  "musicianName=" + name + ", address=" + address
//				+ ", phoneNumberNumberNumber=" + phoneNumberNumber ;
//	}
//}
//


