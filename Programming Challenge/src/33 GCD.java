import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GCD finder");
        System.out.print("Pls enter your first number: ");
        int first = input.nextInt();
        System.out.print("Pls enter your second number: ");
        int second = input.nextInt();
        int ans = GCDFinder(first, second);
        System.out.println("The GCD for the above two numbers is: " + ans);
    }

    public static int GCDFinder(int first, int second)
    {
        int ans = 1;
        int i = 2;
        int min = smaller(first, second);
        while(i <= min)
        {
            if (first % i == 0 && second % i == 0) ans = i;
            i++;
        }
        return ans;
    }

    public static int smaller(int first, int second)
    {
        return first <= second ? first : second;
    }
}
