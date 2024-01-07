package Repository;

import Virus.GUI_Virus;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Repository {
	private ObservableList<GUI_Virus> listVirus = FXCollections.observableArrayList();

	// Method
	public void showListVirus() {
		for (GUI_Virus gUI_Virus : listVirus) {
			System.out.println(gUI_Virus.toString());
		}
	}

	public void addVirusToRepo(GUI_Virus newVirus) {

		if (!listVirus.contains(newVirus)) {
			listVirus.add(newVirus);
//			System.out.println("Virus added successfully!");
		} else {
			System.out.println("Virus already exists in the repository. Duplicate entries are not allowed.");
		}
	}

	public void addVirusToRepo(GUI_Virus... newVirus) {
		for (GUI_Virus gUI_Virus : newVirus) {
			addVirusToRepo(gUI_Virus);
		}
	}

	public void removeVirusFromRepo(GUI_Virus virusToRemove) {
		if (listVirus.contains(virusToRemove)) {
			listVirus.remove(virusToRemove);
			System.out.println("Virus removed successfully!");
		} else {
			System.out.println("Virus not found in the repository. Unable to remove.");
		}
	}

	public void removeVirusFromRepo(GUI_Virus... virusToRemove) {
		for (GUI_Virus gUI_Virus : virusToRemove) {
			removeVirusFromRepo(gUI_Virus);
		}
	}

	public ObservableList<GUI_Virus> getListVirus() {
		return listVirus;
	}
	
    public void addRepository(Repository otherRepository) {
        if (otherRepository != null) {
            listVirus.addAll(otherRepository.getListVirus());
        }
    }	
	
}
