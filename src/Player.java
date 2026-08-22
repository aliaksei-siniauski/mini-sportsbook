public class Player {
    private int id;
    private double balance;
    private String username;

    public Player(int id, double balance, String username) {
        this.id = id;
        this.balance = balance;
        this.username = username;
    }

    // getters
    public double getBalance() {
        return balance;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "ID: " + id
                + "\nBalance: " + balance
                + "\nUsername: " + username;
    }
}
