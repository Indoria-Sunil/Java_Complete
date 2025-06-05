class SumAvg2D {
    public static void main(String[] args) {
        System.out.println("Welcome to find Sum and Average of 2D array");
        int[][] arr = ArrayUtility.input2DArray();
        long sum = findingSum(arr);
        double avg = findingAvg(arr, sum);
        System.out.println("The sum of the Array is: " + sum + " and the average is: " + avg);
    }

    public static long findingSum(int[][] arr)
    {
        long sum = 0;
        int i = 0;
        while (i < arr.length)
        {
            int j = 0;
            while (j < arr[i].length)
            {
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double findingAvg(int[][] arr, long sum)
    {
        if (arr.length == 0) return 0;
        double avg = (double) sum / (arr.length * arr[0].length);
        return avg;
    }
}
