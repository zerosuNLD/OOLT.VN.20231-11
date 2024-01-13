package Virus;

import Model2.Infection_Main;
import Model2.Cell.Cell;
import Model2.Virus.Acid_Nucleic;
import Model2.Virus.Capsid;
import Model2.Virus.Sars_Covi_2;
import Model2.Virus.Viral_Envelope;

public class GUI_Enveloped_Virus extends GUI_Virus implements Infection {

	public GUI_Enveloped_Virus(Integer id, String name, String structure, String type, String introduction,
			String infectionString, String individual, String link, String link2, String linkVideo) {
		super(id, name, structure, type, introduction, infectionString, individual, link, link2, linkVideo);
	}

	// Da hinh
	@Override
	public String toString() {
		return String.format("GUI_Enveloped_Virus [id=%d, name=%s, structure=%s]", getId(), getName(), getStructure());
	}

	// Interface
	@Override
	public void infection() {
		System.out.println("VirusWithLipid đang nhiễm...");
		Acid_Nucleic ac = new Acid_Nucleic("Model2.Virus.Sars_Covi_2");
		Capsid csCapsid = new Capsid("Model2.Virus.Sars_Covi_2", "[abc Protein]");
		Viral_Envelope envelope = new Viral_Envelope("Model2.Virus.Sars_Covi_2", "[N,S,M,E Protein]");

		Sars_Covi_2 cv = new Sars_Covi_2(ac, csCapsid);
		// cv.coated(envelope);
		cv.setEnvelope(envelope);
		Cell cell = new Cell("ECs");

		Thread infectionThread = new Thread(() -> {
			new Infection_Main(cv, cell);
		});

		// Khởi động luồng
		infectionThread.start();
	}
}