package DescriptionModel;

public class smartContractcaracter {
    common commonCarac; 
    Documentation documentation;

    public smartContractcaracter(common commonCarac, Documentation documentation) {
        this.commonCarac = commonCarac;
        this.documentation = documentation;
    }

    public smartContractcaracter() {
    }

    public common getCommonCarac() {
        return commonCarac;
    }

    public void setCommonCarac(common commonCarac) {
        this.commonCarac = commonCarac;
    }

    public Documentation getDocumentation() {
        return documentation;
    }

    public void setDocumentation(Documentation documentation) {
        this.documentation = documentation;
    }
    
}
