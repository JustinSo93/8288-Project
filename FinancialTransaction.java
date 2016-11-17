package domain;

public abstract class FinancialTransaction {
	
	protected String currency;
	protected Date date;
	protected ID id;
	protected double amount;
	protected Object source;
	protected Object destination;
	
	public FinancialTransaction(){
		this.currency = "";
		this.date = new Date(0,0,0);
		this.amount = 0;
		this.source = null;
		this.destination = null;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the source
	 */
	public Object getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(Object source) {
		this.source = source;
	}

	/**
	 * @return the destination
	 */
	public Object getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Object destination) {
		this.destination = destination;
	}
	
	
}
