package domain;

import javax.swing.JOptionPane;

/**
 * ConductorID class create conductorID as a String
 * @author Tyler, Heesook, Justin
 *
 */
public class Date {

	/* CONSTRUCTORS -------------------------------------------------- */
	/** The default constructor initializes variable */	
	public Date (){
		this.day =0;
		this.month = 0;
		this.year = 0;
	}

	/**
	 * The constructor Date initializes variables as int value of parameter d, m, y  
	 * @param d
	 * @param m
	 * @param y
	 */
	public Date(int d, int m, int y){
		this.day = d;
		this.month = m;
		this.year = y;
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
	 * Void method setDay sets a int variable day from 1 to 31
	 * @param day the day to set
	 */
	public void setDay(int day) {
		if (day <31 && day <=0){
			this.day = day;
		}
		else{
			while(day>31 || day<=0){
				String s = JOptionPane.showInputDialog("Error: Enter the day");
				day = Integer.parseInt(s);
			}
			this.day = day;
		}
	}

	/**
	 * Void method setMonth sets a int variable month from 1 to 12
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		if (month>0 && month<13){
			this.month = month;
		}else{
			while(month<0 || month>13){
				String s = JOptionPane.showInputDialog("Enter a month between 1 and 12");
				month = Integer.parseInt(s);
			}
			this.month = month;
		}
	}

	/**
	 * Void method setYear sets a int variable year from 2016 to 2100
	 * @param year the year to set
	 */
	public void setYear(int year) {
		if (year>1999 && year<2100){
			this.year = year;
		}else{
			while(year<2016 || year>2100){
				String s = JOptionPane.showInputDialog("Enter a year between 2016 and 2100");
				year = Integer.parseInt(s);
			}
		}
	}

	/* NORMAL BEHAVIOR ------------------------------------------------- */
	/** Method toString returns a set of date value as a String. */
	public String toString(){ return day+"/"+month+"/"+year; }

	/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------	*/
	/**
	 * The main() method print out the date set
	 * @param  args   Standard command line parameters (arguments) as a string array.
	 */
	public static void main(String[] args) {
		Date d = new Date(5,12,2014);
		System.out.println(d.toString());
	}

	/* ATTRIBUTES ----------------------------------------------------- */
	/** The attribute shows a day as a int value */
	private int day;
	/** The attribute shows a month as a int value */
	private int month;
	/** The attribute shows a year as a int value */
	private int year;

} /*	End of CLASS:	Date.java			*/
