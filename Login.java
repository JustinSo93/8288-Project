package domain;


public class Login {
	
public Login(){}
 
 	    String username;
	    String password;

	    public String validate(){
	    if(username.equals(username) && password.equals(password)) 
	        return "You are logged in";
	    
	   else return "Invalid username or password, please try again";
		
  }
}

