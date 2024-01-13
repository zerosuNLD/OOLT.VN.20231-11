package Model2.Virus;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import javax.management.loading.PrivateClassLoader;

import Model2.Biological_Element;
import Model2.Cell.Cellular_organelle;
import Virus.GUI_Virus;

public class Acid_Nucleic implements Biological_Element {
	private String gene;
	
	//private final String gene_expression;
	    	
	public Acid_Nucleic(String gene) {
		super();
		this.gene = gene;
		
	}
//	ArrayList<ArrayList<String>>
    

	
	
    public void require_signal() {};
	
	
	
	public Virus assembled(ArrayList<Biological_Element> co) {
		Object ob = null; 
		for(Biological_Element be: co) {
			if(be instanceof Capsid) {
				if(((Capsid) be).getGene().compareTo(this.gene)==0) {
					
						 
						Class classDefinition;
									
							try {
								Class[] t = {Acid_Nucleic.class,Capsid.class};
								;
								
								Class classDef = Class.forName(this.gene);   
								Constructor cons = classDef.getConstructor(t);
								ob = cons.newInstance(this,(Capsid) be);
							} catch (InstantiationException | IllegalAccessException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						 catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (NoSuchMethodException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 							
				
					
					//co.addE(new );
				}
			}
		}
		return (Virus) ob;
	}
	
	
	
	public String putString() {return "(Acid nuclecic + gene)";}
	
	public String getGene() {
		return gene;
	}



//	public ArrayList<ArrayList<String>>getGene_expression() {
//		return gene_expression;
//	}

//	public static void main(String args[]) {
//		Acid_Nucleic ac = new  Acid_Nucleic("Model2.Virus.Sars_Covi_2");
//		Capsid csCapsid = new Capsid("Model2.Virus.Sars_Covi_2", "abc");
//		
//		ArrayList<Biological_Element> list = new  ArrayList<>(); list.add(csCapsid);
//				
//		//System.out.println(ac.getGene());
//	    System.out.println(ac.assembled(list).putString())	;
		
//}

}






