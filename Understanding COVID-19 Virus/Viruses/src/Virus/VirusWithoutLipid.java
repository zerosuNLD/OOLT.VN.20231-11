package Virus;

import java.util.Scanner;

public class VirusWithoutLipid extends Virus implements Infection {
    private int id;
    private String introduction;
    private String individual;

    private static int nbId = 0;

    // Constructors
    public VirusWithoutLipid(String name, String structure) {
        super(name, structure);
        this.id = nbId++;
    }

    // Getter and setter
    public int getId() {
        return id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
    }

    // Method

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

    //To String

    @Override
    public String toString() {
        return "VirusWithoutLipid [id=" + id + ", name=" + name + ", structure=" + structure + "]";
    }

}
