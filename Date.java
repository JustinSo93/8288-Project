package domain;

/**
 * The Date class is contains all the attributes of a date such as day, month, yeare.
 * @author Tyler, Heesook
 * @version 1.0.0 11/26/2016
 */
public class Date {

	/* CONSTRUCTORS -------------------------------------------------- */
	/** The default constructor initializes variable */
	public Date() {	}
	
	/**
	 * The constructor Date initializes variables as int value of parameter x, y, z  
	 * @param x
	 * @param y
	 * @param z
	 */
	public Date(int x, int y, int z) {
		this.day = x;
		this.month = y;
		this. year = z;
	}

	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * public get method that returns the value of day
	 * @return the day
	 */
	public int getDay() { return day; }

	/**
	 * public get method that returns the value of month
	 * @return the month
	 */
	public int getMonth() { return month; }
	
	/**
	 * public get method that returns the value of year
	 * @return the year
	 */
	public int getYear() { return year; }

	/* MODIFIERS ----------------------------------------------------- */
	/**
	 * Void method setDay sets a int variable day
	 * @param day the day to set
	 */
	public void setDay(int day) { this.day = day; }
	
	/**
	 * Void method setMonth sets a int variable month
	 * @param month the month to set
	 */
	public void setMonth(int month) { this.month = month; }

	/**
	 * Void method setYear sets a int variable year
	 * @param year the year to set
	 */
	public void setYear(int year) { this.year = year; }

	/* NORMAL BEHAVIOR ------------------------------------------------- */
	/**
	 * Method toString returns a set of date value as a String.
	 */
	public String toString(){ return day+"//"+month+"//"+year; }

	/* ATTRIBUTES ----------------------------------------------------- */

	/** The attribute shows a day as a int value */
	private int day;
	/** The attribute shows a month as a int value */
	private int month;
	/** The attribute shows a year as a int value */
	private int year;
	
}/* end of class : Date.java*/
