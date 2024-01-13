package Model2.Virus;

import java.util.ArrayList;
import java.util.HashMap;

import Model2.Biological_Element;
import Model2.Protein_molecule;


public class Viral_Envelope extends Protein_molecule {
	
	

	public Viral_Envelope(String gene, String structure) {
		// TODO Auto-generated constructor stub
		super(gene,structure);
		this.structure=structure;
		this.gene=gene;
	}
	
	
    
	
	
    public void require_signal() {};
	
	public void transport_signal() {}





	@Override
	public String getGene() {
		// TODO Auto-generated method stub
		return this.gene;
	};
	
	
	
	
	public String putString() {return structure;}
	

}
