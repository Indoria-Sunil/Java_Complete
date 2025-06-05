import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Digit sum finder.");
        System.out.println("Pls enter number: ");
        int number = input.nextInt();
        int sum = digitSumFinder(number);
        System.out.println("Sum of the digits is: " + sum);
    }

    public static int digitSumFinder(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
