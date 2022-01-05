package DescriptionModel;

public class DescriptionManager {

    private String name;

    private String version;

    private String creationDate;
    DiscMetier metierDisc;
    DiscOperationnelle operationalDisc;
    Disctechnique techniqueDisc;

    public DescriptionManager(String name, String version, String creationDate, DiscMetier metierDisc, DiscOperationnelle operationalDisc, Disctechnique techniqueDisc) {
        this.name = name;
        this.version = version;
        this.creationDate = creationDate;
        this.metierDisc = metierDisc;
        this.operationalDisc = operationalDisc;
        this.techniqueDisc = techniqueDisc;
    }

    public DescriptionManager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public DiscMetier getMetierDisc() {
        return metierDisc;
    }

    public void setMetierDisc(DiscMetier metierDisc) {
        this.metierDisc = metierDisc;
    }

    public DiscOperationnelle getOperationalDisc() {
        return operationalDisc;
    }

    public void setOperationalDisc(DiscOperationnelle operationalDisc) {
        this.operationalDisc = operationalDisc;
    }

    public Disctechnique getTechniqueDisc() {
        return techniqueDisc;
    }

    public void setTechniqueDisc(Disctechnique techniqueDisc) {
        this.techniqueDisc = techniqueDisc;
    }
    
}
