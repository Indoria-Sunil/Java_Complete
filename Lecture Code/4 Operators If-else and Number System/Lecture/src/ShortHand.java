import java.util.Scanner;

public class ShortHand {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        a += x1;
        System.out.println(a);
        int x2 = input.nextInt();
        a += x2;
        System.out.println(x2);
        int x3 = input.nextInt();
        a += x3;
        System.out.println(a);
    }
}
