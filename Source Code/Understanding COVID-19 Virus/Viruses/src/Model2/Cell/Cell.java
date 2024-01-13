package Model2.Cell;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import javax.sound.midi.Synthesizer;
import javax.swing.JOptionPane;

import Model2.Biological_Element;
import Model2.Infection_Main;
import Model2.Model_MainGUI;
import Model2.Protein_molecule;
import Model2.Virus.Acid_Nucleic;
import Model2.Virus.Capsid;
import Model2.Virus.In_out_Element;
import Model2.Virus.Sars_Covi_2;
import Model2.Virus.Viral_Envelope;
import Model2.Virus.Virus;


public class Cell {
	private String name;
    private ArrayList<Biological_Element> elements = new  ArrayList<>();

	public Cell(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	
	public String getName() {
		return name;
	}
	

	
	
	
	public Protein_molecule  synthesize_Protein(Protein_molecule pr) {
		Object ob = null; 
											 
						Class classDefinition;
									
							try {
								Class[] t = {String.class, String.class};								
								
								//String string = ac.getClass().toString().split(" ").
								
								
								String string = pr.getClass().toString().split(" ")[1];
								Class classDef = Class.forName(string);   
								Constructor cons = classDef.getConstructor(t);
								ob = cons.newInstance(pr.getGene(),pr.getStructure());
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
							return (Protein_molecule) ob;
			}
	
		
	public Acid_Nucleic synthesize_Acid_Nucleic(Acid_Nucleic ac) {
		Object ob = null; 
											 
						Class classDefinition;
									
							try {
								Class[] t = {String.class};								
								
								//String string = ac.getClass().toString().split(" ").
								
								
								String string = ac.getClass().toString().split(" ")[1];
								Class classDef = Class.forName(string);   
								Constructor cons = classDef.getConstructor(t);
								ob = cons.newInstance(ac.getGene());
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
							return (Acid_Nucleic) ob;
			}
		
	public void adde(ArrayList<Biological_Element> list) {
		elements.addAll(list);
	}
	
    
    public ArrayList<Biological_Element> getElements() {
		return elements;
	}


	public String putString() {
    	StringBuilder sb = new StringBuilder();
		sb.append("[Cell :"+ name + "]" +"\n" + "\n" + "\n");
		for(Biological_Element be: elements) {
			sb.append(be.putString()+"\n");
		}
		return sb.toString();
    }

}
