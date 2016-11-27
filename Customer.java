package domain;

import java.util.ArrayList;
/**
 * this Class is a subclass of Person that creates a customer
 * @author tyyyl
 *
 */
public class Customer extends Person{
	
	/**
	 * attritubes to be used in the class
	 * @param String username
	 * @param String password
	 * @param ID customerID
	 */
	protected String username;
	protected String password;
	protected ID customerID;
	/**
	 * constructor
	 */
	public Customer (){
		super();
		this.setID();
	}
	/**
	 * overloaded constructor
	 * @param fName
	 * @param lName
	 * @param pn
	 * @param address
	 * @param emailAddress
	 */
	public Customer(String fName, String lName, PhoneNumber pn, Address address, String emailAddress  ){
		super(fName, lName, pn, address, emailAddress );
		this.setID();
	}
	/**
	 * public set method that calls the IDFactory and creates an ID for the customer
	 * @param ID customerID
	 */
	public void setID(){
		this.customerID = IDFactory.getID("C");
	}
	/**
	 * public method that instantiates a Purchase object and returns it
	 * @param double amount
	 * @param String currency
	 * @param ArrayList<Tickets> t
	 * @return Purchase p 
	 */
	public Purchase createPurchase (String currency, ArrayList<Tickets> t){
		double amount = 0;
	
		Purchase p = new Purchase(currency, t);
		for (int i = 0; i < t.size();i++){
			t.get(i).setIsSold(true);
			amount+=t.get(i).getPrice();
			
		}
		p.setAmount(amount);
		//System.out.println(amount);
		t.get(0).getScheduledConcert().revenue += amount;
		
		p.setDestination(t.get(0).getScheduledConcert());
		p.setSource(this);
		return p;
	}
	/**
	 * This public method instantiates a refund object and returns it
	 * @param String currency
	 * @param ArrayList<Tickets> t
	 * @param double amount
	 * @return Refund r
	 */
	public Refund createRefund(String currency, ArrayList<Tickets> t){
		double amount = 0;
		
		Refund r = new Refund(currency, t);
		for (int i = 0; i < t.size();i++){
			t.get(i).setIsSold(false);
			amount+=t.get(i).getPrice();
		}
		r.setAmount(amount);
		
		t.get(0).getScheduledConcert().revenue -= amount;
		r.setSource(t.get(0).getScheduledConcert());
		r.setDestination(this);
		return r;
	}

}
