package Model2.Virus;

public abstract class Enveloped_Virus  extends Virus implements In_out_Element {
	
	private Viral_envelope envelope;

	public Enveloped_Virus(Acid_Nucleic ac, Capsid capsid) {
		// TODO Auto-generated constructor stub
		super(ac, capsid);
	}
	
	public void uncoat() {};
	
	public void coated(Viral_envelope env) {};
	
	
	public void entry_signal() {};
	
	public void require_signal() {};
	
	public void transport_signal() {};
				
	public void exit_signal() {};
	
	
	
	public String putString() {return null;}

}
