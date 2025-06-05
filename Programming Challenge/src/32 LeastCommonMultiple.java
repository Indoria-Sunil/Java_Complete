import java.util.Scanner;

class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM finder");
        System.out.print("Pls enter your first number: ");
        int first = input.nextInt();
        System.out.print("Pls enter your second number: ");
        int second = input.nextInt();
        int ans = LCMFinder(first, second);
        System.out.println("The LCM for the above two numbers is: " + ans);
    }

    public static int LCMFinder(int first, int second)
    {
        int i = 1;
        while (true)
        {
            int factor = first * i;
            if (factor % second == 0) return factor;
            i++;
        }
    }
}
