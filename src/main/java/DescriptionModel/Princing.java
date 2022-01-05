package DescriptionModel;

public class Princing {

    private String gazLimit;

    private String TokenPrice;

    public Princing(String gazLimit, String TokenPrice) {
        this.gazLimit = gazLimit;
        this.TokenPrice = TokenPrice;
    }

    public Princing() {
    }

    public String getGazLimit() {
        return gazLimit;
    }

    public void setGazLimit(String gazLimit) {
        this.gazLimit = gazLimit;
    }

    public String getTokenPrice() {
        return TokenPrice;
    }

    public void setTokenPrice(String TokenPrice) {
        this.TokenPrice = TokenPrice;
    }
    
}
