import java.util.Scanner;

class ReverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Reversing Digits.");
        System.out.print("Pls enter the number: ");
        int num = input.nextInt();
        int ans = reversingDigits(num);
        System.out.println("Reverse of the num is: " + ans);
    }

    public static int reversingDigits(int num)
    {
        int ans = 0;
        while(num > 0 )
        {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num /= 10;
        }
        return ans;
    }
}
