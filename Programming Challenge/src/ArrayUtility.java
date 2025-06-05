import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size)
        {
            System.out.print("Please enter element no. " + (i+1) + " :");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static int[][] input2DArray()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Please enter number of Columns: ");
        int cols = input.nextInt();
        int[][] nums = new int[rows][cols];
        int i = 0;
        while (i < rows)
        {
            int j = 0;
            while (j < cols)
            {
                System.out.print("Please enter element for row " + (i+1) + " , and column " + (j+1) + " :");
                nums[i][j] = input.nextInt();
                j++;

            }
            i++;
        }
        return nums;
    }

    public static void displayArray(int[] arr)
    {
        int i = 0;
        while (i < arr.length)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
