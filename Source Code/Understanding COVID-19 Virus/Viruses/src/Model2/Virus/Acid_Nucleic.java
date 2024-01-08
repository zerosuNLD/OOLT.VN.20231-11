package Model2.Virus;

import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

import Model2.Biological_Element;

import Virus.GUI_Virus;

public class Acid_Nucleic implements Biological_Element {
	private String Identity;
	private  ArrayList<ArrayList<String>> gene_expression;
	
    
	

	public Acid_Nucleic(String identity,ArrayList<ArrayList<String>> gene_expression) {
		super();
		Identity = identity;
		this.gene_expression = gene_expression;
	}

	public Acid_Nucleic() {
		// TODO Auto-generated constructor stub
		
		
	}
	
    public void require_signal() {};
	
	public void transport_signal() {};
	
	
	
	
	public String putString() {return null;}
	
	public String getIdentity() {
		return Identity;
	}



	public ArrayList<ArrayList<String>>getGene_expression() {
		return gene_expression;
	}

	

}
