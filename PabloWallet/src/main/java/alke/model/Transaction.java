package alke.model;

import java.util.Date;

public class Transaction {
    private int userId;
    private double amount;
    private Date date;
    private String description;

    // Constructor
    public Transaction(int userId, double amount, Date date, String description) {
        this.userId = userId;
        this.amount = amount;
        this.date = date;
        this.description = description;
    }

    // Getters y setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setType(String description ) {
        this.description = description;
    }
}
