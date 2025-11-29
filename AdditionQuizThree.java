import java.util.Scanner;

public class AdditionQuizThree {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

        if (answer == number1 + number2 + number3) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong. The correct answer is " + (number1 + number2 + number3));
        }
    }
}
