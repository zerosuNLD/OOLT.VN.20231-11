package Model2.Virus;

import java.util.ArrayList;

import Model2.Biological_Element;
import Model2.Cell.Cell;

public abstract class Non_Enveloped_Virus extends Virus implements In_out_Element {
	

		public  Non_Enveloped_Virus(Acid_Nucleic ac, Capsid capsid) {
			// TODO Auto-generated constructor stub
			super();
		}
        
		public ArrayList<Biological_Element> entry_signal() {
			ArrayList<Biological_Element> list = new ArrayList<>();		
			list.add(this);
			return list;
		};
		
							
		public void exit_signal() {};
		
						
	
}
