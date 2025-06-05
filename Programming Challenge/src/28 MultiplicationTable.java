import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World!");
        System.out.print("Pls enter your number: ");
        int num = input.nextInt();
        printMultipliedTable(num);
    }

    public static void printMultipliedTable(int num)
    {
        int i = 1;
        while (i <= 10)
        {
            System.out.println(num + " * " + i + " = " + num*i);
            i++;
        }

    }
}
