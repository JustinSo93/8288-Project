package domain;

import java.util.ArrayList;
/**
 * This class creates a Purchase object that extends FinancialTransaction
 * 
 * @author Tyler Woyiwada, Justin So
 *
 */

public class Purchase extends FinancialTransaction{
	
	/**
	 * empty Constructor
	 */
	
	public Purchase(){
		super();
	}
	
	/**
	 * Parameterized constructor
	 * @param String currency
	 * @param ScheduledConcert sC
	 * @param double amount
	 */
	public Purchase(String currency, ScheduledConcert sC, double amount) {
		super(currency, sC, amount);
	}
	
	/**
	 * copy constructor
	 * 
	 * @param String currency
	 * @param ArrayList<Tickets>t
	 */
	public Purchase(String currency, ArrayList<Tickets> t){
		this.currency = currency;
		this.sC = t.get(0).getScheduledConcert();
		this.setTransactionID();
		this.calculateAmount(t);
		this.destination = this.sC;
		
	}

/**
 * public set method sets the source of the purchase and checks to see if it the source is a customer object
 * @param Object source
 */
	@Override
	public void setSource(Object source) throws ClassCastException{
		try{
			if (this.source instanceof Customer)
			this.source = (Customer) source;
		} catch (ClassCastException e){
			e.printStackTrace();
		}
	}
	
/**
 * public get method that returns the source and checks to see if it is from a Customer object
 * @return Object source
 */
	@Override
	public Object getSource () throws ClassCastException{
		try{
			if (this.source instanceof Customer)
			return (Customer) this.source;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
		return this.source;
	}
/**
 * public set method that sets the value of the destination and checks to see if the destination is a ScheduledConcert object
 * @param Object d
 *
 */
	@Override
	public void setDestination(Object d) throws ClassCastException{
		try{
			if (this.destination instanceof ScheduledConcert)
			this.destination = (ScheduledConcert) d;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
	}

/**
 * public get method that returns a destinations and checks to see if it is a ScheduledConcert object
 * @return Object destination
 */
	@Override
	public Object getDestination() throws ClassCastException{
		try{
			if (this.destination instanceof ScheduledConcert)
			return (ScheduledConcert) this.destination;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
		return this.destination;
		
	}
	

	
}