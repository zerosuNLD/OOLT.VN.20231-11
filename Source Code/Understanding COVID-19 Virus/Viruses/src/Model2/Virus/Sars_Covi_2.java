package Model2.Virus;

import java.util.ArrayList;

import Model2.Biological_Element;
import Model2.Cell.Cell;

public class Sars_Covi_2 extends Enveloped_Virus {
	
	public Sars_Covi_2(Acid_Nucleic ac, Capsid capsid) {
		// TODO Auto-generated constructor stub
		super(ac, capsid);
		this.ac=ac; this.capsid=capsid;
		this.des_cell="ECs";
	}
	
//	public Sars_Covi_2() {
//		
//		ArrayList<String> capsid_list = new ArrayList<>();
//		capsid_list.add("N protein");
//		
//	
//		ArrayList<String> envelope_list = new ArrayList<>();
//		envelope_list.add("E protein"); envelope_list.add("S protein"); envelope_list.add("M protein"); 
//		//this.setAcid_Nucleic(new Acid_Nucleic(this.getClass().toString(),list)); 
//		
//	}
	
 
	public void coated(Viral_Envelope env) {
		
	};
	
	
	
	
	
	
	
	public void require_signal() {};
	
//	public void transport_signal() {};
				
	public void exit_signal() {};
	
	
	
	public String putString() {return "Sars-covi2";}

}
