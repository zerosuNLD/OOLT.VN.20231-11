package Model2.Virus;

import java.util.ArrayList;
import java.util.HashMap;

import Model2.Biological_Element;
import Model2.Protein_molecules;


public class Viral_Envelope extends Protein_molecules {
	
	

	public Viral_Envelope(ArrayList<String> structure) {
		// TODO Auto-generated constructor stub
		super(structure);
		this.structure=structure;
	}
	
	
    
	
	
    public void require_signal() {};
	
	public void transport_signal() {};
	
	
	
	
	public String putString() {return null;}
	

}
