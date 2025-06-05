import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial.");
        System.out.print("Pls enter the number: ");
        int num = input.nextInt();
        boolean prime = checkingPrime(num);
        if (prime) System.out.println("Is prime");
        else System.out.println("Not Prime");
    }

    public static boolean checkingPrime(int num)
    {
        int i = 2;
        while (i <= num/2)
        {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }
}
