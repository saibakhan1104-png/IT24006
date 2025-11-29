import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int temp;

        // Sort using simple swapping
        if (a > b) {
            temp = a; a = b; b = temp;
        }
        if (b > c) {
            temp = b; b = c; c = temp;
        }
        if (a > b) {
            temp = a; a = b; b = temp;
        }
