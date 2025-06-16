import java.util.Scanner;

class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing nth fibonacci number.");
        System.out.print("Pls enter number: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
//        System.out.println("The " + num + " number of the fibonacci is: " + fibonacciSeries(num));
    }

    public static int fibonacciSeries(int num) {
        if (num <= 1) return num;
        return fibonacciSeries(num - 1) + fibonacciSeries(num - 2);
    }
}
