package DescriptionModel;

public class Functions {

    private String name;

    private String description;

    private String type;

    private String scope;
    input[] ins;
    output[] outs;

    public Functions(String name, String description, String type, String scope) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.scope = scope;
    }

    public Functions(String name, String description, String type, String scope, input[] ins, output[] outs) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.scope = scope;
        this.ins = ins;
        this.outs = outs;
    }
    

    public Functions() {
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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public input[] getIns() {
        return ins;
    }

    public void setIns(input[] ins) {
        this.ins = ins;
    }

    public output[] getOuts() {
        return outs;
    }

    public void setOuts(output[] outs) {
        this.outs = outs;
    }
    
    
}
