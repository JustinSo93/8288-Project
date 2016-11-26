package domain;

/**
 * ConductorID class create conductorID as a String
 * @author Tyler, Heesook
 *
 */
public class ConductorID implements ID {

	String musCode = "CON";

	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Method createID returns conductorID as a String
	 */
	@Override
	public String createID() { return musCode.toString(); }

	/* NORMAL BEHAVIOR ------------------------------------------------- */
	/**
	 * Method toString returns ConductoriID with musCode and musCount
	 */
	@Override 
	public String toString(){
		musCount ++;
		return musCode + musCount;
	}

	/* ATTRIBUTES ----------------------------------------------------- */
	/** The attribute shows musCount as static integer  */
	public static int musCount;

} /*	End of CLASS:	ConductorID.java			*/
