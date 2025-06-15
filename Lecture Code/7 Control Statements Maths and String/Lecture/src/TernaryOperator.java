import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Please enter first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter second number: ");
        int second = input.nextInt();

//        int greater;
//        if (first > second) {
//            greater = first;
//        }
//        else{
//            greater = second;
//        }
        int greater = first > second ? first : second;
        System.out.println(greater + " is greater");
    }
}
