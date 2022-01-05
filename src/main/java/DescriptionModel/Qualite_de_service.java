package DescriptionModel;

public class Qualite_de_service {
    service_level servicelevel;
    Princing pricing;
    security security;
    legal legal;

    public Qualite_de_service(service_level servicelevel, Princing pricing, security security, legal legal) {
        this.servicelevel = servicelevel;
        this.pricing = pricing;
        this.security = security;
        this.legal = legal;
    }

    public Qualite_de_service() {
    }

    public service_level getServicelevel() {
        return servicelevel;
    }

    public void setServicelevel(service_level servicelevel) {
        this.servicelevel = servicelevel;
    }

    public Princing getPricing() {
        return pricing;
    }

    public void setPricing(Princing pricing) {
        this.pricing = pricing;
    }

    public security getSecurity() {
        return security;
    }

    public void setSecurity(security security) {
        this.security = security;
    }

    public legal getLegal() {
        return legal;
    }

    public void setLegal(legal legal) {
        this.legal = legal;
    }
    
}
