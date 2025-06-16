import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game\n");
        int num = 5;
        int guess;

        do {
            System.out.print("Pls guess the number between 0-10 ");
            guess = input.nextInt();
        }while (num != guess);
        System.out.println("You guessed correct number");
    }
}
