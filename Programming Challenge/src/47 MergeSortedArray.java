class MergeSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging Sorted Array");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] arrNew = mergingArray(arr1, arr2);
        System.out.println("The new Merged and sorted array is: ");
        ArrayUtility.displayArray(arrNew);
    }

    public static int[] mergingArray(int[] arr1, int[] arr2)
    {
        int i = 0;
        int j = 0;
        int newSize = arr1.length + arr2.length;
        int[] resArr = new int[newSize];
        int k = 0;
        while (i < arr1.length || j < arr2.length)
        {
            if (j == arr2.length ||
                    (i < arr1.length && arr1[i] <= arr2[j]))
                resArr[k++] = arr1[i++];
            else resArr[k++] = arr2[j++];
        }
        return resArr;
    }
}
