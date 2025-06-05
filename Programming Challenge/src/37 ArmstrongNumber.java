import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Armstrong Number.");
        System.out.print("Pls enter the number: ");
        int num = input.nextInt();
        boolean arm = checkingArmstrong(num);
        if (arm) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }

    public static boolean checkingArmstrong(int num)
    {
        int reverse = reversingDigits(num);
        if (reverse == num) return true;
        return false;
    }

    public static int reversingDigits(int num)
    {
        int ans = 0;
        while(num > 0 )
        {
            int digit = num % 10;
            ans += digit * digit * digit;
            num /= 10;
        }
        return ans;
    }
}
