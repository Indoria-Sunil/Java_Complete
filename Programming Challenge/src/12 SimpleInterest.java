import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Simple Interest Calculator");
        System.out.println("Please enter your principle: ");
        int principle = input.nextInt();
        System.out.println("Now, please enter rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("Please enter time period in years also: ");
        float time = input.nextFloat();

        float interest = (principle * rate * time) / 100;
        System.out.println("Your SI is: " + interest);
    }
}
