package DescriptionModel;

public class Disctechnique {
    BlockchaiInformation blockchaininfo;
    protocolInformation protocolinfo;

    public Disctechnique(BlockchaiInformation blockchaininfo, protocolInformation protocolinfo) {
        this.blockchaininfo = blockchaininfo;
        this.protocolinfo = protocolinfo;
    }

    public Disctechnique() {
    }

    public BlockchaiInformation getBlockchaininfo() {
        return blockchaininfo;
    }

    public void setBlockchaininfo(BlockchaiInformation blockchaininfo) {
        this.blockchaininfo = blockchaininfo;
    }

    public protocolInformation getProtocolinfo() {
        return protocolinfo;
    }

    public void setProtocolinfo(protocolInformation protocolinfo) {
        this.protocolinfo = protocolinfo;
    }
    
}
