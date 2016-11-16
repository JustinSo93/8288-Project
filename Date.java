package domain;

public class Date {

private int day;
private int month;
private int year;
	
	
	public Date (){
		this.day =0;
		this.month = 0;
		this.year = 0;
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
		this.day = day;
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
		this.month = month;
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
		this.year = year;
	}
	
	public String toString(){
		return day+"//"+month+"//"+year;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

