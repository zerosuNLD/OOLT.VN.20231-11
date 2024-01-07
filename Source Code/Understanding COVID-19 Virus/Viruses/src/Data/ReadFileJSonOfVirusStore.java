package Data;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import Repository.Repository;
import Virus.GUI_Enveloped_Virus;
import Virus.GUI_Non_Enveloped_Virus;

public class ReadFileJSonOfVirusStore {
	private Repository repository;

	public Repository getRepository() {
		return repository;
	}

	@SuppressWarnings("unchecked")
	public void read(String linkString) {
		repository = new Repository();

		JSONParser jsonParser = new JSONParser();

		try (FileReader reader = new FileReader(linkString)) {
			// Đọc tệp JSON
			Object object = jsonParser.parse(reader);

			JSONArray virusList = (JSONArray) object;

			// Duyệt từng phần tử của virusList
			virusList.forEach(virus -> {
				JSONObject viJsonObject = (JSONObject) virus;

				Long idLong = (Long) viJsonObject.get("Id");
				int id = idLong.intValue();

				String name = (String) viJsonObject.get("Name");
				String structure = (String) viJsonObject.get("Structure");
				String type = (String) viJsonObject.get("Type");
				String introduction = (String) viJsonObject.get("Introduction");
				String infectionString = (String) viJsonObject.get("Infection");
				String individual = (String) viJsonObject.get("Individual");
				String linkImage = (String) viJsonObject.get("LinkImage");
				String linkImage2 = (String) viJsonObject.get("LinkImage2");
				String linkVideoString = (String) viJsonObject.get("LinkVideo");

				if (linkString == "Viruses/src/Data/VirusWithLipitStore.json") {
					GUI_Enveloped_Virus vsLipid = new GUI_Enveloped_Virus(id, name, structure, type, introduction,
							infectionString, individual, linkImage, linkImage2, linkVideoString);

					repository.addVirusToRepo(vsLipid);
				} else if (linkString == "Viruses/src/Data/VirusWithoutLipitStore.json") {
					GUI_Non_Enveloped_Virus vsWithoutLipid = new GUI_Non_Enveloped_Virus(id, name, structure, type, introduction,
							infectionString, individual, linkImage, linkImage2, linkVideoString);
					repository.addVirusToRepo(vsWithoutLipid);
				} else {
					System.err.println("ERROR: LINK SAi");
				}

			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
