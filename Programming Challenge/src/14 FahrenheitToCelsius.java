import java.util.Scanner;

class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        float fah = input.nextFloat();

        float cel = (fah - 32) * 5 / 9;
        System.out.println("Temperature in Celsius is: " + cel);

    }
}
