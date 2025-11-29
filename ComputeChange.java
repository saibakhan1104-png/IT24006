import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input amount as a double
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        // Convert to cents
        int remainingAmount = (int) Math.round(amount * 100);

        // Find number of dollars
        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        // Find number of quarters
        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        // Find number of dimes
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        // Find number of nickels
        int nickels
