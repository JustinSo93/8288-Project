package domain;

import javax.swing.JOptionPane;

/**
 * 	The Date class contaisn attributes day, month and year stored as ints.
 * @author Justin, So
 * @version 1.0.0 11/25/2016
 *
 */
public class Date {


	
/* CONSTRUCTORS -------------------------------------------------- */
	
	/** Empty constructor. Sets the date to January 1st, 1900 */
	public Date (){
		this.day = 1;
		this.month =  1;
		this.year = 1900;
	}
	
	/** Fully parameterized constructor */
	public Date(int d, int m, int y){
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	/* ACCESSORS ----------------------------------------------------- */
		/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	/* MODIFIERS ----------------------------------------------------- */
	
	/**
	 * Void method which sets the day. Doesn't allow days greater than 31 or less than 0
	 * @param day
	 */
	public void setDay(int day) {
		if (day <31 && day >0){
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
	 * Void method which sets the month. Doesn't allow months greater than 12 or less than 0
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
	 * Void method which sets the year. Doesn't allow years greater than 2100 or less than 1900
	 * @param year the year to set
	 */
	public void setYear(int year) {
		if (year>1900 && year<2100){
			this.year = year;
		}else{
			while(year<1900 || year>2100){
				String s = JOptionPane.showInputDialog("Enter a year between 1900 and 2100");
				year = Integer.parseInt(s);
			}
		}
	}
	
	/* HELPER METHODS ----------------------------------------------------- */
	/**
	 * This method toString sets the display format for the attributes
	 */
	public String toString(){
		return day+"/"+month+"/"+year;
	}
	
	/* ATTRIBUTES ----------------------------------------------------- */
	/** Private attribute day as an int */
	private int day;
	/** Private attribute month as an int */
	private int month;
	/** Private attribute year as an int */
	private int year;



}
