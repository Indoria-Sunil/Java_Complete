import java.util.Scanner;

class MonthOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Month Mapping\n");
        System.out.print("Please enter your month number ");
        int mon = input.nextInt();
        String monName = getMonthName(mon);
        System.out.println("Month name is: " + monName);
    }

    public static String getMonthName(int mon) {
        String monName = switch (mon) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11-> "November";
            case 12 -> "December";
            default -> "Invalid input";
        };
        return monName;
    }
}
