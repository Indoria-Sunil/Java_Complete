import java.util.Scanner;

class PrimeUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime number Checker\n");
        System.out.print("Please enter your number ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        System.out.println("Your number is " + (isPrime ? "Prime" : "Non Prime"));
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) return false;        }
        return true;
    }
}
