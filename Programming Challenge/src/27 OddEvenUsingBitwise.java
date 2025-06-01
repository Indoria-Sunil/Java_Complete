import java.util.Scanner;

class OddEvenUsingBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Number: ");
        int num = input.nextInt();

        if((num & 1) == 1)
        {
            System.out.println("Number is Odd.");
        }
        else
        {
            System.out.println("Number is Even");
        }
    }
}
