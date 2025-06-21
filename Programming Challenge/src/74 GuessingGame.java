import java.util.Scanner;

class GuessingGame {
    int random;
    GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    /***
     *
     * @param guessNumber
     * @return
     */
    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        System.out.println("Welcome to the guessing Game. Guess the number between 1-100");
        int guess;
        int result;
        do {
            System.out.println("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result == 0) System.out.println("Congrats!");
            else if (result < 0) {
                System.out.println("Pls guess bigger number.");
            }
            else System.out.println("Pls guess smaller number.");
        }while (result != 0);

    }
}
