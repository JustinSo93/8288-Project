package domain;

public class Address {
	
	private int streetNumber;
	private String street;
	private String city;
	private PostalCode postalCode;
	private String provinceState;
	private String country;
	
		private Address (AddressBuilder builder){
			this.streetNumber = builder.streetNumber;
			this.street = builder.street;
			this.city = builder.city;
			this.postalCode = builder.postalCode;
			this.provinceState = builder.provinceState;
			this.country = builder.country;
		}
		
	public Address(){
		this.streetNumber = 0;
		this.street = "";
		this.city = "";
		this.postalCode = new PostalCode("");
		this.provinceState = "";
		this.country = "";
	}
	
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
	/**
	 * @return the streetNumber
	 */
	public int getStreetNumber() {
		return streetNumber;
	}
	/**
	 * @param streetNumber the streetNumber to set
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
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
	 * @return the provinceState
	 */
	public String getProvinceState() {
		return provinceState;
	}
	/**
	 * @param provinceState the provinceState to set
	 */
	public void setProvinceState(String provinceState) {
		this.provinceState = provinceState;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
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
		
		public static void main (String[] args){
			//Example
			Address testing = new Address.AddressBuilder(40, "Somerset").city("Ottawa").build();
		}
	}
	
}