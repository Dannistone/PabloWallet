package alke.model;

public class User {
	 private String username;
	    private String password;
	    private String email;
	    private double balance;

	    // Constructor
	    
	    public User() {
	        // Constructor sin argumentos
	    }
	    public User(String username, String password, String email, double balance) {
	        this.username = username;
	        this.password = password;
	        this.email = email;
	        this.balance = balance;
	    }

	    // Getters y setters
	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }
}
