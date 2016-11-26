package domain;

import java.util.ArrayList;

public abstract class FinancialTransaction {
	protected ArrayList<Tickets> t;
	protected String currency;
	protected ScheduledConcert sC;
	protected ID id;
	protected double amount;
	protected Object source;
	protected Object destination;
	
	public FinancialTransaction(){
		this.currency = "";
		this.amount = 0;
		this.source = null;
		this.destination = null;
		this.sC = null;
		this.setTransactionID();
	}
	
	public FinancialTransaction(String currency, ScheduledConcert sC, double amount, Object source, Object destination){
		this.currency = currency;
		this.setTransactionID();
		this.amount = amount;
		this.source = source;
		this.destination = destination;
		this.setTransactionID();
	}
	
	public FinancialTransaction(String currency, ScheduledConcert sC, double amount){
		this.currency = currency;
		this.sC = sC;
		this.setTransactionID();
		this.amount = amount;
		
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the source
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

	/**
	 * @return the destination
	 */
	public Object getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Object destination) {
		this.destination = destination;
	}
	
	public ID getTransactionID() {
		
		return this.id;
	}


	public void setTransactionID() {
		 id = IDFactory.getID("TRN");
	}
	public void calculateAmount (ArrayList <Tickets> t){
		for (int i = 0; i < t.size()-1;i++){
			this.amount += t.get(i).getPrice();
		}
	}
	
	
}
