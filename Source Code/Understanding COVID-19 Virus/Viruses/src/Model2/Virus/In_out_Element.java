package Model2.Virus;

import java.util.ArrayList;

import Model2.Biological_Element;
import Model2.Cell.Cell;

public interface In_out_Element extends Biological_Element {
	
    public ArrayList<Biological_Element> entry_signal();
	
	public void exit_signal ();
	
	

}
