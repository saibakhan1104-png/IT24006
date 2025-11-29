import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter feet: ");
        int feet = input.nextInt();

        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height to total inches
        int totalInches = feet * 12 + inches;

        // Convert to meters
        double heightMeters = totalInches * 0.0254;

        // Convert pounds to kg
        double weightKg = weightPounds * 0.45359237;

        // Compute BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display BMI
        System.out.println("BMI is " + bmi);

        // Interpret BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
