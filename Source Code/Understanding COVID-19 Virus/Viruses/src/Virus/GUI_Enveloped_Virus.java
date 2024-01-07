package Virus;

import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI_Enveloped_Virus extends GUI_Virus implements Infection {
	
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
    public GUI_Enveloped_Virus(Integer id, String name, String structure) {
        super(name, structure);
//        id = nbId++;
        this.id = id;
    }
    

    public GUI_Enveloped_Virus(Integer id, String name, String structure, String type) {
		super(name, structure);
		this.type = type;
//        id = nbId++;
		this.id = id;
	}

    
	public GUI_Enveloped_Virus(Integer id, String name, String structure, String type, String introduction,String infection ,String individual, 
			String link, String link2,String linkVideo) {
		super(name, structure);
		this.id = id;
		this.type = type;
		this.introduction = introduction;
		this.infectionString = infection;
		this.individual = individual;
		this.imageLink = link;
		this.image2Link = link2;
		this.linkVideoString = linkVideo;
	}

	// Getter and setter
	
	public void setInfectionString(String infectionString) {
		this.infectionString = infectionString;
	}
	
	public String getInfectionString() {
		return infectionString;
	}
	
	public int getID() {
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


	public String getImageLink() {
		return imageLink;
	}

	public String getLinkVideoString() {
		return linkVideoString;
	}


	public void setLinkVideoString(String linkVideoString) {
		this.linkVideoString = linkVideoString;
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
    	JFrame frame = new JFrame();
        JDialog dialog = new JDialog(frame);

        JLabel p1 = new JLabel("");
        p1.setText("VirusWithoutLipid đang nhiễm...");

        dialog.add(p1);

        dialog.setSize(300, 100); // Đặt kích thước của cửa sổ dialog
        dialog.setLocationRelativeTo(frame); // Hiển thị dialog giữa cửa sổ chính
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // Đóng dialog khi nhấn nút đóng

        dialog.setVisible(true);
        
        System.out.println("VirusWithLipid đang nhiễm...");
    }

    // To String
    @Override
    public String toString() {
        return "VirusWithLipid [id=" + id + ", name=" + name + ", structure=" + structure + "]";
    }



}
