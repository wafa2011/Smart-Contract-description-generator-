package DescriptionModel;

public class input {

    private String name;

    private String Type;

    public input(String name, String Type) {
        this.name = name;
        this.Type = Type;
    }

    public input() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    

}
