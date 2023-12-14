public class BankAccount {

    private String number;
    private String bankAccountOwner;

    private double balance;

    public BankAccount(String number, String bankAccountOwner) {
        this.number = number;
        this.bankAccountOwner = bankAccountOwner;
    }


    public String getNumber() {
        return number;
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

    // A $5.00 fee is charged for each withdraw
    /* The account may have a negative balance if the balance is not
    enough to make the withdrawal and/or pay the fee*/

    public void toWithdraw(double value) {
        balance -= value - 5;
    }

    @Override
    public String toString() {
        return "Account " + number  + ", " +
                "Holder: " + bankAccountOwner + ", " +
                "Balance: $ " + String.format("%.2f", balance);

    }
}
