package Repository;

import java.util.ArrayList;
import java.util.List;

import Virus.Virus;

public class Repository {
    List<Virus> listVirus = new ArrayList<>();

    // Method
    public void showListVirus() {
        for (Virus virus : listVirus) {
            System.out.println(virus.toString());
        }
    }

    public void addVirusToRepo(Virus newVirus) {
        // Kiểm tra xem virus đã tồn tại trong danh sách hay chưa
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
        // Kiểm tra xem virus tồn tại trong danh sách hay không
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

}
