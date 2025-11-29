import java.util.Scanner;

public class CurrentTimeWithOffset {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain total seconds
        long totalSeconds = totalMilliseconds / 1000;

        // Current second
        long currentSecond = totalSeconds % 60;

        // Total minutes
        long totalMinutes = totalSeconds / 60;

        // Current minute
        long currentMinute = totalMinutes % 60;

        // Total hours
        long totalHours = totalMinutes / 60;

        // Current hour in GMT
        long currentHourGMT = totalHours % 24;

        // Current hour with time zone offset
        long currentHour = (currentHourGMT + offset + 24) % 24;

        System.out.println("The current time is " + currentHour + ":" 
                           + currentMinute + ":" + currentSecond);
    }
}
