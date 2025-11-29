import java.util.Scanner;

public class ComputeThePerimeterOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first edge: ");
        double a = input.nextDouble();

        System.out.print("Enter the second edge: ");
        double b = input.nextDouble();

        System.out.print("Enter the third edge: ");
        double c = input.nextDouble();

        // Check if the input is valid
        if (a + b > c && a + c > b && b + c > a) {
            double perimeter = a + b + c;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("Invalid input. The edges do not form a triangle.");
        }
    }
}
