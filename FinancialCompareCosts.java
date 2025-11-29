import java.util.Scanner;

public class FinancialCompareCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for package 1
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        // Prompt user for package 2
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Compute price per unit weight
        double unitPrice1 = price1 / weight1;
        double unitPrice2 = price2 / weight2;

        // Compare and display which package has a better price
        if (unitPrice1 < unitPrice2) {
            System.out.println("Package 1 has a better price.");
        } else if (unitPrice2 < unitPrice1) {
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Both packages have the same price.");
        }
    }
}
