package domain;

import java.util.ArrayList;

public class Purchase extends FinancialTransaction{
	
	
	public Purchase(){
		super();
	}
	
	
	public Purchase(String currency, ScheduledConcert sC, double amount) {
		super(currency, sC, amount);
	}
	
	public Purchase(String currency, ArrayList<Tickets> t){
		this.currency = currency;
		this.sC = t.get(0).getScheduledConcert();
		this.setTransactionID();
		this.calculateAmount(t);
		this.destination = this.sC;
		
	}


	@Override
	public void setSource(Object source) throws ClassCastException{
		try{
			if (this.source instanceof Customer)
			this.source = (Customer) source;
		} catch (ClassCastException e){
			e.printStackTrace();
		}
	}
	
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
	
	@Override
	public void setDestination(Object d) throws ClassCastException{
		try{
			if (this.destination instanceof ScheduledConcert)
			this.destination = (ScheduledConcert) d;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
	}
	
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
