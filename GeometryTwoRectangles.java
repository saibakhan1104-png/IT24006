import java.util.Scanner;

public class GeometryTwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for rectangle 1
        System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double w1 = input.nextDouble();
        double h1 = input.nextDouble();

        // Input for rectangle 2
        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double w2 = input.nextDouble();
        double h2 = input.nextDouble();

        // Compute sides of rectangles
        double r1Left = x1 - w1 / 2;
        double r1Righ
