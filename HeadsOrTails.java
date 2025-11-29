import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 0 = Heads, 1 = Tails
        int coin = (int)(Math.random() * 2);

        System.out.print("Enter your guess (0 for Heads, 1 for Tails): ");
        int guess = input.nextInt();

        if (guess == coin) {
            System.out.println("Correct! The coin was " + (coin == 0 ? "Heads" : "Tails"));
        } else {
            System.out.println("Incorrect. The coin was " + (coin == 0 ? "Heads" : "Tails"));
        }
    }
}
