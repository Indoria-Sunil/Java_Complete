import java.util.Scanner;

class AgeClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to age Calculator.");
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age >= 65)
        {
            System.out.println("Senior Citizen");
        } else if (age >= 20) {
            System.out.println("Adult");
        }else if(age >= 13)
        {
            System.out.println("Teenager");
        }
        else {
            System.out.println("Child");
        }
    }
}
