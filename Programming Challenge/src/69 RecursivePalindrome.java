import java.util.Scanner;

class RecursivePalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Palindrome checker");
        System.out.print("Enter the string to be checked ");
        String str = input.next();
        System.out.println("Your string is " + (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length()-1)) return false;
        String newStr = str.substring(1, str.length() - 1);
        return isPalindrome(newStr);

    }
}
