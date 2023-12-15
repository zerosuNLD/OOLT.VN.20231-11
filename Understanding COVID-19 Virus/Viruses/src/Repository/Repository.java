package Repository;

import Virus.Virus;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Repository {
	   private ObservableList<Virus> listVirus = FXCollections.observableArrayList();

    // Method
    public void showListVirus() {
        for (Virus virus : listVirus) {
            System.out.println(virus.toString());
        }
    }

    public void addVirusToRepo(Virus newVirus) {
    
        if (!listVirus.contains(newVirus)) {
            listVirus.add(newVirus);
            System.out.println("Virus added successfully!");
        } else {
            System.out.println("Virus already exists in the repository. Duplicate entries are not allowed.");
        }
    }

    public void addVirusToRepo(Virus... newVirus){
        for (Virus virus : newVirus) {
           addVirusToRepo(virus); 
        }
    }

    public void removeVirusFromRepo(Virus virusToRemove) {
        if (listVirus.contains(virusToRemove)) {
            listVirus.remove(virusToRemove);
            System.out.println("Virus removed successfully!");
        } else {
            System.out.println("Virus not found in the repository. Unable to remove.");
        }
    }

   public void removeVirusFromRepo(Virus... virusToRemove) {
        for (Virus virus : virusToRemove) {
           removeVirusFromRepo(virus); 
        }
   }

   public ObservableList<Virus> getListVirus() {
	return listVirus;
   }

  

   
}
