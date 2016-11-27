package domain;

/**This class is the composition and last date played of that composition, for the soloist and composition classes.
 * @author tyyyl
 *
 */

public class CompLastDatePlayed {
	

	/* CONSTRUCTORS -------------------------------------------------- */
	/**
	 * Empty constructor
	 */
	public CompLastDatePlayed(){
		this.composition = new Composition();
		this.lastDatePlayed = new Date();
	}
	
/**
 *  Fully parameterized constructor.
 * @param Composition x(composition)
 * @param lastPlayed(Date last played)
 */
	public CompLastDatePlayed(Composition x, Date lastPlayed) {
		this.composition = x;
		this.lastDatePlayed = lastPlayed;
	}
	
	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * public get method to return the lastDatePlayed
	 * @return Date lastDatePlayed
	 */
	public Date getLastDatePlayed() {
		return lastDatePlayed;
	}

	/**
	 * public get method that returns the composition.
	 * @return Composition composition
	 */
	public Composition getComposition() {
		return composition;
	}
	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * public set method to set the lastDatePlayed
	 * @param Date lastDatePlayed
	 */
	public void setLastDatePlayed(Date lastDatePlayed) {
		this.lastDatePlayed = lastDatePlayed;
	}
	/**
	 * public set method that sets the composition
	 * @param Composition composition
	 */
	public void setComposition(Composition composition) {
		this.composition = composition;
	}
	/* HELPER METHODS ----------------------------------------------------- */
	/**
	 * public toString method that returns a String version of CompLastDatePlayed
	 * @param Composition composition
	 * @param Date lastDatePlayed
	 */
	@Override
	public String toString(){
		
		return composition.getCompositionName() + " " +lastDatePlayed.toString();
	}
/* ATTRIBUTES ----------------------------------------------------- */
/** The attribute shows lastDatePlayed as a Date */
protected Date lastDatePlayed;
/** The attribute shows composition as a Composition */
protected Composition composition;
}
