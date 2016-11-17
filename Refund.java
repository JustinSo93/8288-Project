package domain;

public class Refund  extends FinancialTransaction {

	
	@Override
	public void setSource(Object s) throws ClassCastException{
		try{
			if (source instanceof Venues)
			this.source = (Venues) s;
		}
		catch (ClassCastException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public Object getSource() throws ClassCastException{
		try{
			if (source instanceof Venues)
			this.source = (Venues) this.source;
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
