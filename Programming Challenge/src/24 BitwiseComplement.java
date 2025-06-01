import java.util.Scanner;

class BitwiseComplement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Compliment / Not OR");
        System.out.println("Enter first Number: ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Result is " + result);
    }
}
