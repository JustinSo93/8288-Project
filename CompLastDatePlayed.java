package domain;

/**This class is the composition and last date played of that composition, for the soloist and composition classes.
 * @author tyyyl
 *
 */

public class CompLastDatePlayed {
	
	/**
	 * Atrributes to be used within the class.
	 * @param Date lastDatePlayed
	 * @param String composition
	 */
	Date lastDatePlayed;
	String composition;

/**
 * constructor.
 * @param String x(composition)
 * @param lastPlayed(Date last played)
 */
	public CompLastDatePlayed(String x, Date lastPlayed) {
		this.composition = x;
		this.lastDatePlayed = lastPlayed;
	}
	
	/**
	 * public get method to return the lastDatePlayed
	 * @return Date lastDatePlayed
	 */
	public Date getLastDatePlayed() {
		return lastDatePlayed;
	}
	/**
	 * public set method to set the lastDatePlayed
	 * @param Date lastDatePlayed
	 */
	public void setLastDatePlayed(Date lastDatePlayed) {
		this.lastDatePlayed = lastDatePlayed;
	}
	/**
	 * public get method that returns the composition.
	 * @return String composition
	 */
	public String getComposition() {
		return composition;
	}
	/**
	 * public set method that sets the composition
	 * @param String composition
	 */
	public void setComposition(String composition) {
		this.composition = composition;
	}
/**
 * public toString method that returns a String version of CompLastDatePlayed
 * @param String composition
 * @param Date lastDatePlayed
 */
@Override
public String toString(){
	
	return composition + " " +lastDatePlayed;
}


}
