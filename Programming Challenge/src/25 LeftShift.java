import java.util.Scanner;

class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Left Shift");
        System.out.println("Enter Number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Result is " + result);
    }
}
