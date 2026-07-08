package Encapsulationexp1;

// Child Class - Savings Account
class SavingsAccount extends Account
{

    public SavingsAccount(int accountNumber, String accountHolder, double balance)
    {
        super(accountNumber, accountHolder, balance);
    }

    public void deposit(double amount)
    {
        double balance = getBalance() + amount;

        // Add interest if balance >= 50000
        if (balance >= 50000) {
            double interest = balance * 0.05; // 5% interest
            balance += interest;
            System.out.println("Interest Added : ₹" + interest);
        }

        setBalance(balance);
    }
}
