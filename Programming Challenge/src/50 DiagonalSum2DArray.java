class DiagonalSum2DArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Diagonal Sum of 2D array");
        int[][] arr = ArrayUtility.input2DArray();
        long sum = findingDiagonalSum(arr);
        System.out.println("Sum of diagonals is: " + sum);
    }

    public static long findingDiagonalSum(int[][] arr)
    {
        long leftSum = sumOfLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);
        long sum = leftSum + rightSum;
        if (arr.length % 2 != 0)
        {
            sum -= arr[arr.length/2][arr.length/2];
        }

        return sum;
    }
    public static long sumOfLeftDiagonal(int[][] arr)
    {
        long sum = 0;
        int i = 0;
        while (i < arr.length)
        {
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int[][] arr)
    {
        long sum = 0;
        int i = 0;
        while (i < arr.length)
        {
            int col = arr.length - 1 - i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }
}
