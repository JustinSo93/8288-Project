package domain;

/**
 * This class creates a login object that will check to see if the password and login are the same
 * 
 * @author Tyler Woyiwada
 *
 */



public class Login {
	
	
	/* CONSTRUCTORS -------------------------------------------------- */	
		/**
		 * 
		 * empty constructor
		 */
		public Login(){}
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/

		/**
		 * public method that checks the validity of the password and login and returns a corresponding
		 * @return String "You are logged in"
		 * @return String "Invalid username or password, please try again"
		 */
		    public String validate(){
		    if(username.equals(username) && password.equals(password)) 
			return "You are logged in";

		   else return "Invalid username or password, please try again";
		    

		
  		}
			/* ATTRIBUTES ----------------------------------------------------- */
		    
			/**
			 * attributes to be used by the class
			 * @param String username
			 * @param String password
			 */
		 	   protected String username;
			   protected String password;    
}

