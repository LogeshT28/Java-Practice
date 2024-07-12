class Solution {
    // Method to determine if a given year is a leap year
    public boolean isLeap(int n) {
        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    // Method to return the number of days in a given month of a non-leap year
    public int dayOfMonth(int n) {
        switch (n) {
            case 1: return 31;
            case 2: return 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        }
        return 0; // This line should never be reached
    }

    // Method to calculate the day of the week for a given date
    public String dayOfTheWeek(int day, int month, int year) {
        int daysOfYear = 0;

        // Calculate the number of days from 1971 to the year before the given year
        for (int i = 1971; i < year; i++) {
            if (isLeap(i)) {
                daysOfYear += 366;
            } else {
                daysOfYear += 365;
            }
        }

        // Calculate the number of days from January to the month before the given month in the given year
        for (int i = 1; i < month; i++) {
            if (i == 2 && isLeap(year)) {
                daysOfYear += 29;
            } else {
                daysOfYear += dayOfMonth(i);
            }
        }

        // Add the number of days in the given month
        daysOfYear += day;

        // Determine the day of the week
        int res = (daysOfYear + 4) % 7;

        String[] daysOfWeek = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        return daysOfWeek[res];
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Test cases
        System.out.println(sol.dayOfTheWeek(31, 8, 2019)); // Expected output: "Saturday"
        System.out.println(sol.dayOfTheWeek(18, 7, 1999)); // Expected output: "Sunday"
        System.out.println(sol.dayOfTheWeek(15, 8, 1993)); // Expected output: "Sunday"
    }
}
