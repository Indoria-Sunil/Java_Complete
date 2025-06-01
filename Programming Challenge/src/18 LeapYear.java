import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Leap year checker.");
        System.out.print("Please enter year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
        {
            System.out.println("Year is leap!");
        }
        else {
            System.out.println("Year is Not Leap year.");
        }
    }
}
