package DescriptionModel;

public class DiscMetier {
  Qualite_de_service qos;
  participant participant;
  smartContractcaracter smartcontractcaracter;
 

    public DiscMetier() {
    }

    public DiscMetier(Qualite_de_service qos, participant participant, smartContractcaracter smartcontractcaracter) {
        this.qos = qos;
        this.participant = participant;
        this.smartcontractcaracter = smartcontractcaracter;
       
    }

    

    public Qualite_de_service getQos() {
        return qos;
    }

    public void setQos(Qualite_de_service qos) {
        this.qos = qos;
    }

    public participant getParticipant() {
        return participant;
    }

    public void setParticipant(participant participant) {
        this.participant = participant;
    }

    public smartContractcaracter getSmartcontractcaracter() {
        return smartcontractcaracter;
    }

    public void setSmartcontractcaracter(smartContractcaracter smartcontractcaracter) {
        this.smartcontractcaracter = smartcontractcaracter;
    }
  
    
}
