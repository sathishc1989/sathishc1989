package interfaceExamples;

import java.util.Scanner;

public class GovernmentCitizenServicePortal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter Citizen Name: ");
        String name = sc.nextLine();

        // Menu
        System.out.println("\nSelect Service");
        System.out.println("1. Aadhaar Service");
        System.out.println("2. Passport Service");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Citizen c;

        switch (choice) {
            case 1:
                c = new AadhaarService(name);
                ((Service) c).applyService();
                break;

            case 2:
                c = new PassportService(name);
                ((Service) c).applyService();
                break;

            default:
                System.out.println("Invalid Service Selected");
        }

        sc.close();
    }
}
