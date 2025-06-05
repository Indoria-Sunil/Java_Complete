import java.util.Scanner;

class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum And Average");
        int[] numsArray = ArrayUtility.inputArray();
        long sum = sum(numsArray);
        double avg = average(numsArray, sum);
        System.out.println("Sum of the Array is: " + sum);
        System.out.print("Average of the Array is: " + avg);
    }

    public static long sum(int[] nums)
    {
        long sum = 0;
        int i = 0;
        while (i < nums.length)
        {
            sum += nums[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] nums, long sum)
    {
        return (double) sum / nums.length;
    }
}
