package domain;

public class Purchase extends FinancialTransaction{

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
			if (this.destination instanceof Venues)
			this.destination = (Venues) d;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public Object getDestination() throws ClassCastException{
		try{
			if (this.destination instanceof Venues)
			return (Venues) this.destination;
		} catch(ClassCastException e){
			e.printStackTrace();
		}
		return this.destination;
		
	}
	
}
