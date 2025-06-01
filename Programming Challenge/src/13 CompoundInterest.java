import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to compound interest calculator");
        System.out.println("Please enter your principle: ");
        int principle = input.nextInt();
        System.out.println("Now, please enter rate of interest: ");
        float rate = input.nextFloat();
        System.out.println("Please enter time period in years also: ");
        float time = input.nextFloat();

        double CI = principle * Math.pow((1 + rate/100), time);
        System.out.println("Your CI is Rs: " + CI);
    }
}
