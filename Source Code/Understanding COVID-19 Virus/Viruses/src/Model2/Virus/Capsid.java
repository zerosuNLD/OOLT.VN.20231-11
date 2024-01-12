package Model2.Virus;

import java.util.ArrayList;
import java.util.HashMap;

import Model2.Biological_Element;
import Model2.Protein_molecules;
import Virus.GUI_Virus;

public class Capsid extends Protein_molecules  {
	
	

	public Capsid(String identity,ArrayList<String> structure) {
		// TODO Auto-generated constructor stub
		super(structure);
		this.structure=structure;
		this.identity = identity;
	}
	
	
	
    
    public void require_signal() {};
	
	public void transport_signal() {};
	
	
	
	
	

}
