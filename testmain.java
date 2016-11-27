package domain;

import java.util.ArrayList;

public class testmain {

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
	Soloist s1 = new Soloist("Ella","Fitzgerald",new PhoneNumber("0123456789"),new Address.AddressBuilder(4, "Privet Dr.").build(),"@hotmail.com","Drums","Percussion", cldplist);
	soloists.add(s1);
	Composition jingleBells = new Composition("Jingle Bells", null, soloists, "Santa Claus");
	ArrayList<Composition> compositions = new ArrayList<Composition>();
	compositions.add(jingleBells);
	
	Conductor jack = new Conductor("Jack", "Nicholson", new PhoneNumber("4747478484"), new Address.AddressBuilder(500, "Street Street").build(), "jack@hotmail.com", "Baton", "Stick Group", null);
	Accompanist jill = new Accompanist("Jess" , "Stratton" , new PhoneNumber("6138991627"), new Address(), "jj@google.com" , "Sax" , "Woodwind");
	
	ArrayList<Accompanist> accomps = new ArrayList<Accompanist>();
	accomps.add(jill);
	Venues nac = new Venues(new Address.AddressBuilder(600, "Bank street").build(), 1500, 30, new PhoneNumber("4948483939"));
	
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
	}

}