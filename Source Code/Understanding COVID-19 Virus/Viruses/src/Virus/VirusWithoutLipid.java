package Virus;

import java.util.Scanner;

import javafx.scene.image.Image;

public class VirusWithoutLipid extends Virus implements Infection {
    private int id;
    private String type;
    private String introduction;
    private String individual;
    private Image image;
    private Image image2;
    
//    private static int nbId = 0;

    // Constructors
    public VirusWithoutLipid(int id,String name, String structure) {
        super(name, structure);
//        this.id = nbId++;
        this.id = id;
    }


    public VirusWithoutLipid(Integer id, String name, String structure, String type) {
		super(name, structure);
		this.type = type;
//        this.id = nbId++;
		this.id = id;
	}


	public VirusWithoutLipid(Integer id, String name, String structure, String type, String introduction, String individual,
			String link, String link2) {
		super(name, structure);
		this.id = id;
		this.type = type;
		this.introduction = introduction;
		this.individual = individual;
		this.image = setImage(link);
		this.image2 = setImage(link2);
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
    

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Image setImage(String string) {
		return new Image(getClass().getResourceAsStream(string));
		
	}

	public Image getImage() {
		return image;
	}
	
	public Image getImage2() {
		return image2;
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
        System.out.println("VirusWithoutLipid đang nhiễm...");
    }

    //To String

    @Override
    public String toString() {
        return "VirusWithoutLipid [id=" + id + ", name=" + name + ", structure=" + structure + "]";
    }

}
