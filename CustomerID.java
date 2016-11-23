package domain;

public class CustomerID implements ID {

public static int musCount;
	
	
	String musCode = "CUS";



	@Override
	public String createID() {
				return musCode.toString();
				}
	
	@Override 
	public String toString(){
		musCount ++;
		return musCode + musCount;
	}
}
