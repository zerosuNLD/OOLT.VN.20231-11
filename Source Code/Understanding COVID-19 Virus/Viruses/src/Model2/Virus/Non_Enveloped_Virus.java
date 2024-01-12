package Model2.Virus;

public class Non_Enveloped_Virus extends Virus implements In_out_Element {
	

		public  Non_Enveloped_Virus(Acid_Nucleic ac, Capsid capsid) {
			// TODO Auto-generated constructor stub
			super();
			parts.put(ac.getClass().toString(), ac);
			parts.put(capsid.getClass().toString(), capsid);
		}
        
		public void entry_signal() {};
		
		public void require_signal() {};
		
		public void transport_signal() {};
					
		public void exit_signal() {};
		
		
		
		public String putString() {return null;}
	
}
