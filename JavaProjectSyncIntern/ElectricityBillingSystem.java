import java.util.Scanner;

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        final double UNIT_RATE = 5.0; // Cost per unit in dollars

        // Input customer details
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer ID: ");
        String customerID = scanner.nextLine();
        System.out.print("Enter previous month's reading: ");
        double prevMonthReading = scanner.nextDouble();
        System.out.print("Enter current month's reading: ");
        double currMonthReading = scanner.nextDouble();

        // Calculate units consumed
        double unitsConsumed = currMonthReading - prevMonthReading;

        // Calculate bill amount
        double billAmount = unitsConsumed * UNIT_RATE;

        // Display the bill
        System.out.println("\nElectricity Bill");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: $" + billAmount);

        scanner.close();
    }
}
