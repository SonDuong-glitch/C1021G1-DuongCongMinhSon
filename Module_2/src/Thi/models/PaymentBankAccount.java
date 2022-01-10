package Thi.models;

public class PaymentBankAccount extends BankAccount{
    private String PaymentCode;
    private double PaymentMoney;

    public PaymentBankAccount() {
    }

    public PaymentBankAccount(int idAccount, String accountCode, String accountName, String accountDate) {
        super(idAccount, accountCode, accountName, accountDate);
    }

    public PaymentBankAccount(String paymentCode, double paymentMoney) {
        PaymentCode = paymentCode;
        PaymentMoney = paymentMoney;
    }

    public PaymentBankAccount(int idAccount, String accountCode, String accountName, String accountDate, String paymentCode, double paymentMoney) {
        super(idAccount, accountCode, accountName, accountDate);
        PaymentCode = paymentCode;
        PaymentMoney = paymentMoney;
    }

    public String getPaymentCode() {
        return PaymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        PaymentCode = paymentCode;
    }

    public double getPaymentMoney() {
        return PaymentMoney;
    }

    public void setPaymentMoney(double paymentMoney) {
        PaymentMoney = paymentMoney;
    }

    @Override
    public String toString() {
        return "PaymentBankAccount{" +
                "PaymentCode='" + PaymentCode + '\'' +
                ", PaymentMoney=" + PaymentMoney +
                '}';
    }
}
