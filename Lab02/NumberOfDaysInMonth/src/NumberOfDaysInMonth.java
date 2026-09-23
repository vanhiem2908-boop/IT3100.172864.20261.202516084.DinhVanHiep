import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0, year = 0;

        while (true) {
            System.out.print("Enter month: ");
            String monthInput = scanner.next().trim();
            month = parseMonth(monthInput);

            System.out.print("Enter year: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (month != -1 && year >= 0) {
                    break;
                }
            } else {
                scanner.next(); // Clear invalid input
            }
            System.out.println("Invalid month or year. Please enter again.\n");
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = 0;

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = isLeapYear ? 29 : 28;
                break;
        }

        System.out.println("Number of days: " + days);
        scanner.close();
    }

    private static int parseMonth(String input) {
        input = input.toLowerCase();
        switch (input) {
            case "1": case "january": case "jan.": case "jan": return 1;
            case "2": case "february": case "feb.": case "feb": return 2;
            case "3": case "march": case "mar.": case "mar": return 3;
            case "4": case "april": case "apr.": case "apr": return 4;
            case "5": case "may": return 5;
            case "6": case "june": case "jun": return 6;
            case "7": case "july": case "jul": return 7;
            case "8": case "august": case "aug.": case "aug": return 8;
            case "9": case "september": case "sept.": case "sep": return 9;
            case "10": case "october": case "oct.": case "oct": return 10;
            case "11": case "november": case "nov.": case "nov": return 11;
            case "12": case "december": case "dec.": case "dec": return 12;
            default: return -1;
        }
    }
}