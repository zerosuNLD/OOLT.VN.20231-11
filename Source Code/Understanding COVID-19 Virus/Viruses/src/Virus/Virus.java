package Virus;

public abstract class Virus implements Infection {
    protected String name;
    protected String structure;

    public Virus(String name, String structure) {
        this.name = name;
        this.structure = structure;
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

    public abstract int getID();

    public abstract String getType();

    public abstract String getIntroduction();

    public abstract String getIndividual();

    public abstract String getImageLink();

    public abstract String getImage2Link();
    
    public abstract String getLinkVideoString();

	public abstract void setLinkVideoString(String linkVideoString);


    @Override
    public void infection() {
        // TODO Phương thức này có thể được triển khai trong các lớp con cụ thể.
    }
}
