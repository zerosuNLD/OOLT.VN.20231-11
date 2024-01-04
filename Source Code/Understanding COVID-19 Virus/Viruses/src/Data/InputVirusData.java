package Data;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Virus.Virus;
import Virus.VirusWithLipid;
import Virus.VirusWithoutLipid;

public class InputVirusData {

	static VirusWithLipid covid = new VirusWithLipid(001, "COVID-19", "Nucleic Acid + Capsid", "Virus With Lipit",
			"introduction", "individual", "/Screen/XML/Image/covid.jpg", "/Screen/XML/Image/conDuongLayNhiemHiv.jpg","Viruses/src/DataBase/Video/1.mp4");

	static VirusWithLipid rotavirus = new VirusWithLipid(002, "Rotaviruses", "Nucleic Acid + Capsid", "Virus With Lipit",
			"introduction", "individual", "/Screen/XML/Image/rotaviruses.jpg", "/Screen/XML/Image/conDuongLayNhiemHiv.jpg","Viruses/src/DataBase/Video/1.mp4");

	static VirusWithoutLipid hiv = new VirusWithoutLipid(001, "HIV", "Nucleic Acid + Capsid", "Virus Without Lipit",
			"Intro", "Infection", "/Screen/XML/Image/HIV.jpg", "/Screen/XML/Image/conDuongLayNhiemHiv.jpg", "Viruses/src/Data/Video/1.mp4");
	
	
	public static void main(String[] args) {
	

		// Them vao JSONObject

		// Them vao JSONArray
		JSONArray virusWithLipitJsonArray = new JSONArray();
		virusWithLipitJsonArray = addVirusToJsonArray(virusWithLipitJsonArray, covid, rotavirus);

		JSONArray virusWithoutLipitJsonArray = new JSONArray();
		virusWithoutLipitJsonArray = addVirusToJsonArray(virusWithoutLipitJsonArray, hiv);

		//Truyen virusWithLipit vao file virusWithLipitStore.json
		try (FileWriter file = new FileWriter("Viruses/src/Data/VirusWithLipitStore.json")) {

			System.out.println("OK");
			file.write(virusWithLipitJsonArray.toJSONString());
			file.flush();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
		//Truyen virusWithoutLipit vao file virusWithoutLipitStore.json
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
	private static JSONArray addVirusToJsonArray(JSONArray lJsonArray, Virus... viruslist) {
		for (Virus virus : viruslist) {
			JSONObject virusDetailObject = new JSONObject();
			virusDetailObject.put("Id", virus.getID());
			virusDetailObject.put("Name", virus.getName());
			virusDetailObject.put("Structure", virus.getStructure());
			virusDetailObject.put("Type", virus.getType());
			virusDetailObject.put("Introduction", virus.getIntroduction());
			virusDetailObject.put("Individual", virus.getIndividual());
			virusDetailObject.put("LinkImage", virus.getImageLink());
			virusDetailObject.put("LinkImage2", virus.getImage2Link());
			virusDetailObject.put("LinkVideo", virus.getLinkVideoString());
			
			lJsonArray.add(virusDetailObject);

		}
		return lJsonArray;
	}
}
