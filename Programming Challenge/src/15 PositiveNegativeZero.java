import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker.");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if(num > 0)
        {
            System.out.println("Entered number is Positive.");
        }
        else if (num < 0 )
        {
            System.out.println("Entered number is Negative.");
        }
        else
        {
            System.out.println("Number is Zero.");
        }
    }
}
