package symphony;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import com.sun.corba.se.pept.transport.EventHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import symphony.Address.AddressBuilder;
import symphony.Person.PersonBuilder;

public class PersonGUI extends Application{
	public String firstName;
	public String lastName;
    PhoneNumber phone;
    Address address;
    Person person;
	public PersonGUI(){}
	
	public PersonGUI(PersonBuilder test){
		
	this.test=test;
	}
	
	public ArrayList<Person> symphony = new ArrayList();
	public ArrayList<String> shows = new ArrayList();
	public ArrayList<String> staffShows = new ArrayList();
	public ArrayList<CompLastDatePlayed> compositionsDate = new ArrayList();
	private PersonBuilder test;
	public Stage theStage;
	public Scene scene;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	
	}

	public  void start(Stage primaryStage) throws Exception {

		Stage theStage = primaryStage;
		primaryStage.setTitle("Musician Builder");
		VBox vb = new VBox();
		vb.setSpacing(10);
		vb.setPrefWidth(400);
		Label fNameLabel = new Label("Enter the first name of the person: ");
		TextField fNameTextField = new TextField ();
		Label lNameLabel = new Label("Enter the last name of the person: ");
		TextField lNameTextField = new TextField ();
		fNameTextField.setText("*first name");
		lNameTextField.setText("*last name");
		Label phoneNumberLabel = new Label("Enter the phone number: ");
		TextField phoneTextField = new TextField();
		phoneTextField.setText(" *phone ");
		Label streetNumLabel = new Label("Enter the house number:  ");
		TextField streetNumTextField = new TextField();
		Label streetLabel = new Label("Enter the street name:  ");
		TextField streetTextField = new TextField();
		Label cityLabel = new Label("Enter the city name:   ");
		TextField cityTextField = new TextField();
		Label postalCodeLabel = new Label("Enter the postal code:  ");
		TextField postalCodeTextField = new TextField();
		Label provinceStateLabel = new Label("Enter the province or state:  ");
		TextField provinceStateTextField = new TextField();
		Label countryLabel = new Label("Enter the country:  ");
		TextField countryTextField = new TextField();
		Button saveAndCont = new Button("Save and Continue");
		Label options = new Label();
		options.setText("What type of person would you like to add to the system?");
		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		Button btn5 = new Button();
		btn1.setText("Accompanist");
		btn2.setText("Soloist");
		btn3.setText("Conductor");
		btn4.setText("Staff Member");
		btn5.setText("Customer");
		vb.getChildren().addAll(fNameLabel, fNameTextField,  lNameLabel, lNameTextField, phoneNumberLabel, phoneTextField, streetNumLabel, 
				streetNumTextField, streetLabel, streetTextField, cityLabel, cityTextField, postalCodeLabel, postalCodeTextField, 
				provinceStateLabel, provinceStateTextField, countryLabel, countryTextField,  saveAndCont, options, btn1, btn2, btn3, btn4, btn5);
	
	saveAndCont.setOnMouseClicked(e -> {

	      firstName = fNameTextField.getText();
	      lastName = lNameTextField.getText();
	      phone = new PhoneNumber(phoneTextField.getText());
	      int streetNumber = Integer.parseInt(streetNumTextField.getText());
	      String streetName = streetTextField.getText();
	      String city = cityTextField.getText();
	      String province = provinceStateTextField.getText();
	      String postalCode = postalCodeTextField.getText();
	      String country = countryTextField.getText();
	      
		  address = new Address.AddressBuilder(streetNumber, streetName).city(city).provinceState(province).postalCode(postalCode).country(country).build();
		  person = new Person.PersonBuilder(firstName).lastName(lastName).phoneNumber(phone).address(address).build();
		 // System.out.println(person.toString());
		 
			
		});
		
	  
	btn1.setOnMouseClicked(e -> {
	  try {
		openAccompanistStage(person, scene);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}});
	
	btn2.setOnMouseClicked(e -> {
		  try {
			openSoloistStage(person, scene);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}});
	btn3.setOnMouseClicked(e -> {
		  try {
			openConductorStage(person, scene);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}});
	
	btn4.setOnMouseClicked(e -> {
		  try {
			openStaffStage(person, scene);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}});
	  
		Scene scene = new Scene(vb);
		primaryStage.setScene(scene);
		primaryStage.show();
}
		protected void openAccompanistStage(Person person, Scene scene) throws IOException{
			
			VBox root = new VBox();
			Stage newStage = new Stage();
			Scene newScene = new Scene(root, 500, 500);
			Label instrumentLabel = new Label("Enter the instrument of the accompanist: ");
			TextField instrumentText = new TextField ();
			instrumentText.setText("*instrument");
			Label instrumentGroupLabel = new Label("Enter the instrument group for the accompanist: ");
			TextField instrumentGroupText = new TextField();
			instrumentGroupText.setText(" *instrument group: ");
			Button saveAccomp = new Button("Save");
			Button back = new Button("Back");
			Button done = new Button("Exit");
			Button print = new Button("Print");
			root.getChildren().addAll(instrumentLabel, instrumentText, instrumentGroupLabel, instrumentGroupText, saveAccomp, back, done, print);
			saveAccomp.setOnMouseClicked(e -> {
                 String instrumentGroup = instrumentGroupText.getText();
                 String instrument = instrumentText.getText();
                 Accompanist accomp1 = new Accompanist(person.firstName,person.lastName,person.getphoneNumber(),person.address,instrument, instrumentGroup);
                 //System.out.println(accomp1);
			     symphony.add(accomp1);
			});
			back.setOnMouseClicked(e -> {

	           
				theStage.setScene(scene); 
                newStage.close();           
	            
	        });
			print.setOnMouseClicked(e -> {

			   
			     System.out.println(symphony);
		
			});
			newStage.setScene(newScene);
			newStage.show();
			
	}
		
		
protected void openConductorStage(Person person, Scene scene) throws IOException{
			
			VBox root = new VBox();
			Stage newStage = new Stage();
			Scene newScene = new Scene(root, 500, 500);
			Label instrumentLabel = new Label("Enter the instrument of the conductor: ");
			TextField instrumentText = new TextField ();
			instrumentText.setText("*instrument");
			Label instrumentGroupLabel = new Label("Enter the instrument group for the conductor: ");
			TextField instrumentGroupText = new TextField();
			instrumentGroupText.setText(" *instrument group: ");
			Label conductorShowLabel = new Label("Enter a Show name for the conductor, then press save show.  you may add multiple shows.");
			TextField conductorShowTextField = new TextField();
			conductorShowTextField.setText(" *enter a show ");
			Button saveShow = new Button("Save Show");
			Button saveCon = new Button("Save Conductor");
			Button back = new Button("Back");
			Button done = new Button("Exit");
			Button print = new Button("Print");
			root.getChildren().addAll(instrumentLabel, instrumentText, instrumentGroupLabel, instrumentGroupText, conductorShowLabel, conductorShowTextField, saveShow, saveCon, back, done, print);
			saveCon.setOnMouseClicked(e -> {
                 String instrumentGroup = instrumentGroupText.getText();
                 String instrument = instrumentText.getText();
                 Conductor conductor = new Conductor(person.firstName,person.lastName,person.getphoneNumber(),person.address,instrument, instrumentGroup, shows);
                 conductor.getID();
                 //System.out.println(conductor);
			     symphony.add(conductor);
			});
			saveShow.setOnMouseClicked(e -> {
				
				shows.add(conductorShowTextField.getText());
				conductorShowTextField.setText(" *enter another show, or click 'Save Conductor' to save the conductor ");
			    
			});
			back.setOnMouseClicked(e -> {

	           
	                theStage.setScene(scene); 
	                newStage.close();
	            
	        });
			print.setOnMouseClicked(e -> {

			     //System.out.println(accompanists);
			     System.out.println(symphony);
			     //System.out.println(shows);
		
			});
			newStage.setScene(newScene);
			
			newStage.setScene(newScene);
			newStage.show();
			
			
	}
		
protected void openSoloistStage(Person person, Scene scene) throws IOException{
	
	VBox root = new VBox();
	Stage newStage = new Stage();
	Scene newScene = new Scene(root, 500, 500);
	Label instrumentLabel = new Label("Enter the instrument of the soloist: ");
	TextField instrumentText = new TextField ();
	instrumentText.setText("*instrument");
	Label instrumentGroupLabel = new Label("Enter the instrument group for the soloist: ");
	TextField instrumentGroupText = new TextField();
	instrumentGroupText.setText(" *instrument group: ");
	Label soloistCompLabel = new Label("Enter a composition and last date played for the soloist, then press save composition.  you may add multiple compositions.");
	TextField soloistCompTextField = new TextField();
	soloistCompTextField.setText(" *enter a composition ");
	TextField soloistDayTextField = new TextField();
	soloistDayTextField.setText(" *day ");
	TextField soloistMonthTextField = new TextField();
	soloistMonthTextField.setText(" *month ");
	TextField soloistYearTextField = new TextField();
	soloistYearTextField.setText(" *year ");
	Button saveComp = new Button("Save composition and date");
	Button saveSoloist = new Button("Save Soloist");
	Button back = new Button("Back");
	Button done = new Button("Exit");
	Button print = new Button("Print");
	root.getChildren().addAll(instrumentLabel, instrumentText, instrumentGroupLabel, instrumentGroupText, soloistCompLabel, 
			                  soloistCompTextField, soloistDayTextField, soloistMonthTextField, soloistYearTextField,saveComp, 
			                  saveSoloist, back, done, print);
	saveSoloist.setOnMouseClicked(e -> {
         String instrumentGroup = instrumentGroupText.getText();
         String instrument = instrumentText.getText();
         
         Soloist soloist = new Soloist(person.firstName,person.lastName,person.getphoneNumber(),person.address,instrument, instrumentGroup, compositionsDate);
         soloist.getID();
         //System.out.println(soloist);
	     symphony.add(soloist);
	});
	saveComp.setOnMouseClicked(e -> {
		 Date lastPlayed = new Date(Integer.parseInt(soloistDayTextField.getText()),
				                    Integer.parseInt(soloistMonthTextField.getText()),
				                    Integer.parseInt(soloistYearTextField.getText()));
		compositionsDate.add(new CompLastDatePlayed(soloistCompTextField.getText(), lastPlayed));
		soloistCompTextField.setText(" *enter another composition, or click 'Save soloist' to save the soloist ");
	});
	back.setOnMouseClicked(e -> {

       
            theStage.setScene(scene); 
            newStage.close();
        
    });
	print.setOnMouseClicked(e -> {

	     //System.out.println(accompanists);
	     System.out.println(symphony);
	    // System.out.println(shows);

	});
	newStage.setScene(newScene);
	
	newStage.setScene(newScene);
	newStage.show();
	
	
}

protected void openStaffStage(Person person, Scene scene) throws IOException{
	
	VBox root = new VBox();
	Stage newStage = new Stage();
	Scene newScene = new Scene(root, 500, 500);
	Label jobLabel = new Label("Enter the staff members job: ");
	TextField jobText = new TextField ();
	jobText.setText("*job");
	Label staffShowLabel = new Label("Enter a show that the staff member works on, then press save show.  you may add multiple shows.");
	TextField staffShowTextField = new TextField();
	staffShowTextField.setText(" *enter a show ");
	Button saveShow = new Button("Save Show");
	Button saveStaff = new Button("Save Staff Member");
	Button back = new Button("Back");
	Button done = new Button("Exit");
	Button print = new Button("Print");
	root.getChildren().addAll(jobLabel, jobText, staffShowLabel, staffShowTextField, saveShow, saveStaff, back, done, print);
	saveStaff.setOnMouseClicked(e -> {
         String job = staffShowTextField.getText();
//         String  = instrumentText.getText();
//         StaffMember staff = new StaffMember(person.firstName,person.lastName,person.getphoneNumber(),person.address,instrument, instrumentGroup);
//         //System.out.println(accomp1);
	     //symphony.add();
	});
	back.setOnMouseClicked(e -> {

       
		theStage.setScene(scene); 
        newStage.close();           
        
    });
	print.setOnMouseClicked(e -> {

	   
	     System.out.println(symphony);

	});
	newStage.setScene(newScene);
	newStage.show();
	
}

}
	

