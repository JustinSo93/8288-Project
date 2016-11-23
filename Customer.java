package domain;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Customer extends Person{
	
	public Customer (){
		super();
	}
	public Customer(String fName, String lName, PhoneNumber pn, Address address, String emailAddress  ){
		super(fName, lName, pn, address, emailAddress );
	}
	
	
	
	public Purchase createPurchase (String currency, ArrayList<Tickets> t){
		double amount = 0;
	
		Purchase p = new Purchase(currency, t);
		for (int i = 0; i < t.size();i++){
			t.get(i).setIsSold(true);
			amount+=t.get(i).getPrice();
			
		}
		p.setAmount(amount);
		//System.out.println(amount);
		t.get(0).getScheduledConcert().revenue += amount;
		
		
		p.setSource(this);
		return p;
	}
	
	public Refund createRefund(String currency, ArrayList<Tickets> t){
		double amount = 0;
		
		Refund r = new Refund(currency, t);
		for (int i = 0; i < t.size();i++){
			t.get(i).setIsSold(false);
			amount+=t.get(i).getPrice();
		}
		r.setAmount(amount);
		
		t.get(0).getScheduledConcert().revenue -= amount;
		
		r.setDestination(this);
		return r;
	}
	
	
	public static void main(String[] args) {
		ScheduledConcert sc = new ScheduledConcert();
		sc.generateTickets();
		Customer c = new Customer();
		c.browseTickets(sc);
		
	}
	
	
	

}
