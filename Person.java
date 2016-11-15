package symphony;

public class Person  {
	
	public String name;
	public Object personBuilder;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
    
	// TODO Auto-generated constructor stub

	public Person(PersonBuilder personBuilder) {
	
		// TODO Auto-generated constructor stub
	}

	public static class PersonBuilder{
	private String name;
	private String address;
	private PhoneNumber phone;
	
	public PersonBuilder(String name){
		this.name = name;
	}
	
	public PersonBuilder address(String s){
		address = s;
		return this;
		
	}
	public PersonBuilder phone(PhoneNumber p){
		phone = p;
		return this;
	}
	
	public Person build(){
		return new Person(this);
	}
	
	private void Person(PersonBuilder builder){
		address = builder.address;
		phone = builder.phone;
	}

	public String getName() {
		return name;
	}
	
	public String setName(){
		this.name = name;
		return name;
	}
	
	@Override
	public String toString() {
		return  "musicianName=" + name + ", address=" + address
				+ ", phoneNumber=" + phone ;
	}
}


}
