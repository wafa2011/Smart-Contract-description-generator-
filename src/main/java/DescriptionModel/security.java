package DescriptionModel;

public class security {

    private String signed;

    private String tested;
    private String link;

    public security(String signed, String tested) {
        this.signed = signed;
        this.tested = tested;
        this.link = link;
    }

    public security() {
    }

    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed;
    }

    public String getTested() {
        return tested;
    }

    public void setTested(String tested) {
        this.tested = tested;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    
}
