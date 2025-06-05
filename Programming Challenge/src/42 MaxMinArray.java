class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Welcopme to Max and Min");
        int[] arr = ArrayUtility.inputArray();
        int max = max(arr);
        int min = min(arr);
        System.out.println("Min of the Array is: " + min + " and Max is: " + max);
    }

    public static int max(int[] arr)
    {
        int i = 0;
        int max = Integer.MIN_VALUE;
        while (i < arr.length)
        {
            if (arr[i] > max) max = arr[i];
            i++;
        }
        return max;
    }

    public static int min(int[] arr)
    {
        int i = 0;
        int min = Integer.MAX_VALUE;
        while (i < arr.length)
        {
            if (arr[i] < min) min = arr[i];
            i++;
        }
        return min;
    }
}
