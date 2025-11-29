import java.util.Scanner;

public class GeometryTwoCircles  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for circle1
        System.out.print("Enter circle1’s center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();

        // Input for circle2
        System.out.print("Enter circle2’s center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();

        // Compute distance between centers
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (distance <= r1 - r2) {
            System.out.println("circle2 is inside circle1");
        } else if (distance <= r1 + r2) {
            System.out.println("circle2 overlaps circle1");
        } else {
