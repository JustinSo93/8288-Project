package domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import com.sun.corba.se.pept.transport.EventHandler;

import domain.Address.AddressBuilder;
import domain.Person.PersonBuilder;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainGUI extends Application{
	public String firstName;
	public String lastName;
    PhoneNumber phone;
    Address address;
    Person person;
	public MainGUI(){}
	

	
	
	public Stage theStage;
	public Scene scene;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
		
	
	}

	public  void start(Stage primaryStage) throws Exception {

		Stage theStage = primaryStage;
		primaryStage.setTitle("Main Menu");
		VBox vb = new VBox();
		vb.setSpacing(10);
		vb.setPrefWidth(400);
		Label mainLabel = new Label("What would you like to do today? ");
		

		Button btn1 = new Button();
		Button btn2 = new Button();
		Button btn3 = new Button();
		Button btn4 = new Button();
		
		btn1.setText("Add or edit an employee or customer");
		btn2.setText("Add or edit a performance, show or venue");
		btn3.setText("Buy tickets");
		btn4.setText("Search the existing database");
		
		vb.getChildren().addAll(mainLabel, btn1,  btn2, btn3, btn4);
		
		btn1.setOnMouseClicked(e -> {
		 PersonGUI makePerson = new PersonGUI();
		 try {
			makePerson.start(primaryStage);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}});
	
		Scene scene = new Scene(vb);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
