import java.util.Scanner;

public class FutureDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input today's day
        System.out.print("Enter today’s day (0=Sun, 1=Mon, ..., 6=Sat): ");
        int today = input.nextInt();

        // Input elapsed days
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();

        // Calculate future day
        int futureDay = (today + elapsed) % 7;

        // Convert numbers to day names
        String todayName = getDayName(today);
        String futureDayName = getDayName(futureDay);

        // Output results
        System.out.println("Today is " + todayName + " and the future day is " + futureDayName);
    }

    // Method that returns day name for number 0–6
    public static String getDayName(int day) {
        switch (day) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Invalid day";
        }
    }
}
