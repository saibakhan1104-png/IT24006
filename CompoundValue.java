import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        double monthlyInterestRate = 0.05 / 12;
        double accountValue = 0;

        // Calculate the account value month by month
        for (int month = 1; month <= 6; month++) {
            accountValue = (monthlySaving + accountValue) * (1 + monthlyInterestRate);
        }

        System.out.printf("After the sixth month, the account value is $%.2f\n", accountValue);
    }
}
