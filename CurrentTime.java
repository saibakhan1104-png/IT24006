import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for GMT offset
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        // Obtain total milliseconds since midnight, Jan 1, 1970 GMT
        long totalMilliseconds = System.currentTimeMillis();

        // Convert to total seconds
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

        // Adjust for time zone offset
        long currentHour = (currentHourGMT + offset + 24) % 24; // ensure positive

        // Determine AM or PM and convert to 12-hour format
        String period = (currentHour < 12) ? "AM" : "PM";
        long hour12 = currentHour % 12;
        if (hour12 == 0) {
            hour12 = 12;
        }

        // Display the time
        System.out.printf("The current time is %d:%02d:%02d %s%n",
                          hour12, currentMinute, currentSecond, period);
    }
}
