package DescriptionModel;


import java.util.Date;

public class common {

    private String Type;

    private String category;

    private String creationDate;

    private String updateDate;

    private String statue;

    private String version;

    private String InitialBalance;

    private String lifeCycle;

    public common(String Type, String category, String creationDate, String updateDate, String statue, String version, String InitialBalance, String lifeCycle) {
        this.Type = Type;
        this.category = category;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.statue = statue;
        this.version = version;
        this.InitialBalance = InitialBalance;
        this.lifeCycle = lifeCycle;
    }

    public common() {
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInitialBalance() {
        return InitialBalance;
    }

    public void setInitialBalance(String InitialBalance) {
        this.InitialBalance = InitialBalance;
    }

    public String getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(String lifeCycle) {
        this.lifeCycle = lifeCycle;
    }
    

}