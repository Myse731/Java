class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
    Account(){}
}

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account(10000);
        Account account2 = new Account();
    }
}