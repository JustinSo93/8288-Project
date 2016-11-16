package domain;

public class CustomerID implements ID{
	
	public static int custCount;
	String custCode = "C";
	
@Override
	public String createID() {
		return custCode.toString();
	}
	
	@Override 
	public String toString(){
		custCount ++;
		return custCode + custCount;
	}
	 
	
}
