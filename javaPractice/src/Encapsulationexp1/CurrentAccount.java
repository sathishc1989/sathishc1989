package Encapsulationexp1;

// Child Class - Current Account
class CurrentAccount extends Account
{

    public CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance : ₹" + getBalance());
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}