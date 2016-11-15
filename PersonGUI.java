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

	public PersonGUI(){}
	
	public PersonGUI(PersonBuilder test){
		
	this.test=test;
	}
	public ArrayList accompanists = new ArrayList();
	public ArrayList symphony = new ArrayList();
	private PersonBuilder test;
	public Stage theStage;
	public Scene scene;
//	public Person construct(String n, ArrayList symphony){
//		
//		test.setInstrumentGroup("Brass");
//		test.setAddress("nowhere st.");
//		test.setinstrumentName("trumpet");
//		test.setMusicianID(001);
//		test.setMusicianName(n);
//		test.setPhoneNumber("234234");
//		test.setSoloist(true);
//		System.out.println(test.getResult().toString());
//		symphony.add(test);
//		
//		System.out.println(symphony.toString());
//		return test.getResult();
//	}
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
		Label address = new Label("Enter their address:  ");
		TextField add = new TextField();

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
		vb.getChildren().addAll(fNameLabel, lNameLabel, fNameTextField, lNameTextField, phoneNumberLabel, phoneTextField, address, add,  options, btn1, btn2, btn3, btn4, btn5);
		
		 
		ID venue1 = IDFactory.getID("V");
		ID venue2 = IDFactory.getID("V");
		ID musician1 = IDFactory.getID("M");
		ID musician2 = IDFactory.getID("M");
		ID ticket1 = IDFactory.getID("T");
		ID ticket2 = IDFactory.getID("T");
		ID ticket3 = IDFactory.getID("T");
		
		
		System.out.println(venue1 +  "," + venue2 +","+ musician1 +"," + musician2 +","+ ticket1 + "," + ticket2 + "," + ticket3);
		//PhoneNumber test = (PhoneNumber) new PhoneNumber(phone.getText());
		//System.out.println(String.valueOf(test));
		
		 
		btn1.setOnMouseClicked(e -> {

	      firstName = fNameTextField.getText();
	      lastName = lNameTextField.getText();
	      PhoneNumber p = new PhoneNumber(String.valueOf(phoneTextField.getText()));
		  Address a = new Address.AddressBuilder(40, "Somerset").city("Ottawa").build();
		  Person person1 = new Person.PersonBuilder(firstName).phoneNumber(p).address(a).build();
		  System.out.println(person1.toString());
		  //System.out.println(phoneTextField.toString());
		  person1 = new Accompanist();
		  
		  try {
			openOtherStage(person1, scene);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			//PersonGUI foo  = new PersonGUI(builder);
			//System.out.println(foo.construct(n, symphony).toString());
			
		});
		
		Scene scene = new Scene(vb);
		primaryStage.setScene(scene);
		primaryStage.show();
}
		protected void openOtherStage(Person person1, Scene scene) throws IOException{
			
			VBox root = new VBox();
			Stage newStage = new Stage();
			Scene newScene = new Scene(root, 500, 500);
			Label instrumentLabel = new Label("Enter the instrument of the accompanist: ");
			TextField instrument = new TextField ();
			instrument.setText("*instrument");
			Label instrumentGroupLabel = new Label("Enter the instrument group for the accompanist: ");
			TextField instrumentGroup = new TextField();
			instrumentGroup.setText(" *instrument group: ");
			Button save = new Button("Save");
			Button back = new Button("Back");
			Button done = new Button("Exit");
			Button print = new Button("Print");
			root.getChildren().addAll(instrumentLabel, instrument, instrumentGroupLabel, instrumentGroup, save, back, done, print);
			save.setOnMouseClicked(e -> {

			      accompanists.add(person1.toString());
			});
			back.setOnMouseClicked(e -> {

	           
	                theStage.setScene(scene);             
	            
	        });
			print.setOnMouseClicked(e -> {

			     System.out.println(accompanists);
			     System.out.println(symphony);
		
			});
			newStage.setScene(newScene);
			newStage.show();
			
	}

}
	

