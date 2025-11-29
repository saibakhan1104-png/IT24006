public class AverageSpeedKilometers {
    public static void main(String[] args) {
        double miles = 24.0;
        double kilometers = miles * 1.6;

        double totalSeconds = (1 * 3600) + (40 * 60) + 35;
        double hours = totalSeconds / 3600.0;

        double speed = kilometers / hours;

        System.out.println("Average speed in kilometers per hour: " + speed);
    }
}
