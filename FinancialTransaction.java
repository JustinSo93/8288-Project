package domain;

import java.util.ArrayList;
/**This class will create a financial transaction object with various parameters
 *
 * @author Tyler Woyiwada, Justin So
*/	 

public abstract class FinancialTransaction {
	
	/**attributes to be used within the class
	 * @param currency
	 * @param sC
	 * @param amount
	 * @param source
	 * @param destination
	 */
	protected ArrayList<Tickets> t;
	protected String currency;
	protected ScheduledConcert sC;
	protected ID id;
	protected double amount;
	protected Object source;
	protected Object destination;
	
	/**
	 * empty constructor
	 */
	public FinancialTransaction(){
		this.currency = "";
		this.amount = 0;
		this.source = null;
		this.destination = null;
		this.sC = null;
	}
	/**
	 * constructor
	 * 
	 * @param currency
	 * @param sC
	 * @param amount
	 * @param source
	 * @param destination
	 */
	public FinancialTransaction(String currency, ScheduledConcert sC, double amount, Object source, Object destination){
		this.currency = currency;
		this.setTransactionID();
		this.amount = amount;
		this.source = source;
		this.destination = destination;
	}
	/**
	 * constructor
	 * 
	 * @param currency
	 * @param sC
	 * @param amount
	 */
	public FinancialTransaction(String currency, ScheduledConcert sC, double amount){
		this.currency = currency;
		this.sC = sC;
		this.setTransactionID();
		this.amount = amount;
		
	}
	/**public get method that returns the currency
	 * @return String currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**public set method that sets the currency 
	 * @param String currency
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**public get method that returns the amount(double)
	 * @return amount
	 */
	public double getAmount() {
		return amount;
	}

	/**public set method that sets the value of amount(double)
	 * @param double amount 
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**public get method that returns an instance of a source object
	 * @return Object source
	 */
	public Object getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(Object source) {
		this.source = source;
	}

	/**public get method that returns
	 * @return the destination
	 */
	public Object getDestination() {
		return destination;
	}

	/**public set method sets the value of a destination Object
	 * @param Object destination 
	 */
	public void setDestination(Object destination) {
		this.destination = destination;
	}
	/**
	 * public get method that returns an ID object
	 * @return ID id
	 */
	public ID getTransactionID() {
		
		return this.id;
	}

    /**
     * public set method that creates an ID object and sets it as the id for the transaction
     * @param ID id
     */
	public void setTransactionID() {
		 id = IDFactory.getID("TRN");
	}
	
	/**
	 * public method that calculates the total amount of the transaction
	 * 
	 * @param ArrayList<Tickets> t
	 */
	public void calculateAmount (ArrayList <Tickets> t){
		for (int i = 0; i < t.size()-1;i++){
			this.amount += t.get(i).getPrice();
		}
	}
	
	
}

