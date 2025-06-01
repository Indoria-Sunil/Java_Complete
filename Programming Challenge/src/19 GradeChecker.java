import java.util.Scanner;

class GradeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Grade checker.\n");
        System.out.println("Please enter your percentage: ");

        float percentage = input.nextFloat();
        if (percentage >= 90)
        {
            System.out.println("You've got 'A'!");
        } else if (percentage >= 75) {
            System.out.println("Good you have got 'B'!");
        }
        else if (percentage >= 60)
        {
            System.out.println("You;ve got 'C'! Work harder next time.");
        }
        else if (percentage >= 30)
        {
            System.out.println("You really need to work harder");
        }
        else
        {
            System.out.println("You are failed :/");
        }

    }
}
