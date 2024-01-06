public class AccountHolder {

    // properties
    private String name;
    private String lastName;
    private double initialBalance;
    private String user;
    private String password;


    // Constructor
    public AccountHolder(String name, String lastName, double initialBalance, String user, String password) {
        this.name = name;
        this.lastName = lastName;
        this.initialBalance = initialBalance;
        this.user = user;
        this.password = password;
    }


    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Methods
    public void deposit(double amount){
        initialBalance = initialBalance + amount;
        System.out.println("The deposit was successful");
        System.out.println("Your new balance is: " + initialBalance);
    }

    public void withdraw(double amount) {
        if (initialBalance >= amount) {
            initialBalance = initialBalance - amount;
            System.out.println("The withdraw was successful.");
            System.out.println("Take your money.");
            System.out.println("Your new balance is: " + initialBalance);
        } else {
            System.out.println("Without sufficient balance, try again.");
        }
    }

    public void transfer(String name, double amount) {
        if (initialBalance >= amount) {
            initialBalance = initialBalance - amount;
            System.out.println("The transfer was successful.");
            System.out.println("To user: " + name);
            System.out.println("Amount: " + amount);
            System.out.println("Your new balance is: " + initialBalance);
        } else {
            System.out.println("Without sufficient balance, try again.");
        }
    }

}
