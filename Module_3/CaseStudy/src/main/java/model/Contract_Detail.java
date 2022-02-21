package model;

public class Contract_Detail {
    private int contractDetailId;
    private int contractId;
    private int attachServiceId;
    private int quality;

    public Contract_Detail() {
    }

    public Contract_Detail(int contractDetailId, int contractId, int attachServiceId, int quality) {
        this.contractDetailId = contractDetailId;
        this.contractId = contractId;
        this.attachServiceId = attachServiceId;
        this.quality = quality;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
