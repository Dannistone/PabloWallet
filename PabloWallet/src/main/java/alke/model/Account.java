package alke.model;

public class Account {
    private int userId;
    private double balance;

    // Constructor
    public Account() {
    }

    public Account(int userId, double balance) {
        this.userId = userId;
        this.balance = balance;
    }

    // Getters y Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
