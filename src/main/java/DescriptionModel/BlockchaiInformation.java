package DescriptionModel;

public class BlockchaiInformation {

    private String name;

    private String currency;

    private String consensus;

    private String type;

    public BlockchaiInformation(String name, String currency, String consensus, String type) {
        this.name = name;
        this.currency = currency;
        this.consensus = consensus;
        this.type = type;
    }

    public BlockchaiInformation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getConsensus() {
        return consensus;
    }

    public void setConsensus(String consensus) {
        this.consensus = consensus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}
