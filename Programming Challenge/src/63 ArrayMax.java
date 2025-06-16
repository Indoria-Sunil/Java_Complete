class ArrayMax {
    public static void main(String[] args) {
        System.out.println("Welcome to finding Maximum in Array");
        int[] arr = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) max= num;
        }
        System.out.println("Maximum number is: " + max);
    }
}
