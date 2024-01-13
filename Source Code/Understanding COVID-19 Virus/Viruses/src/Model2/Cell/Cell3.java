package Model2.Cell;

import Model2.Biological_Element;
import Model2.Virus.In_out_Element;

public abstract class Cell3 {
	private String name;
	private String receptor;
	private Nucleus nucleus;
	private Plasma_membrane plasma_membrane;
	private Ribosome ribosome;

	public Cell3(String name, String receptor) {
		// TODO Auto-generated constructor stub
		this.name=name;this.receptor=receptor;
	}
	
	public void Cell_exe(In_out_Element ioe) {
				
	}
	
	
	public String getReceptor() {
		return receptor;
	}

	

	public String getName() {
		return name;
	}

}
