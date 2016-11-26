package domain;

/**
 * Login class is for the validating username/password as the user input 
 * @author Tyler, Heesook
 * @version 1.0.0 11/26/2016
 */
public class Login {

	/* CONSTRUCTORS -------------------------------------------------- */
	/** Constructor Login initializes variable as a String */
	public Login(){}

	String username;
	String password;

	/* NORMAL BEHAVIOR ------------------------------------------------- */
	/**
	 * After validating user input, it shows the confirm message.
	 * @return String messages
	 */
	public String validate(){
		if(username.equals(username) && password.equals(password)) 
			return "You are logged in";

		else return "Invalid username or password, please try again";

	}
} /* end of class : Login.java*/
