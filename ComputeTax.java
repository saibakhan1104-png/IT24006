import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print(
            "0 – Single filer\n" +
            "1 – Married filing jointly\n" +
            "2 – Married filing separately\n" +
            "3 – Head of household\n" +
            "Enter the filing status: ");

        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

        // Compute tax according to status
        if (status == 0) {  
            // SINGLE FILER  
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + 25600 * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + 25600 * 0.15 + 48300 * 0.25 +
                      (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + 25600 * 0.15 + 48300 * 0.25 +
                      89300 * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + 25600 * 0.15 + 48300 * 0.25 +
                      89300 * 0.28 + 201400 * 0.33 + (income - 372950) * 0.35;
        }

        else if (status == 1) {  
            // MARRIED FILING JOINTLY  
            if (income <= 16700)
                tax = income * 0.10;
            else if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
            else if (income <= 137050)
                tax = 16700 * 0.10 + 51200 * 0.15 + (income - 67900) * 0.25;
            else if (income <= 208850)
                tax = 16700 * 0.10 + 51200 * 0.15 + 69150 * 0.25 +
                      (income - 137050) * 0.28;
            else if (income <= 372950)
                tax = 16700 * 0.10 + 51200 * 0.15 + 69150 * 0.25 +
                      71700 * 0.28 + (income - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + 51200 * 0.15 + 69150 * 0.25 +
                      71700 * 0.28 + 164100 * 0.33 + (income - 372950) * 0.35;
        }

        else if (status == 2) {  
            // MARRIED FILING SEPARATELY  
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 68525)
                tax = 8350 * 0.10 + 25600 * 0.15 + (income - 33950) * 0.25;
            else if (income <= 104425)
                tax = 8350 * 0.10 + 25600 * 0.15 + 34575 * 0.25 +
                      (income - 68525) * 0.28;
            else if (income <= 186475)
                tax = 8350 * 0.10 + 25600 * 0.15 + 34575 * 0.25 +
                      35899 * 0.28 + (income - 104425) * 0.33;
            else
                tax = 8350 * 0.10 + 25600 * 0.15 + 34575 * 0.25 +
                      35899 * 0.28 + 82050 * 0.33 + (income - 186475) * 0.35;
        }

        else if (status == 3) {  
            // HEAD OF HOUSEHOLD  
            if (income <= 11950)
                tax = income * 0.10;
            else if (income <= 45500)
