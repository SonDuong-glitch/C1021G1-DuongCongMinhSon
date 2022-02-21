package model;

public class Attach_Service {
    private int attachServiceId;
    private String attachServiceName;
    private double attachServiceCode;
    private int attachServiceUnit;
    private String attachServiceStatus;

    public Attach_Service() {
    }

    public Attach_Service(int attachServiceId, String attachServiceName, double attachServiceCode, int attachServiceUnit, String attachServiceStatus) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.attachServiceCode = attachServiceCode;
        this.attachServiceUnit = attachServiceUnit;
        this.attachServiceStatus = attachServiceStatus;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public double getAttachServiceCode() {
        return attachServiceCode;
    }

    public void setAttachServiceCode(double attachServiceCode) {
        this.attachServiceCode = attachServiceCode;
    }

    public int getAttachServiceUnit() {
        return attachServiceUnit;
    }

    public void setAttachServiceUnit(int attachServiceUnit) {
        this.attachServiceUnit = attachServiceUnit;
    }

    public String getAttachServiceStatus() {
        return attachServiceStatus;
    }

    public void setAttachServiceStatus(String attachServiceStatus) {
        this.attachServiceStatus = attachServiceStatus;
    }
}
