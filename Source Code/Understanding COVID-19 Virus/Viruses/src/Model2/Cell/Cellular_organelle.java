package Model2.Cell;

import java.awt.dnd.DropTargetListener;
import java.util.ArrayList;

import Model2.Biological_Element;

public abstract class Cellular_organelle {
	public final String identity;
	protected ArrayList<Biological_Element> elements;
	protected Cell3 owner;
		
	public Cellular_organelle() {identity="";}
	
	public void response(Biological_Element element) {}   // Phương thức public nhưng cell sở hữu organelle của riêng nó, và cell đặt organelle của nó là private
	
	public void transport(Biological_Element element)  {}
		
	public void release(Biological_Element element) {}   
	
	
	
	
	public void addE(Biological_Element e) {
		if(!elements.contains(e)) return;  // không phải phần tử được chứa bên trong thì không dùng được
		
	}
	
	public ArrayList<Biological_Element> getList(){
		return elements;
	}
	
	
	public String putString() {		
		StringBuffer sb = new StringBuffer();
		for(Biological_Element s: elements) {
			sb.append(s.putString()+",");
		}
		return sb.toString();
	}
	

}
