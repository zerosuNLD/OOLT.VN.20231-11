package Model2.Virus;

import java.util.ArrayList;
import java.util.HashMap;

import Model2.Biological_Element;
import Model2.Protein_molecule;
import Virus.GUI_Virus;

public class Capsid extends Protein_molecule  {
	
	

	public Capsid(String gene,String structure) {
		// TODO Auto-generated constructor stub
		super(gene,structure);
		this.structure=structure;
		this.gene = gene;
	}
	
	
	
    
    public void require_signal() {};
	
	public void transport_signal() {}




	@Override
	public String getGene() {
		// TODO Auto-generated method stub
		return this.gene;
	};
	
	
	
	
	

}
