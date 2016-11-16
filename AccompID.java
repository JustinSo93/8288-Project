package domain;


public class AccompID implements ID{

	public static int musCount;
	
	
	String musCode = "ACC";



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

