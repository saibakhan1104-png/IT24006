import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {

        // Generate two random integers less than 100
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);

        // Ask the addition question
        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();

        // Check and display result
        if (number1 + number2 == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong. The correct answer is " + (number1 + number2));
        }
    }
}
