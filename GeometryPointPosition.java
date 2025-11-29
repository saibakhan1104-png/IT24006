import java.util.Scanner;

public class GeometryPointPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter three points: p0, p1, p2
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Compute the determinant
        double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        // Determine position of p2 relative to line from p0 to p1
        if (position > 0) {
            System.out.println("p2 is on the left side of the line");
        } else if (position < 0) {
            System.out.println("p2 is on the right side of the line");
        } else {
            System.out.println("p2 is on the same line");
        }
    }
}
