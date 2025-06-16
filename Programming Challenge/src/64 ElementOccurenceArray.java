import java.util.Scanner;

class ElementOccurenceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find occurrence of element ijn Array");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Now, enter the element to be searched ");
        int num = input.nextInt();
        int occ = countOccurence(arr, num);
        System.out.println("Your element was found " + occ + " times");

    }

    public static int countOccurence(int[] arr, int element) {
        int occ = 0;
        for (int num : arr)
        {
            if (num == element) occ++;
        }
        return occ;
    }
}
