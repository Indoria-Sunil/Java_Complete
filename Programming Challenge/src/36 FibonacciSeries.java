import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series.");
        System.out.print("Pls enter the number: ");
        int num = input.nextInt();
        System.out.println("Here is the fibonacci series... ");
        fibonacciSeries(num);
    }
    public static void fibonacciSeries(int num)
    {
        if (num < 0) return;
        System.out.println("0 ");
        if (num == 0) return;
        System.out.println("1 ");

        int first = 0;
        int second = 1;
        while(num > 2)
        {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
            num--;
        }
    }
}
