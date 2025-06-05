import java.util.Scanner;

class DeletingFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to element deletion from Array");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter the element you want to delete: ");
        int num = input.nextInt();
        int[] newArr = deleteNumber(arr, num);
        ArrayUtility.displayArray(arr);
        System.out.println("Here is the new Array");
        ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] arr, int number)
    {
        int occurences = OccurenceNumber.findingOccurences(arr, number);
        if (occurences == 0) return arr;

        int newSize = arr.length - occurences;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i < arr.length)
        {
            if (arr[i] != number) newArr[j++] = arr[i];
            i++;
        }
        return newArr;
    }
}
