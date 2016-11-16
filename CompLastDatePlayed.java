package symphony;

public class CompLastDatePlayed {
	Date lastDatePlayed;
	String composition;


	public CompLastDatePlayed(String x, Date lastPlayed) {
		this.composition = x;
		this.lastDatePlayed = lastPlayed;
	}
	
	public Date getLastDatePlayed() {
		return lastDatePlayed;
	}
	public void setLastDatePlayed(Date lastDatePlayed) {
		this.lastDatePlayed = lastDatePlayed;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}




}
