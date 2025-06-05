class ArrayReversal {
    public static void main(String[] args) {
        System.out.println("Welcome to Array reversal");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Array before Reversal is: ");
        ArrayUtility.displayArray(arr);
        reverseArray(arr);
        System.out.println("Array after Reversal is: ");
        ArrayUtility.displayArray(arr);
    }

    public static void reverseArray(int[] arr)
    {
        int i = 0;
        while (i < arr.length / 2)
        {
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
