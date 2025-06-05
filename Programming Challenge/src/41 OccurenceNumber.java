import java.util.Scanner;

class OccurenceNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Occurences.");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Now enter number you find: ");
        int num = input.nextInt();
        int occurences = findingOccurences(arr, num);
        System.out.println("Total occurences of number " + num + " is: " + occurences);

    }

    public static int findingOccurences(int[] arr, int num)
    {
        int count = 0;
        int i = 0;
        while (i < arr.length)
        {
            if (arr[i] == num) count++;
            i++;
        }
        return count;
    }
}
