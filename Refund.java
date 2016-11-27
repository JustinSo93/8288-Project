package domain;

import java.util.ArrayList;
/**
 * this class creates a Refund object that extends FinancialTransaction
 * 
 * @author tyyyl
 *
 */
public class Refund  extends FinancialTransaction {


	/**
	 * empty constructor
	 */
	public Refund(){
		super();
	}
	/**
	 * parameterized constructor
	 * 
	 * @param currency
	 * @param sC
	 * @param amount
	 */
	public Refund (String currency, ScheduledConcert sC, double amount) {
		super(currency, sC, amount);
	}
	/**
	 * copy constructor 
	 * 
	 * @param String currency
	 * @param ArrayList<Tickets> t
	 */
	public Refund(String currency, ArrayList<Tickets> t){
		this.currency = currency;
		this.sC = t.get(0).getScheduledConcert();
		this.setTransactionID();
		this.calculateAmount(t);
		this.source = this.sC;


	}
	/**
	 * public set method sets the source of the purchase and checks to see if it the source is a ScheduledConcert object
	 * @param Object source
	 */
	@Override
	public void setSource(Object s) throws ClassCastException{
		try{
			if (source instanceof ScheduledConcert)
				this.source = (ScheduledConcert) s;
		}
		catch (ClassCastException e){
			e.printStackTrace();
		}
	}
	/**
	 * public get method that returns the source and checks to see if it is from a ScheduledConcert object
	 * @return Object source
	 */
	@Override
	public Object getSource() throws ClassCastException{
		try{
			if (source instanceof ScheduledConcert)
				this.source = (ScheduledConcert) this.source;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
		return this.source;
	}
	/**
	 * public set method that sets the value of the destination and checks to see if the destination is a ScheduledConcert object
	 * @param Object s
	 *
	 */
	@Override
	public void setDestination(Object s) throws ClassCastException{
		try{
			if(destination instanceof Customer)	
				this.destination = (Customer) s;
		}
		catch (ClassCastException e){
			e.printStackTrace();
		}
	}
	/**
	 * public get method that returns a destinations and checks to see if it is a Customer object
	 * @return Object destination
	 */
	@Override
	public Object getDestination () throws ClassCastException{
		try{
			if(destination instanceof Customer)	
				this.destination = (Customer) this.destination;
		}catch(ClassCastException e){
			e.printStackTrace();
		}
		return this.destination;
	}



}
