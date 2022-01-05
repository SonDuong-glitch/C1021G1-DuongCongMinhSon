package case_study.task1.FuramaResort.models;

public class Contract {
    private String contractid;
    private String idbooking;
    private String deposit;
    private int totalmoney;
    private String idcustomer;

    public Contract(){};


    public Contract(String contractid, String idbooking, String deposit, int totalmoney, String idcustomer) {
        this.contractid = contractid;
        this.idbooking = idbooking;
        this.deposit = deposit;
        this.totalmoney = totalmoney;
        this.idcustomer = idcustomer;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    public String getIdbooking() {
        return idbooking;
    }

    public void setIdbooking(String idbooking) {
        this.idbooking = idbooking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public int getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(int totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(String idcustomer) {
        this.idcustomer = idcustomer;
    }
}
