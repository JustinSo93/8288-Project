package symphony;

public class ConductorID implements ID {

public static int musCount;
	
	
	String musCode = "CON";



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
