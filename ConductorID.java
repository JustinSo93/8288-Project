package domain;

public class ConductorID implements ID {

	String musCode = "CON";

	@Override
	public String createID() { return musCode.toString(); }

	@Override 
	public String toString(){
		musCount ++;
		return musCode + musCount;
	}

	/* ATTRIBUTES ----------------------------------------------------- */
	public static int musCount;

}
