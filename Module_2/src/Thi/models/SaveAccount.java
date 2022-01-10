package Thi.models;

public class SaveAccount extends BankAccount{
    private double saveMoney;
    private String dateSaveMoney;
    private double SaveInterest;
    private String  period;

    public SaveAccount() {
    }

    public SaveAccount(int idAccount, String accountCode, String accountName, String accountDate) {
        super(idAccount, accountCode, accountName, accountDate);
    }

    public SaveAccount(double saveMoney, String dateSaveMoney, double saveInterest, String period) {
        this.saveMoney = saveMoney;
        this.dateSaveMoney = dateSaveMoney;
        SaveInterest = saveInterest;
        this.period = period;
    }

    public SaveAccount(int idAccount, String accountCode, String accountName, String accountDate, double saveMoney, String dateSaveMoney, double saveInterest, String period) {
        super(idAccount, accountCode, accountName, accountDate);
        this.saveMoney = saveMoney;
        this.dateSaveMoney = dateSaveMoney;
        SaveInterest = saveInterest;
        this.period = period;
    }

    public double getSaveMoney() {
        return saveMoney;
    }

    public void setSaveMoney(double saveMoney) {
        this.saveMoney = saveMoney;
    }

    public String getDateSaveMoney() {
        return dateSaveMoney;
    }

    public void setDateSaveMoney(String dateSaveMoney) {
        this.dateSaveMoney = dateSaveMoney;
    }

    public double getSaveInterest() {
        return SaveInterest;
    }

    public void setSaveInterest(double saveInterest) {
        SaveInterest = saveInterest;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "SaveAccount{" +
                "saveMoney=" + saveMoney +
                ", dateSaveMoney='" + dateSaveMoney + '\'' +
                ", SaveInterest=" + SaveInterest +
                ", period='" + period + '\'' +
                '}';
    }
}
