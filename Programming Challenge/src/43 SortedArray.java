class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to check Array for sorted.");
        int[] arr = ArrayUtility.inputArray();
        boolean inc = isIncreasing(arr);
        boolean dec = isDecreasing(arr);
        if (inc || dec) System.out.println("Array is sorted !");
        else System.out.println("Array is  not sorted :/");
    }

    public static boolean isIncreasing(int[] arr)
    {
        int i = 0;
        while (i < arr.length - 1)
        {
            if (arr[i+1] < arr[i]) return false;
            i++;
        }
        System.out.println("Array is increasing");
        return true;
    }
    public static boolean isDecreasing(int[] arr)
    {
        int i = 0;
        while (i < arr.length - 1)
        {
            if (arr[i+1] > arr[i]) return false;
            i++;
        }
        System.out.println("Array is Decreasing");
        return true;
    }

}
