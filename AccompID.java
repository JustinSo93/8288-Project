package domain;

/**
 * Subclass of IDFactory that will auto generate an ID key for an accompanist.  
 * @author tyyyl
 *
 */
public class AccompID implements ID{
	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * constructor that increments the ID code
	 */
	public AccompID(){
	this.id = accCount++;
	
	}
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * get method for the musCode
	 * @return musCode.toString
	 * 
	 */
	@Override
	public String createID() {
		    
			return accCode.toString();
	}
	
	/* HELPER METHODS	--------------------------------------------------	*/
	/**
	 * toString method for the ID code.
	 * @return musCount + musCode toString.
	 */
	@Override 
	public String toString(){
		
		return accCode + id;
	}

	/* ATTRIBUTES	-----------------------------------------------------	*/
	/**Variables that form the ID Key.
	 * @param public int musCount
	 * @param public String musCode
	 * 
	 */
		private int id;
		String accCode = "ACC";
	    private static int accCount;
	
}
