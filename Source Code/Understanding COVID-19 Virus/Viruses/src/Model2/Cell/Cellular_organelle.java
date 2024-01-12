package Model2.Cell;

import java.util.ArrayList;

import Model2.Biological_Element;

public abstract class Cellular_organelle {
	protected ArrayList<Biological_Element> elements;
	protected Cell owner;
	
	public void provide_Lipid(Biological_Element element) {}
	
	public void transport(Biological_Element element)  {}
	
	public void release(Biological_Element element) {}
	
	
	

}
