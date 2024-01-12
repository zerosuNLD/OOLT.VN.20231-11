package Virus;

public abstract class GUI_Virus {
    private int id;
    private String name;
    private String structure;
    private String type;
    private String introduction;
    private String structure2String;
    private String individual;
    private String imageLink;
    private String image2Link;
    private String linkVideoString;
    
    public GUI_Virus(Integer id, String name, String structure, String type, String introduction,
                     String structure2String, String individual, String link, String link2, String linkVideo) {
        this.id = id;
        this.name = name;
        this.structure = structure;
        this.type = type;
        this.introduction = introduction;
        this.structure2String = structure2String;
        this.individual = individual;
        this.imageLink = link;
        this.image2Link = link2;
        this.linkVideoString = linkVideo;
    }

    /* Getter and setter */
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getStructure2String() {
		return structure2String;
	}
    
    public void setStructure2String(String structure2String) {
		this.structure2String = structure2String;
	}

    public String getIndividual() {
        return individual;
    }

    public void setIndividual(String individual) {
        this.individual = individual;
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

    public String getLinkVideoString() {
        return linkVideoString;
    }

    public void setLinkVideoString(String linkVideoString) {
        this.linkVideoString = linkVideoString;
    }
    
    /* Method */
    
    //Da hinh
    @Override
    public String toString() {
        return String.format("GUI_Virus [id=%d, name=%s, structure=%s]", id, name, structure);
    }
    
    public abstract void infection();
}