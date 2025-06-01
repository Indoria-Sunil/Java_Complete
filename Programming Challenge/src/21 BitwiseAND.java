import java.util.Scanner;

class BitwiseAND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise operator.");
        System.out.println("Pls enter first number: ");
        int first = input.nextInt();
        System.out.println("Enter second number: ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("result is " + result);
    }
}
