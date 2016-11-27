package domain;

import javax.swing.JOptionPane;

public class Date {

private int day;
private int month;
private int year;
	
	
	public Date (){
		this.day = 1;
		this.month =  1;
		this.year = 1900;
	}
	
	public Date(int d, int m, int y){
		this.day = d;
		this.month = m;
		this.year = y;
	}
		/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	
	
	
	/**
	 * @param day the day to set
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
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	
	
	
	/**
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
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	
	
	
	/**
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
	
	public String toString(){
		return day+"/"+month+"/"+year;
	}
	




}
