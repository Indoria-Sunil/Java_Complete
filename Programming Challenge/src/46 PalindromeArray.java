class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome array checker");
        int[] arr = ArrayUtility.inputArray();
        boolean palindrome = isPalindrome(arr);
        if (palindrome) System.out.println("Array is Palindrome");
        else System.out.println("Array is not palindrome");
    }
    public static boolean isPalindrome(int[] arr)
    {
        int i = 0;
        while (i < arr.length / 2)
        {
            if (arr[i] != arr[(arr.length-1)-i]) return false;
            i++;
        }
        return true;
    }
}
