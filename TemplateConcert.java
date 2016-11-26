package domain;
import java.util.ArrayList;

public class TemplateConcert {
	
	
	/* CONSTRUCTORS -------------------------------------------------- */
	
	/**
	 * Empty constructor
	 */
	public TemplateConcert(){
		this.conductor = new Conductor("","", new PhoneNumber(""), new Address.AddressBuilder(0, "").build(), "", "", "", new ArrayList<ScheduledConcert>());
		this.listOfAccompanists = new ArrayList<Accompanist>();
		this.listOfCompositions = new ArrayList<Composition>();

	}
	
	/**
	 * Fully parameterized constructor
	 * @param lC is of type ArrayList<Composition>
	 * @param c is of type Conductor
	 * @param lA is of type ArrayList <Accompanist>
	 */
	public TemplateConcert(ArrayList<Composition> lC, Conductor c, ArrayList<Accompanist> lA){
		this.listOfCompositions = lC;
		this.listOfAccompanists = lA;

		this.conductor = c;
	}
	
	/* ACCESSORS ----------------------------------------------------- */
	/**
	 * This method returns the conductor
	 * @return conductor
	 */
	public Conductor getConductor(){
		return this.conductor;
	}
	
	/* MODIFIERS ----------------------------------------------------- */
	
	
	public void addComposition (Composition c){
		listOfCompositions.add(c);
	}
	
	
	public void removeComposition(Composition c){
		for (int i =0; i<listOfCompositions.size();i++){
			if (listOfCompositions.get(i).getCompositionName() .equals(c.getCompositionName())){
				listOfCompositions.remove(i);
			}
		}
	}

	public void addAccompanist (Accompanist a){
		listOfAccompanists.add(a);
	}
	
	public void removeAccompanist (Accompanist a){
		for (int i = 0; i < listOfAccompanists.size();i++){
			if (listOfAccompanists.get(i).accompID == a.accompID){
				listOfAccompanists.remove(i);
			}
		}
	}
	

	
	public void setConductor (Conductor c){
		this.conductor = c;
	}
	
	/* ATTRIBUTES ----------------------------------------------------- */
	
	/** The attribute listOfCompositions is of type ArrayList<Composition> */
	private ArrayList<Composition> listOfCompositions;

	/** The attribute conductor is of type Conductor*/
	private Conductor conductor;
	
	/** The attribute listOfAccompanists is of type ArrayList<Accompanists>*/
	private ArrayList<Accompanist> listOfAccompanists;
	

}
