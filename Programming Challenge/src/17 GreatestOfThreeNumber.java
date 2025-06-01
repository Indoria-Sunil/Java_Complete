import java.util.Scanner;

class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Enter the second number: ");
        int second = input.nextInt();
        System.out.println("Enter the third number: ");
        int third = input.nextInt();

        if (first >= second && first >= third)
        {
            System.out.println(first +" is Greatest.");
        } else if (second >= third) {
            System.out.println(second + " is Greatest.");
        }
        else
        {
            System.out.println(third + " is Greatest.");
        }
    }
}
