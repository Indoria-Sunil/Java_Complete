class positiveNumberSum {
    public static void main(String[] args) {
        System.out.println("Welcome to Adding positive numbers.");
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num : arr)
        {
            if (num < 0) continue;
            sum += num;
        }
        System.out.println("Sum of positive numbers is " + sum);
    }
}
