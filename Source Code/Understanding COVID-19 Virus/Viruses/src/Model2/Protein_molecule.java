package Model2;

import java.util.ArrayList;

public abstract class Protein_molecule implements Biological_Element {

	protected  String gene;
	protected  String structure;
	
//
	public Protein_molecule(String gene, String structure) {
		// TODO Auto-generated constructor stub
		this.gene=gene; this.structure=structure;
	}
	

	
	public String getStructure() {
		return structure;
	}



	public String putString() {
//		StringBuffer sb = new StringBuffer();
//		for(String s: structure) {
//			sb.append(s+",");
//		}
//		return sb.toString();
		
		return structure;
		}

//	@Override
//	public void require_signal() {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public String getGene() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}