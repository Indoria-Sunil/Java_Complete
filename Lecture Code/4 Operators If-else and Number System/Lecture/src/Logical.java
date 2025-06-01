import java.awt.*;
import java.util.Scanner;

class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you a female ? ");
        boolean isFemale = input.nextBoolean();

        if (age < 5)
        {
            System.out.println("You got 75% discount!");
        }
        else if (isFemale) {
            System.out.println("You got 50% discount!");
        }
        else if (age > 60 && !isFemale) {
            System.out.println("You got 50% discount");
        }
        else
        {
            System.out.println("You got no discount :/");
        }
    }
}
