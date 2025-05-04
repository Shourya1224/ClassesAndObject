public class Demo3 {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public Demo3(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------------");
    }

   
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.0);

        account1.displayAccountDetails();

        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(1500.0); 

        account1.displayAccountDetails();
    }
}
    
