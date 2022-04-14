/**
 * @author Jacob Tsang and Daniel Wart
 */
public class BankAccount {
    /**
     * I'm still fixing the variable names..
     */
    private double balance_cdn;
    private String account_number;
    private String member_last_name;
    public BankAccount(double balance_cdn, String account_number, String member_last_name) {
        this.balance_cdn = balance_cdn;
        this.account_number = account_number;
        this.member_last_name = member_last_name;
    }

    public void withdraw(double amount_cdn) {
        this.balance_cdn -= amount_cdn;
    }

    public void deposit(double amount_cdn) {
        this.balance_cdn += amount_cdn;
    }

    public void transfer(double amount_cdn, BankAccount recipient_account) {
        recipient_account.deposit(amount_cdn);
        this.withdraw(amount_cdn);
    }

    public double getBalance_cdn() {
        return balance_cdn;
    }

    public String getAccount_number() {
        return account_number;
    }

    public String getMember_last_name() {
        return member_last_name;
    }
}