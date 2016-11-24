package domain;

public class Movement {

	
	protected String movementName;
	
	public Movement(){
		this.movementName="";
	}
	
	public Movement(String m){
		this.movementName=m;
	}
	
	
	
	public String getMovementName(){
		return movementName;
		
	}
	
	public void setMovementName(String movementName){
		this.movementName = movementName;
	}
	
	
}