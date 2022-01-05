package DescriptionModel;

public class Events {

    private String name;

    private String description;

    private String type;
    output1[] outs;

    public Events(String name, String description, String type, output1[] outs) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.outs = outs;
    }

    public Events(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public Events() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public output1[] getOuts() {
        return outs;
    }

    public void setOuts(output1[] outs) {
        this.outs = outs;
    }
    
}
