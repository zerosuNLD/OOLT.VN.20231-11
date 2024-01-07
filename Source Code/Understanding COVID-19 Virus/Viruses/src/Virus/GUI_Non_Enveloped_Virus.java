package Virus;

import java.util.Scanner;

public class GUI_Non_Enveloped_Virus extends GUI_Virus implements Infection {
    private int id;
    private String type;
    private String introduction;
    private String infectionString;
    private String individual;
    private String imageLink;
    private String image2Link;
    private String linkVideoString;
    
//    private static int nbId = 0;

    // Constructors
    public GUI_Non_Enveloped_Virus(int id,String name, String structure) {
        super(name, structure);
//        this.id = nbId++;
        this.id = id;
    }


    public GUI_Non_Enveloped_Virus(Integer id, String name, String structure, String type) {
		super(name, structure);
		this.type = type;
//        this.id = nbId++;
		this.id = id;
	}


	public GUI_Non_Enveloped_Virus(Integer id, String name, String structure, String type, String introduction, String infectionString,String individual,
			String link, String link2, String linkVideo) {
		super(name, structure);
		this.id = id;
		this.type = type;
		this.introduction = introduction;
		this.setInfectionString(infectionString);
		this.individual = individual;
		this.imageLink = link;
		this.image2Link = link2;
		this.linkVideoString = linkVideo;
	}

	// Getter and setter
    public int getID() {
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


	public String getLinkVideoString() {
		return linkVideoString;
	}


	public void setLinkVideoString(String linkVideoString) {
		this.linkVideoString = linkVideoString;
	}


	public String getImageLink() {
		return imageLink;
	}


	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}


	public String getImage2Link() {
		return image2Link;
	}


	public void setImage2Link(String image2Link) {
		this.image2Link = image2Link;
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


	public String getInfectionString() {
		return infectionString;
	}


	public void setInfectionString(String infectionString) {
		this.infectionString = infectionString;
	}

}
