import java.util.Scanner;

public class GeometryPointOnLineSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for three points: p0, p1, p2
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Check if p2 is on the line formed by p0 and p1
        double crossProduct = (x2 - x0) * (y1 - y0) - (y2 - y0) * (x1 - x0);

        // If crossProduct is 0, points are collinear
        if (Math.abs(crossProduct) > 1e-6) {
            System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n",
                    x2, y2, x0, y0, x1, y1);
        } else {
            // Check if p2 lies within the segment bounds
            boolean onSegment = (x2 >= Math.min(x0, x1) && x2 <= Math.max(x0, x1)) &&
                                (y2 >= Math.min(y0, y1) && y2 <= Math.max(y0, y1));

            if (onSegment) {
                System.out.printf("(%.1f, %.1f) is on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n",
                        x2, y2, x0, y0, x1, y1);
            } else {
                System.out.printf("(%.1f, %.1f) is not on the line segment from (%.1f, %.1f) to (%.1f, %.1f)%n",
                        x2, y2, x0, y0, x1, y1);
            }
        }
    }
}
