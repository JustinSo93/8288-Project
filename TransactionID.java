package domain;

public class TransactionID implements ID{



	public static int transCount;
	
	
	String transCode = "Trans";



	@Override
	public String createID() {
				return transCode.toString();
	}
	
	@Override 
	public String toString(){
		transCount ++;
		return transCode + transCount;
	}

	
}
	 
