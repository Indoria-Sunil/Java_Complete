import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {3,6,8,87,65,4,68,23,9,98,34};
        System.out.print("Enter the number to be searched: ");
        int num = input.nextInt();
        if (isPresent(arr, num)) System.out.println("Your number found!");
        else System.out.println("Your number not present  :/");

    }

    public static boolean isPresent(int[] arr, int num)
    {
        for (int j : arr) {
            if (j == num) return true;
        }
        return false;
    }
}
