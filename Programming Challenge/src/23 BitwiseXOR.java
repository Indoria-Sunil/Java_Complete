import java.util.Scanner;

class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise XOR");
        System.out.println("Enter first Number: ");
        int first = input.nextInt();
        System.out.println("Enter second Number: ");
        int second = input.nextInt();
        int result = first ^ second;
        System.out.println("Result is " + result);
    }
}
