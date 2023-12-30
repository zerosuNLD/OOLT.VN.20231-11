package Virus;

import java.util.Scanner;

public class VirusWithLipid extends Virus implements Infection {
    private int id;
    private String type;
    private String introduction;
    private String individual;

//    private static int nbId = 0;

    // Constructors
    public VirusWithLipid(Integer id, String name, String structure) {
        super(name, structure);
//        id = nbId++;
        this.id = id;
    }
    
    

    public VirusWithLipid(Integer id, String name, String structure, String type) {
		super(name, structure);
		this.type = type;
//        id = nbId++;
		this.id = id;
	}



	// Getter and setter
    public int getId() {
        return id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    public String getIndividual() {
        return individual;
    }

    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	// Nhap gioi thieu ve Virus
    void setIntroduction() {
        String intro = "";

        System.out.println("Enter the Virus " + name + "introduction");

        try (Scanner scanner = new Scanner(System.in)) {
            intro = scanner.nextLine();
        }

        introduction = intro;
    }

    // Interface
    @Override
    public void infection() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'infection'");
    }

    // To String
    @Override
    public String toString() {
        return "VirusWithLipid [id=" + id + ", name=" + name + ", structure=" + structure + "]";
    }

}