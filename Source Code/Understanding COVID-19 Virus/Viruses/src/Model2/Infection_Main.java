package Model2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model2.Cell.Cell;
import Model2.Virus.Acid_Nucleic;
import Model2.Virus.Virus;

public class Infection_Main {
	private Cell cell;
	private Virus virus;
	
	
	public Infection_Main(Virus v, Cell c) {
		
		
		this.virus = v;
		
		this.cell= c;
		
		infection();
		
	}
	
	void infection() {
		
		
         if(!virus.reach(cell)) { JOptionPane.showMessageDialog(null, "Tế bào không phù hợp"); return;}
         show();
         
 // ENTRY:        
		cell.adde(virus.entry_signal());
		 show();
		 
// UNCOAT
		virus.uncoat(); 
		show();

		
		ArrayList<Biological_Element > tmp = new ArrayList<>();
		
		for(Biological_Element be: cell.getElements()) {
			
			if(be instanceof Acid_Nucleic) {
				for(int i =0;i<2;i++) {
			   tmp.add(cell.synthesize_Acid_Nucleic((Acid_Nucleic)be));
			   
				}
			}
			else if(be instanceof Protein_molecule) {
				//JOptionPane.showMessageDialog(null, be.putString());
				for(int i =0;i<2;i++) {
					   tmp.add(cell. synthesize_Protein((Protein_molecule)be));
						}
				
					}
		}
		
		
		cell.adde(tmp);
		
		
		 show();
		//for(Biological_Element be: cell.getElements()) {JOptionPane.showMessageDialog(null, be.putString());}
		//updateView();
	}
	
	void show() {
		JOptionPane.showMessageDialog(null, cell.putString(), "Bước tiếp theo trong quá trình lây nhiêm", 1);
	}
	
//	
//	public static void main(String args[]) {
//		Acid_Nucleic ac = new  Acid_Nucleic("Model2.Virus.Sars_Covi_2");
//		Capsid csCapsid = new Capsid("Model2.Virus.Sars_Covi_2", "[abc Protein]");
//		Viral_Envelope envelope = new Viral_Envelope("Model2.Virus.Sars_Covi_2", "[N,S,M,E Protein]");
//		
//		Sars_Covi_2 cv = new Sars_Covi_2(ac, csCapsid);
//		//cv.coated(envelope);
//		cv.setEnvelope(envelope);
//		Cell cell = new Cell("ECs");
//		
//		Infection_Main bn = new Infection_Main(cv, cell);	
//	}
//	
//	
	
}
