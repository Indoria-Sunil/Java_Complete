import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number.");
        System.out.print("Pls enter the number: ");
        int num = input.nextInt();
        boolean palindrome = isPalindrome(num);
        if (palindrome) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    public static boolean isPalindrome(int num)
    {
        return num ==  reversingDigits(num);
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
