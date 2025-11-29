import java.util.Scanner;

public class ISBN10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String isbn9 = input.nextLine();

        // Ensure leading zeros are preserved
        while (isbn9.length() < 9) {
            isbn9 = "0" + isbn9;
        }

        int checksum = 0;

        // Calculate checksum using: (d1*1 + d2*2 + ... + d9*9) % 11
        for (int i = 0; i < 9; i++) {
            int digit = isbn9.charAt(i) - '0';
            checksum += digit * (i + 1);
        }

        checksum = checksum % 11;

        // Determine last digit
        String lastDigit = (checksum == 10) ? "X" : String.valueOf(checksum);

        System.out.println("The ISBN-10 number is " + isbn9 + lastDigit);
    }
}
