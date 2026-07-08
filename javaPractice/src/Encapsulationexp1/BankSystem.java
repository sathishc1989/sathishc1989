package Encapsulationexp1;

import java.util.Scanner;
// Main Class
public class BankSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Savings Account
        System.out.println("----- Savings Account -----");
        System.out.print("Enter Account Number: ");
        int sAcc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String sName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double sBalance = sc.nextDouble();

        SavingsAccount sa = new SavingsAccount(sAcc, sName, sBalance);

        System.out.print("Enter Deposit Amount: ");
        double deposit = sc.nextDouble();

        sa.deposit(deposit);

        System.out.println("\nUpdated Savings Account Details:");
        sa.displayDetails();

        // Current Account
        System.out.println("\n----- Current Account -----");

        System.out.print("Enter Account Number: ");
        int cAcc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String cName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double cBalance = sc.nextDouble();

        CurrentAccount ca = new CurrentAccount(cAcc, cName, cBalance);

        System.out.print("Enter Withdrawal Amount: ");
        double withdraw = sc.nextDouble();

        ca.withdraw(withdraw);

        System.out.println("\nCurrent Account Details:");
        ca.displayDetails();

        sc.close();
    }
}