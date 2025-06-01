import java.util.Scanner;

public class Return {
    public static void main(String[] args) {

        System.out.println("Welcome to Calculator");
        int first = readNumber();
        int second = readNumber();
        int sum = summingUp(first, second);
        System.out.println("The Sum is: " + sum);
    }

    public static int readNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Pls enter the number: ");
        int number = input.nextInt();
        return number;
    }

    public static int summingUp(int first, int second)
    {
        return first + second;
    }
}
