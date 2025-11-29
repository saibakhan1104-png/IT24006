import java.util.Scanner;

public class ComputeChangeFixed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in cents (e.g., 1156 for $11.56): ");
        int amount = input.nextInt();

        int remainingAmount = amount;

        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25
