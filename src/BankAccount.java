/**
 * @author Jacob Tsang and Daniel Wart
 */
public class BankAccount {
    /**
     * I'm still fixing the variable names..
     */
    private double balanceCdn;
    private String accountNumber;
    private String memberLastName;
    public BankAccount(double balanceCdn, String accountNumber, String memberLastName) {
        this.balanceCdn = balanceCdn;
        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
    }

    public void withdraw(double amount_cdn) {
        this.balanceCdn -= amount_cdn;
    }

    public void deposit(double amount_cdn) {
        this.balanceCdn += amount_cdn;
    }

    public void transfer(double amount_cdn, BankAccount recipient_account) {
        recipient_account.deposit(amount_cdn);
        this.withdraw(amount_cdn);
    }

    public double getBalanceCdn() {
        return balanceCdn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getMemberLastName() {
        return memberLastName;
    }
}