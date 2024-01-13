package Model2.Virus;


import java.util.HashMap;

import Model2.Biological_Element;
import Model2.Cell.Cell;
import Model2.Cell.Cell3;

public abstract class Virus implements In_out_Element {
	
	protected String gene;
	protected Acid_Nucleic ac;
	protected Capsid capsid;
	protected String des_cell;
	
	

	public Virus() {
		// TODO Auto-generated constructor stub
		
	}
	
	public boolean reach(Cell c) {
		if(c.getName().compareTo(des_cell)==0) return true;
		
		return false;
	}
	
	
	public Capsid uncoat() {
		Capsid n = this.capsid;
		this.capsid=null;
		return n;
	}
	
	
	public String putString() {
		return this.getClass().toString();
	}
    
	
	@Override
	public String getGene() {
		// TODO Auto-generated method stub
		return this.getClass().toString();
	}
	

}
