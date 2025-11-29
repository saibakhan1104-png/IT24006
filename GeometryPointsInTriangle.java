import java.util.Scanner;

public class GeometryPointsInTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Right triangle vertices
        double x0 = 0, y0 = 0;       // Right-angle vertex
        double x1 = 200, y1 = 0;
        double x2 = 0, y2 = 100;

        // Prompt user for a point
        System.out.print("Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Use area method to check if the point is inside the triangle
        // Formula for area of triangle with vertices (x0,y0), (x1,y1), (x2,y2):
        // Area = 0.5 * | x0(y1 - y2) + x1(y2 - y0) + x2(y0 - y1) |

        // Area of the full triangle
        double area = 0.5 * Math.abs(x0*(y1 - y2) + x1*(y2 - y0) + x2*(y0 - y1));

        // Area of three sub-triangles with the point (x, y)
        double area1
