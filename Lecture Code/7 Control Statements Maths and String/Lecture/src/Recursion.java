import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Generator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long factI = findingFactorialIteratively(num);
        long factR = findingFactorialRecursively(num);
        System.out.println("Factorial of your number is: " + factI);
        System.out.println("Factorial of your number is: " + factR);

    }

    public static long findingFactorialIteratively(int num) {
        long res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }
    public static long findingFactorialRecursively(int num) {
        if (num == 1) return  1;
        return num * findingFactorialRecursively(num - 1);
    }
}
