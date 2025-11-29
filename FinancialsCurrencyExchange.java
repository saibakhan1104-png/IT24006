import java.util.Scanner;

public class FinancialsCurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for exchange rate
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        // Prompt user for conversion direction
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int choice = input.nextInt();

        if (choice == 0) {
            // Dollars to RMB
            System.out.print("Enter the dollar amount: ");
            double dollars = input.nextDouble();
            double rmb = dollars * exchangeRate;
            System.out.printf("$%.2f is %.2f yuan%n", dollars, rmb);
        } else if (choice == 1) {
            // RMB to Dollars
            System.out.print("Enter the RMB amount: ");
            double rmb = input.nextDouble();
            double dollars = rmb / exchangeRate;
            System.out.printf("%.2f yuan is $%.2f%n", rmb, dollars);
        } else {
            System.out.println("Invalid choice. Enter 0 or 1.");
        }
    }
}
