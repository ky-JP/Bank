public class BankAccount {

    private String number;
    private String bankAccountOwner;

    private double balance;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBankAccountOwner() {
        return bankAccountOwner;
    }

    public void setBankAccountOwner(String bankAccountOwner) {
        this.bankAccountOwner = bankAccountOwner;
    }

    public double getBalance() {
        return balance;
    }

    public void toDeposit(double value) {
        if (value > 0) {
            balance += value;
        } else {
            throw new IllegalArgumentException("Value must be positive");
        }
    }

    public void toWithdraw(double value) {
        if (balance >= value) {
            balance -= value;
        } else {
            throw new IllegalArgumentException("Value must be lower or equal to the balance");
        }
    }
}
