package DescriptionModel;

public class participant {

    private String ProviderAdress;

    private String futureUserType;

    public participant(String ProviderAdress, String futureUserType) {
        this.ProviderAdress = ProviderAdress;
        this.futureUserType = futureUserType;
    }

    public participant() {
    }

    public String getProviderAdress() {
        return ProviderAdress;
    }

    public void setProviderAdress(String ProviderAdress) {
        this.ProviderAdress = ProviderAdress;
    }

    public String getFutureUserType() {
        return futureUserType;
    }

    public void setFutureUserType(String futureUserType) {
        this.futureUserType = futureUserType;
    }

   
}
