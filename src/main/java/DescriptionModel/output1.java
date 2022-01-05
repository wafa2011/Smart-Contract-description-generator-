package DescriptionModel;

public class output1 {

    private String name;

    private String type;

    private String is_indexed;

    public output1(String name, String type, String is_indexed) {
        this.name = name;
        this.type = type;
        this.is_indexed = is_indexed;
    }

    public output1() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIs_indexed() {
        return is_indexed;
    }

    public void setIs_indexed(String is_indexed) {
        this.is_indexed = is_indexed;
    }
    
}
