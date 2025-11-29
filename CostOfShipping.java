import java.util.Scanner;

public class CostOfShipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double w = input.nextDouble();

        double cost;

        if (w <= 0) {
            System.out.println("Invalid input.");
        }
        else if (w <= 1) {
            cost = 3.5;
            System.out.println("Shipping cost: $" + cost);
        }
        else if (w <= 3) {
            cost = 5.5;
            System.out.println("Shipping cost: $" + cost);
        }
        else if (w <= 10) {
            cost = 8.5;
            System.out.println("Shipping cost: $" + cost);
        }
        else if (w <= 20) {
            cost = 10.5;
            System.out.println("Shipping cost: $" + cost);
        }
        else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
