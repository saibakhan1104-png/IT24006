public class AverageSpeed {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double miles = kilometers / 1.6;

        double totalSeconds = 45 * 60 + 30; // 45 min 30 sec
        double hours = totalSeconds / 3600.0;

        double speed = miles / hours;

        System.out.println("Average speed in miles per hour: " + speed);
    }
}
