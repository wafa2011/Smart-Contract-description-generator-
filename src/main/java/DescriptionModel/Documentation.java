package DescriptionModel;

public class Documentation {

    private String UsedCompiler;

    private String UsedRessources;

    private String abi;

    private String deployedbyteCode;

    private String hash;

    private String description;

    private String metadata;

    public Documentation(String UsedCompiler, String UsedRessources, String abi, String deployedbyteCode, String hash, String description, String metadata) {
        this.UsedCompiler = UsedCompiler;
        this.UsedRessources = UsedRessources;
        this.abi = abi;
        this.deployedbyteCode = deployedbyteCode;
        this.hash = hash;
        this.description = description;
        this.metadata = metadata;
    }

    public Documentation() {
    }

    public String getUsedCompiler() {
        return UsedCompiler;
    }

    public void setUsedCompiler(String UsedCompiler) {
        this.UsedCompiler = UsedCompiler;
    }

    public String getUsedRessources() {
        return UsedRessources;
    }

    public void setUsedRessources(String UsedRessources) {
        this.UsedRessources = UsedRessources;
    }

    public String getAbi() {
        return abi;
    }

    public void setAbi(String abi) {
        this.abi = abi;
    }

    public String getDeployedbyteCode() {
        return deployedbyteCode;
    }

    public void setDeployedbyteCode(String deployedbyteCode) {
        this.deployedbyteCode = deployedbyteCode;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
    
}
