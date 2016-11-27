package domain;

/**
 * This class creates a PhoneNumber object from a string that contains ten digits and reformats them. 
 * @author tyyyl
 *
 */
public class PhoneNumber{
	
/**
 * constructor
 * @param String s
 */
	
public PhoneNumber(String s) {
		// TODO Auto-generated constructor stub
	createID(s);
	}

/**
 * Attribute to be used within the class
 * @param StringBuilder sb
 */
public StringBuilder sb;

/**
 * public method that forms the string into a formatted phone number
 * @param s
 * @return StringBuilder sb to toString method
 */
public String createID(String s){
	
	    s = s.replaceAll("[^0-9]", ""); 
		 sb = new StringBuilder(15);
	    StringBuilder temp = new StringBuilder(s.toString());

	    while (temp.length() < 10)
	        temp.insert(0, "0");

	    char[] chars = temp.toString().toCharArray();
	  
	    sb.append("(");
	    for (int i = 0; i < chars.length; i++) {
	        if (i == 3)
	            sb.append(") ");
	        else if (i == 6)
	            sb.append("-");
	        sb.append(chars[i]);
	        	
	    }
	    
	    return sb.toString();
		
	}

/**
 * public toString method that returns a string version of a PhoneNumber Object
 * @return String "" +sb
 */
 @Override
    public String toString(){

	return "" +sb;
	
	}
}