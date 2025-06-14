import java.util.Scanner;

class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator\n");
        System.out.print("Please enter your first number ");
        int num1 = input.nextInt();
        System.out.print("Now, enter your second number ");
        int num2 = input.nextInt();
        System.out.print("Now, Enter the operation: ");
        String operation = input.next();


        int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };
        System.out.print("Your answer is " + result);
    }
}
