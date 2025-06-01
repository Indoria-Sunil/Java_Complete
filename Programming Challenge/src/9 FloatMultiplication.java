import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing float multiplication: ");
        System.out.println("please enter first decimal number: ");
        double first = input.nextDouble();
        System.out.println("Now, enter the second decimal number: ");
        double second = input.nextDouble();

        double miultiplication = first * second;
        System.out.println("Result is: " + miultiplication);
//        System.out.println("Result is: " + first + second);    Wrong way
        System.out.println("Result is: " + (first + second));
    }
}
