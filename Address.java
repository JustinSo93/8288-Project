package domain;
/**
* Address is a class used to store the addresses of persons and venues. It uses the Builder pattern
*/
public class Address {
	
	
	/* CONSTRUCTORS -------------------------------------------------- */
	
	/** Constructor using the AddressBuilder inner class */
	private Address (AddressBuilder builder){
		this.streetNumber = builder.streetNumber;
		this.street = builder.street;
		this.city = builder.city;
		this.postalCode = builder.postalCode;
		this.provinceState = builder.provinceState;
		this.country = builder.country;
	}
	/** Empty constructor. Assigns Strings to empty Strings and the street number to 0 */
	public Address(){
		this.streetNumber = 0;
		this.street = "";
		this.city = "";
		this.postalCode = new PostalCode("");
		this.provinceState = "";
		this.country = "";
	}
	
	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * @return the streetNumber
	 */
	public int getStreetNumber() {
		return streetNumber;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @return the postalCode
	 */
	public PostalCode getPostalCode() {
		return postalCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
		/**
	 * @return the provinceState
	 */
	public String getProvinceState() {
		return provinceState;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
	/* MODIFIERS ----------------------------------------------------- */
	
	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @param provinceState the provinceState to set
	 */
	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}
	
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/* HELPER METHODS	--------------------------------------------------	*/
	/** toString is a method returning a String displaying the address' attributes in String format */
	@Override
	public String toString() {
		if (this.street.equals(null)){
			return "You need to provide a street name";
		}
		else{
		return   streetNumber + " "  + street + " " +city+" " 
				+ postalCode.toString()  +" " + provinceState + " "+ country ;
		}
	}
	
	/** AddressBuilder is an inner class used to facilitate the Builder method */
	public static class AddressBuilder{
		private int streetNumber;
		private String street;
		private String city;
		private PostalCode postalCode;
		private String provinceState;
		private String country;
		
		public AddressBuilder (int streetNumber, String street){
			this.streetNumber = streetNumber;
			this.street = street;
		}
		
		public AddressBuilder city (String c){
			this.city = c;
			return this;
		}
		public AddressBuilder postalCode(PostalCode pC){
			this.postalCode = pC;
			return this;
		}
		
		public AddressBuilder provinceState(String pS){
			this.provinceState = pS;
			return this;
		}
		
		public AddressBuilder country (String c){
			this.country = c;
			return this;
		}
		public Address build(){
			return new Address(this);
		}
		
	
		
	}
		/* ATTRIBUTES ----------------------------------------------------- */
		/** streetNumber is an int used to denote the specific property located on particular street */
		private int streetNumber;
		/** street is a String used to indicate the street name */
		private String street;
		/** city is a String to indicate the city */
		private String city;
		/** postalCode is of type postalCode */
		private PostalCode postalCode;
		/** provinceState is a String to denote the province or state of the address */
		private String provinceState;
		/** country is a String to denote the country of the address */
		private String country;
}
