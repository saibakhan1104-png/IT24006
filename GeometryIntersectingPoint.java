import java.util.Scanner;

public class GeometryIntersectingPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input points on line 1
        System.out.print("Enter x1, y1, x2, y2 for line 1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // Input points on line 2
        System.out.print("Enter x3, y3, x4, y4 for line 2: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();

        // Compute coefficients for the linear system
        double a1 = y1 - y2;
        double b1 = -(x1 - x2);
        double c1 = a1 * x1 + b1 * y1;

        double a2 = y3 - y4;
        double b2 = -(x3 - x4);
        double c2 = a2 * x3 + b2 * y3;

        // Determinant
        double det = a1 * b2 - a2 * b1;

        if (det == 0) {
            System.out.println("The lines are parallel and have no intersecting point.");
        } else {
            do
