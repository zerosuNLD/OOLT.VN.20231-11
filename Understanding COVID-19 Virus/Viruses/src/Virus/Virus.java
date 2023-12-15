package Virus;

public class Virus implements Infection{
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

    @Override
    public void infection() {
        // TODO Auto-generated method stub
        
    }



}