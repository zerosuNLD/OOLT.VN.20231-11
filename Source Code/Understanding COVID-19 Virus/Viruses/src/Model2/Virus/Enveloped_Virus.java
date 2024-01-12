package Model2.Virus;

public abstract class Enveloped_Virus  extends Virus implements In_out_Element {
	
	protected Viral_Envelope envelope;

	public Enveloped_Virus(Acid_Nucleic ac, Capsid capsid, Viral_Envelope env) {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Enveloped_Virus() {}
	
	
	
	
	public void uncoat() {};
	
	public void coated(Viral_Envelope env) {};
	
	
	public void entry_signal() {};
	
	public void require_signal() {};
	
	public void transport_signal() {};
				
	public void exit_signal() {};
	
	
	
	public String putString() {return null;}
	
	
	

}
