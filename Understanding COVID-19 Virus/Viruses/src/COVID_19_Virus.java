import Repository.Repository;
import Virus.VirusWithLipid;
import Virus.VirusWithoutLipid;


public class COVID_19_Virus {
    public static void main(String[] args) {
        
        VirusWithoutLipid hiv = new VirusWithoutLipid("HIV", "Nucleic Acid + Capsid");
        VirusWithLipid covid = new VirusWithLipid("COVID-19", "Nucleic Acid + Capsid");
        VirusWithLipid rotavirus = new VirusWithLipid("Rotaviruses", "Nucleic Acid + Capsid");

        Repository repo  = new Repository();
        repo.addVirusToRepo(hiv,covid,rotavirus);
        repo.showListVirus();
        repo.removeVirusFromRepo(hiv);
        repo.showListVirus();
        System.exit(0);
    }
}