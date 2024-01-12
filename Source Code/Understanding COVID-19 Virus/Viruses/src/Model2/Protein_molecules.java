package Model2;

import java.util.ArrayList;

public abstract class Protein_molecules implements Biological_Element {

	protected String identity;
	protected ArrayList<String> structure;
	
//
	public Protein_molecules(ArrayList<String> structure) {
		// TODO Auto-generated constructor stub
	}
	
	public String putString() {
		StringBuffer sb = new StringBuffer();
		for(String s: structure) {
			sb.append(s+",");
		}
		return sb.toString();
		}
	
	

}