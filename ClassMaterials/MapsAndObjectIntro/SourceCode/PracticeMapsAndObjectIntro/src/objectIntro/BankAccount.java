package objectIntro;

public class BankAccount {



    private String name;
    private double balance;

    //Fields and Data
    /**
     * Constructs a default bank account.
     */
    public BankAccount() {
        this.name = "UNKNOWN";
        this.balance = 0.0;
    }

    //Methods
    /**
     * Constructs an account with the given name nad starting balance
     * @param name the account name
     * @param initialBalance starting account balance, in USD
     */
    public BankAccount(String name, double initialBalance) {
    this.name = name;
    this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;

    }
}
