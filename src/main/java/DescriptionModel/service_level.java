package DescriptionModel;

public class service_level {

    private String letency;

    private String gazConsomation;

    private String ContractGazPrice;

    public service_level(String letency, String gazConsomation, String ContractGazPrice) {
        this.letency = letency;
        this.gazConsomation = gazConsomation;
        this.ContractGazPrice = ContractGazPrice;
    }

    public service_level() {
    }

    public String getLetency() {
        return letency;
    }

    public void setLetency(String letency) {
        this.letency = letency;
    }

    public String getGazConsomation() {
        return gazConsomation;
    }

    public void setGazConsomation(String gazConsomation) {
        this.gazConsomation = gazConsomation;
    }

    public String getContractGazPrice() {
        return ContractGazPrice;
    }

    public void setContractGazPrice(String ContractGazPrice) {
        this.ContractGazPrice = ContractGazPrice;
    }

   
}
