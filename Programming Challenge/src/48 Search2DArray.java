import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D Array search");
        int[][] arr = ArrayUtility.input2DArray();
        System.out.print("pls enter the number you want to search: ");
        int number = input.nextInt();
        if (isPresent(arr,number)) System.out.println("Number is Present!");
        else System.out.println("Number is not Present :/");

    }

    public static boolean isPresent(int[][] arr, int number)
    {
        int i = 0;
        while (i < arr.length)
        {
            int j = 0;
            while (j < arr[i].length)
            {
                if (arr[i][j] == number) return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
