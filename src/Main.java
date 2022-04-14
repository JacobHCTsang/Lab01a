public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(100.00, "abc123", "gates");
        BankAccount b2 = new BankAccount(500.00, "xyz789", "woods");

        System.out.println(b1.getBalance_cdn());
        b1.withdraw(5.00);
        System.out.println(b1.getAccount_number());
        System.out.println(b1.getBalance_cdn());
        System.out.println("---");
        System.out.println(b2.getBalance_cdn());
        b2.deposit(23.00);
        System.out.println(b2.getMember_last_name());
        System.out.println(b2.getBalance_cdn());
        System.out.println("---");
        b1.transfer(50.00, b2);
        System.out.println(b1.getBalance_cdn());
        System.out.println(b2.getBalance_cdn());

    }
}