package Data;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Virus.GUI_Enveloped_Virus;
import Virus.GUI_Non_Enveloped_Virus;
import Virus.GUI_Virus;

public class InputVirusData {

	static GUI_Enveloped_Virus covid = new GUI_Enveloped_Virus(001, "Sars-Covi 2", "Nucleic Acid + Capsid",
			"Enveloped Virus",
			"SARS-CoV-2 is a type of single-stranded positive-sense RNA virus with an enveloped structure, exhibiting a diameter of 60–140 nm and long spikes measuring 9–12 nm (Figure 1). It belongs to the betacoronavirus genus, which includes MERS-CoV and SARS-CoV",
			"In addition to nucleic acid and capsid, SARS-CoV-2 has an envelope layer containing four types of proteins: spike protein (S), membrane protein (M), envelope protein (E), and nucleocapsid (N) protein.",
			"While the ACE2 cell surface molecule was initially identified as a prominent receptor bound by the spike protein, subsequent cell surface molecules have been proposed to act as alternative or co-receptors, including KIM1, AXL, L-SIGN, DC-SIGN, and SR-B1. For most of these molecules, it remains unclear whether they serve as true substitutes for ACE2 or if their activity is limited in facilitating viral entry.",
			"/Screen/XML/Image/Sars-covi2.jpg", "/Screen/XML/Image/Sars-covi2_LifeCycle.jpg",
			"Viruses/src/Data/Video/covid.mp4");

	static GUI_Enveloped_Virus hiv = new GUI_Enveloped_Virus(002, "HIV", "Nucleic Acid + Capsid", "Enveloped virus",
			"The virus that causes immunodeficiency in humans, known as HIV, belongs to the Lentivirus genus (a subgroup of retroviruses) that invades the human body. Over time, they induce the acquired immunodeficiency syndrome (AIDS),[1][2] a condition where the immune system progressively weakens, allowing for the development of cancers and opportunistic infections.[3] Without treatment, the estimated average survival time for individuals infected with HIV ranges from 9 to 11 years, depending on the viral subtype.",
			"The immune-suppressing virus in humans has a diameter ranging from 80 to 140 nanometers, with a cuboid shape composed of 20 faces. The outer layer of the virus is a lipid envelope derived from the host cell, incorporating both gp120 and gp41 proteins—two types of viral proteins. Among them, gp41 is a transmembrane protein, while gp120 is the outer surface protein, forming a complex with gp41 through non-covalent interactions.",
			"The HIV virion enters macrophages and CD4+ T cells by bringing the glycoproteins on its surface into contact with receptors on the target cell and subsequently fusing the viral outer envelope with the target cell membrane, releasing the capsid into the cell.",
			"/Screen/XML/Image/HIV.jpg", "/Screen/XML/Image/hiv_Lifecycle.jpg", "Viruses/src/Data/Video/hiv.mp4");

	static GUI_Non_Enveloped_Virus rhinovirus = new GUI_Non_Enveloped_Virus(001, "rhinovirus", "Nucleic Acid + Capsid",
			"Non-Enveloped virus",
			"The Rhinovirus is a single-stranded RNA virus with a positive sense, belonging to the Enterovirus genus in the Picornaviridae family. Rhinovirus is the most prevalent infectious agent in humans and is the primary cause of the common cold.",
			"The Rhinovirus has a single-stranded positive-sense RNA genome with a length ranging from 7200 to 8500 nucleotides. At the 5' end of the genome is a protein encoded by the virus and, similar to mRNA in mammals, it has a long 3' poly-A tail. The structural protein is encoded in the 5' region of the genome, and there is a non-structural region at the 3' end. This pattern is consistent across all picornaviruses. The virus particles themselves are non-enveloped and have a twelve-sided structure.",
			"Transmission through direct contact:\n"
			+ "Rhinovirus primarily spreads through direct contact with human cells, especially the mucous membrane of the respiratory tract.\n"
			+ "Structural diversity:\n"
			+ "Rhinovirus has a structure that does not include a lipid envelope but instead uses a protein coat to protect its genetic material.\n"
			+ "Cell entry mechanism:\n"
			+ "Rhinovirus utilizes proteins on its surface to interact with receptors on respiratory tract cells, initiating the infection process.\n"
			+ "Survival outside the body environment:\n"
			+ "Rhinovirus may be less stable when exposed to the external environment and typically does not survive for an extended period on non-living surfaces.\n"
			+ "Preventive measures:\n"
			+ "Preventive measures such as frequent handwashing, maintaining distance, and wearing masks remain crucial to prevent the transmission of rhinovirus.\n"
			+ "Special impact on cells:\n"
			+ "Rhinovirus can interact with the cell membrane of the respiratory tract, causing changes and alterations within cells to facilitate the infection process.", 
			"/Screen/XML/Image/rhinovirus.jpg", "/Screen/XML/Image/rhinovirus_LifeCycle.jpg",
			"Viruses/src/Data/Video/Rhinovirus.mp4");

	static GUI_Non_Enveloped_Virus norovirus = new GUI_Non_Enveloped_Virus(002, "norovirus", "Nucleic Acid + Capsid",
			"Non-Enveloped virus",
			"The Rhinovirus is a single-stranded RNA virus with a positive sense, belonging to the Enterovirus genus in the Picornaviridae family. Rhinovirus is the most prevalent infectious agent in humans and is the primary cause of the common cold.",
			"Norovirus lacks an envelope, exhibiting a characteristic 20-faced shape. The capsid diameter varies significantly, ranging from 23 to 40 nm. Norovirus contains a linear, non-segmented RNA genome of approximately 7.5 kilobases, encoding a large polyprotein that is cleaved into six smaller non-structural proteins (NS1/2 to NS7) by the virus's 3C-like protease (NS6). Additionally, it includes a major structural protein (VP1) with an approximate weight of 58-60 kDa and a small capsid protein",
			"The replication of the virus relies on cellular material. Cell entry is achieved by attaching to receptors of the host, acting as intermediaries for the entry process. Transcription of the positive-sense RNA viral chain is the method of replication. The decoding process occurs through leaky scanning and reinitiation of RNA termination.",
			"/Screen/XML/Image/Norovirus.jpg", "/Screen/XML/Image/Norovirus_LifeCycle.png",
			"Viruses/src/Data/Video/norovirus.mp4");

	public static void main(String[] args) {

		// Them vao JSONObject

		// Them vao JSONArray
		JSONArray virusWithLipitJsonArray = new JSONArray();
		virusWithLipitJsonArray = addVirusToJsonArray(virusWithLipitJsonArray, covid, hiv);

		JSONArray virusWithoutLipitJsonArray = new JSONArray();
		virusWithoutLipitJsonArray = addVirusToJsonArray(virusWithoutLipitJsonArray, rhinovirus, norovirus);

		// Truyen virusWithLipit vao file virusWithLipitStore.json
		try (FileWriter file = new FileWriter("Viruses/src/Data/VirusWithLipitStore.json")) {

			System.out.println("OK");
			file.write(virusWithLipitJsonArray.toJSONString());
			file.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// Truyen virusWithoutLipit vao file virusWithoutLipitStore.json
		try (FileWriter file = new FileWriter("Viruses/src/Data/VirusWithoutLipitStore.json")) {

			System.out.println("OK");
			file.write(virusWithoutLipitJsonArray.toJSONString());
			file.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private static JSONArray addVirusToJsonArray(JSONArray lJsonArray, GUI_Virus... viruslist) {
		for (GUI_Virus gUI_Virus : viruslist) {
			JSONObject virusDetailObject = new JSONObject();
			virusDetailObject.put("Id", gUI_Virus.getId());
			virusDetailObject.put("Name", gUI_Virus.getName());
			virusDetailObject.put("Structure", gUI_Virus.getStructure());
			virusDetailObject.put("Type", gUI_Virus.getType());
			virusDetailObject.put("Introduction", gUI_Virus.getIntroduction());
			virusDetailObject.put("Structure2", gUI_Virus.getStructure2String());
			virusDetailObject.put("Individual", gUI_Virus.getIndividual());
			virusDetailObject.put("LinkImage", gUI_Virus.getImageLink());
			virusDetailObject.put("LinkImage2", gUI_Virus.getImage2Link());
			virusDetailObject.put("LinkVideo", gUI_Virus.getLinkVideoString());

			lJsonArray.add(virusDetailObject);

		}
		return lJsonArray;
	}
}
