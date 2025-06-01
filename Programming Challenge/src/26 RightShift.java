import java.util.Scanner;

class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Right Shift");
        System.out.println("Enter Number: ");
        int num = input.nextInt();

        int result = num >> 1;
        System.out.println("Result is " + result);
    }
}
