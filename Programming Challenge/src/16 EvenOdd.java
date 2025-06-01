import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Checker.");
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("Number is Even.");
        } else
        {
            System.out.println("Number is Odd");
        }
    }
}
