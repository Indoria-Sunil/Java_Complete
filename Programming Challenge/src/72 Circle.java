import java.util.Scanner;

class Circle {
    double radiusInMM;

    Circle(double radiusInMM) {
        this.radiusInMM = radiusInMM;
    }

    double getCircumference() {
        return 2 * radiusInMM * Math.PI;
    }
    double getArea() {
        return  Math.PI * Math.pow(radiusInMM, 2);
    }

    @Override
    public String toString() {
        return "Circle { " +
                "radiusInMM = " + radiusInMM +
                ", Circumference = " + getCircumference() +
                ", Area = " + getArea() +
                '}';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of circle");
        System.out.print("Please enter radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }
}
