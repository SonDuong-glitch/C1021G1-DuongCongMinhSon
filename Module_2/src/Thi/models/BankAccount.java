package Thi.models;

public abstract class BankAccount {
    private int idAccount;
    private String accountCode;
    private String accountName;
    private String accountDate;

    public BankAccount() {
    }

    public BankAccount(int idAccount, String accountCode, String accountName, String accountDate) {
        this.idAccount = idAccount;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.accountDate = accountDate;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "idAccount=" + idAccount +
                ", accountCode='" + accountCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountDate='" + accountDate + '\'' +
                '}';
    }
}
