package Virus;

import Model2.Model_MainGUI;

public class GUI_Non_Enveloped_Virus extends GUI_Virus implements Infection {

	public GUI_Non_Enveloped_Virus(Integer id, String name, String structure, String type, String introduction,
			String infectionString, String individual, String link, String link2, String linkVideo) {
		super(id, name, structure, type, introduction, infectionString, individual, link, link2, linkVideo);
	}

	// Da hinh
	@Override
	public String toString() {
		return String.format("GUI_Non_Enveloped_Virus [id=%d, name=%s, structure=%s]", getId(), getName(),
				getStructure());
	}

	// Interface
	@Override
	public void infection() {
		System.out.println("VirusWithoutLipid đang nhiễm...");
		new Model_MainGUI().setVisible(true);;
	}
}