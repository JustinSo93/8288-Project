package domain;

import java.util.ArrayList;

import org.junit.Test;

public class testmain {
public static int musCount = 0;
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Movement m = new Movement("1st Movement");
	ArrayList<Movement> aM = new ArrayList<Movement>();
	aM.add(m);
	ArrayList<Soloist> aS = new ArrayList<Soloist>();
	Composition comp = new Composition("Enter Sandman", aM,aS,"Mozart");
	CompLastDatePlayed c = new CompLastDatePlayed(comp, new Date (12,4,2003));
	ArrayList<CompLastDatePlayed> cldplist = new ArrayList<CompLastDatePlayed>();
	cldplist.add(c);
	ArrayList<Soloist> soloists = new ArrayList<Soloist>();
	Soloist s1 = new Soloist("Ella","Fitzgerald",new PhoneNumber("0123456789"),(new Address.AddressBuilder(600, "Bank street").city("Ottawa").postalCode(new PostalCode("K1s2x4")).provinceState("ON").country("Canada").build()),"@hotmail.com","Drums","Percussion", cldplist);
	soloists.add(s1);
	Composition jingleBells = new Composition("Jingle Bells", null, soloists, "Santa Claus");
	ArrayList<Composition> compositions = new ArrayList<Composition>();
	compositions.add(jingleBells);	
	Conductor jack =  new Conductor("Jack", "Nicholson", new PhoneNumber("4747478484"),(new Address.AddressBuilder(600, "Bank street").city("Ottawa").postalCode(new PostalCode("K1s2x4")).provinceState("ON").country("Canada").build()), "jack@hotmail.com", "Baton", "Stick Group");
	Accompanist jill = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
	Accompanist jill2 = new Accompanist("Jill" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
	Soloist jill3 = new Soloist("Jill3" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind", cldplist);
	Soloist jill4 = new Soloist("Jill4" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind", cldplist);
	
	ArrayList<Accompanist> accomps = new ArrayList<Accompanist>();
	accomps.add(jill);
	Venues nac = new Venues();
	
	VenueDate christmasCarolOttawa = new VenueDate(nac, new Date(03,21,2017));
	Tickets tick001 = new Tickets(99.99, "AA55", true, null);
	ArrayList<Tickets>ticks = new ArrayList<Tickets>();
	ticks.add(tick001);
	
	ScheduledConcert aChristmasCarol = new ScheduledConcert(compositions, jack, accomps, christmasCarolOttawa, ticks);
	for (int i = 0; i < ticks.size(); i++){
	ticks.get(0).setScheduledConcert(aChristmasCarol);
	}
	
	ArrayList<ScheduledConcert> listofSC = new ArrayList<ScheduledConcert>();
	listofSC.add(aChristmasCarol);	
	jack.setScheduledConcerts(listofSC);
	System.out.print(aChristmasCarol.toString());
	System.out.print(m.toString());
	System.out.print((aS.toString()));
	System.out.print((comp.toString()));
	System.out.print((c.toString()));
	System.out.print((cldplist.toString()));
	System.out.print((s1.toString()));
	System.out.print((jingleBells.toString()));
	System.out.print((compositions.toString()));
	System.out.print((jack.toString()));
	System.out.print((jill.toString()));
	System.out.print((jill2.toString()));
	System.out.print((jill3.toString()));
	System.out.print((jill4.toString()));
	System.out.print((jill.toString()));
	System.out.print((accomps.toString()));
	System.out.print((nac.toString()));
	System.out.print((tick001.toString()));
	System.out.print((ticks.toArray()));
	}
SymphonyController test = new SymphonyController();

}
