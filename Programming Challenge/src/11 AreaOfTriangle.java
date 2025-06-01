import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Area Calculator: ");
        System.out.println("please enter your base in cms: ");
        double base = input.nextDouble();
        System.out.println("Now, enter your perpendicular in cms: ");
        double perpendicular = input.nextDouble();
        double area = 0.5 * base * perpendicular;
        System.out.println("Area of triangle is: " + area + "cm*cm");
    }
}
