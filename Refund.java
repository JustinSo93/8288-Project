package domain;

import java.util.ArrayList;

public class Refund  extends FinancialTransaction {

	
	
	public Refund(){
		super();
	}
	
	public Refund (String currency, ScheduledConcert sC, double amount) {
		super(currency, sC, amount);
	}
	
	public Refund(String currency, ArrayList<Tickets> t){
		this.currency = currency;
		this.sC = t.get(0).getScheduledConcert();
		this.setTransactionID();
		this.calculateAmount(t);
		this.source = this.sC;
		
		
	}
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
