import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GetInput {
    static LocalDate currentDate = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String formattedString = currentDate.format(formatter);
    public static Scanner sc = new Scanner(System.in);

    public static int getInt(String prompt) {
        int input;
        System.out.print(prompt);
        do {
            try {
                input = Integer.parseInt(sc.nextLine());
                if (input <= 0)
                    System.out.println("| >> Invalid input, please type again.");
            } catch (NumberFormatException e) {
                System.out.println("| >> Invalid input, please type again.");
                input = -1;
            }
        } while (input <= 0);
        return input;
    }

    public static long getLong(String prompt) {
        long input;
        System.out.print(prompt);
        do {
            try {
                input = Long.parseLong(sc.nextLine());
                if (input <= 0)
                    System.out.println("| >> Invalid input, please type again.");
            } catch (NumberFormatException e) {
                System.out.println("| >> Invalid input, please type again.");
                input = -1;
            }
        } while (input <= 0);
        return input;
    }

    public static double getDouble(String prompt) {
        double input;
        System.out.print(prompt);
        do {
            try {
                input = Double.parseDouble(sc.nextLine());
                if (input <= 0)
                    System.out.println("| >> Invalid input, please type again.");
            } catch (NumberFormatException e) {
                System.out.println("| >> Invalid input, please type again.");
                input = -1;
            }
        } while (input <= 0);
        return input;
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    public static LocalDate getDate(String prompt) {
        //System.out.print(prompt);
        String plainDate = getString(prompt);
        LocalDate ld = LocalDate.parse(plainDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if (ld.isAfter(currentDate)) {
            return ld;
        } else {
            System.out.println("Invalid date. Please enter a date after " + currentDate);
            return getDate(prompt);
        }
    }

    public static boolean getBool(String prompt) {
        boolean result;
        System.out.print(prompt);
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("yes")
                || Integer.parseInt(input) == 1 || input.equalsIgnoreCase("y"))
            result = true;
        else if (input.equalsIgnoreCase("false") || input.equalsIgnoreCase("no")
                || Integer.parseInt(input) == 0 || input.equalsIgnoreCase("n"))
            result = false;
        else {
            System.out.println("| >> Invalid input, please try again.");
            result = getBool(prompt);
        }
        return result;
    }

    public static int getInt1(String msg, int minRange, int maxRange) {
        if (minRange > maxRange) {
            int temp = minRange;
            minRange = maxRange;
            maxRange = temp;
        }

        int value = Integer.MIN_VALUE;

        do {
            try {
                if (msg != null) {
                    System.out.print(msg);
                }

                value = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Data input is valid");
            }
        } while (value < minRange || value > maxRange);
        return value;
    }

}
