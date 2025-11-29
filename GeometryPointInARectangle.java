import java.util.Scanner;

public class GeometryPointInARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Rectangle centered at (0,0)
        double width = 10;
        double height = 5;

        // Check if point is within the rectangle
        if (Math.abs(x) <= width / 2 && Math.abs(y) <= height / 2) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}
