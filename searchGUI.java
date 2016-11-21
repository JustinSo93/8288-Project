package domain;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import com.sun.corba.se.pept.transport.EventHandler;
import domain.Address.AddressBuilder;
import domain.Person.PersonBuilder;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class searchGUI extends Application{
	public String firstName;
	public String lastName;
    PhoneNumber phone;
    Address address;
    Person person;
	
	public Stage theStage;
	public Scene scene;
	

public searchGUI(){}
	
	public searchGUI(ArrayList<Person>symphony){
		
	
	}

	public  void start(Stage primaryStage, ArrayList<Object> symphony) throws Exception {

		Stage newStage = new Stage();
		newStage.setTitle("Search database");
		VBox vb = new VBox();
		vb.setSpacing(10);
		vb.setPrefWidth(400);
		Label welcomeLabel = new Label("What area would you like to search?");
		
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
		vb.getChildren().addAll( welcomeLabel, btn1, btn2, btn3, btn4, btn5);
	
	btn1.setOnMouseClicked(e -> {

		ArrayList<String> nameID = new ArrayList<> ();

		for (Object a : symphony)
		{
			ID id = ((Person) a).getID();
			String fname = ((Person) a).getFirstName();
			String lname = ((Person) a).getLastName();
			if(((Person) a).getFirstName() != null && (id.toString().matches("(?i)(ACC).*")));
			
			


			if(nameID.indexOf(fname) == -1)

			{

				nameID.add(id + ", " + fname + " " + lname);

			}


		}
		

		ListView<String> listV = new ListView<>();
		ObservableList<String> listData = FXCollections.observableArrayList();

		for(String s: nameID)


			listData.add(s); // this creates a string of street name and average

		
		listV.setItems(listData);
		vb.getChildren().add(listV);   
	  
		 
			
		});
	Scene scene = new Scene(vb);
	newStage.setScene(scene);
	newStage.show();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}