import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial.");
        System.out.print("Pls enter the number: ");
        int num = input.nextInt();
        long fact = findingFact(num);
        System.out.println("Factorial is: " + fact);
    }
    public static long findingFact(int num)
    {
        if (num <= 1) return 1;
        int i = 1;
        long fact = 1;
        while (i <= num)
        {
            fact *= i;
            i++;
        }
        return fact;
    }
}
