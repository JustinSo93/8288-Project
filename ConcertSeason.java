package domain;

import java.util.ArrayList;
import java.util.Calendar;

/**This ConcertSeason class will contain all the concerts in an array, along with as Start Date and End Date.
 * 
 * @author Tyler Woyiwada, Justin So, Jessica Stratton
 *
 */
public class ConcertSeason {

	/* CONSTRUCTORS ----------------------------------------------------- */
	/**
	 * empty constructor.
	 */
	public ConcertSeason(){}



	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * public get method that returns the arraylist of concerts in the season
	 * @return concerts
	 */
	public ArrayList<ScheduledConcert> getConcerts() {
		return concerts;
	}

	/**
	 * public get method that returns the startDate of the season
	 * @return Date startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * public get method that returns the endDate of the season
	 * 
	 * @return endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/* MODIFIERS ----------------------------------------------------- */

	/**
	 * public set method that sets the value for concerts
	 * @param concerts
	 */
	public void setConcerts(ArrayList<ScheduledConcert> concerts) {
		this.concerts = concerts;
	}
	/**
	 * public set method that sets the value for startDate
	 * @param Date startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * public set method that sets the value for endDate
	 * @param Date endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	/**
	 * public method that will set the type of concert by checking if the date of the concert is before or after
	 * the current date.  		
	 *@param ScheduledConcert x
	 *@param Calendar c
	 *@param int year
	 *@param int month
	 *@param int dayOfMonth
	 *@param Date dateSpecified
	 *@param PerformedConcert performed
	 */
	public void setConcertType(ScheduledConcert x){
		Calendar c = Calendar.getInstance();


		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		java.util.Date today = c.getTime();
		int year = x.getVenueDate().getDate().getYear();
		int month = x.getVenueDate().getDate().getYear();
		int dayOfMonth = x.getVenueDate().getDate().getDay();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, dayOfMonth);

		java.util.Date dateSpecified = c.getTime();
		if (dateSpecified.before(today)) {
			PerformedConcert performed = new PerformedConcert(x.listOfCompositions, x.getConductor(),x.listOfAccompanists, x.getVenueDate(), x.getTicketList(), 0 );
			performed.calculate();
			concerts.add(performed);
			concerts.remove(x);
		} else {
			concerts.add(x);
		}
	}

	/* ATTRIBUTES ----------------------------------------------------- */

	/**
	 * attributes within the class.
	 * @param ArrayList<ScheduledConcert>concerts
	 * @param Date startDate
	 * @param Date endDate
	 */
	private ArrayList<ScheduledConcert> concerts = new ArrayList<ScheduledConcert>();
	private Date startDate;
	private Date endDate;
	
}