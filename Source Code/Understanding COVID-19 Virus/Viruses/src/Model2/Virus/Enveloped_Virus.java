package Model2.Virus;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model2.Biological_Element;

public abstract class Enveloped_Virus  extends Virus implements In_out_Element {
	
	protected Viral_Envelope envelope;

	public Enveloped_Virus(Acid_Nucleic ac, Capsid capsid) {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	
	
	public ArrayList<Biological_Element> entry_signal() {
		ArrayList<Biological_Element> list = new ArrayList<>();
		Viral_Envelope e = envelope;		
		list.add(this); list.add(e); //envelope =null;
		
		return list;
	};
	

	
//	public void coated(Viral_Envelope env) {
//		this.envelope = envelope;
//	}
	
	
	public void require_signal() {};
	
	
				
	public Viral_Envelope getEnvelope() {
		return envelope;
	}
//
//
//
//
	public void setEnvelope(Viral_Envelope envelope) {
		this.envelope = envelope;
	}




	public void exit_signal() {};
	
	

	
	
	

}
