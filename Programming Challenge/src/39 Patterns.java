import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number of rows: ");
        int rows = input.nextInt();
        System.out.println("Here is Right Half Pyramid");
        printingRightHalfPyramid(rows);
        System.out.println("Here is Right Half Reverse Pyramid");
        printReverseHalfPyramid(rows);
        System.out.println("Here is Left Half Pyramid");
        printLeftHalfPyramid(rows);
    }

    public static void printLeftHalfPyramid(int rows)
    {
        int i = 1;
        while(i <= rows)
        {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void printReverseHalfPyramid(int rows)
    {
        int i = 0;
        while (i < rows)
        {
            for (int j = 0; j < rows - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }

    public static void printingRightHalfPyramid(int rows)
    {
        int i = 1;
        while(i <= rows)
        {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
        System.out.println();
    }
}
