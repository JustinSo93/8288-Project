package symphony;


public class MusicianID implements ID{

	public static int musCount;
	
	
	String musCode = "MUS";



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

