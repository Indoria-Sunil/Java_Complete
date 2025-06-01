import java.util.Scanner;

class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station\n\n");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Value of A is: "+ a);
        System.out.println("Value of B is: "+ b);
    }
}
