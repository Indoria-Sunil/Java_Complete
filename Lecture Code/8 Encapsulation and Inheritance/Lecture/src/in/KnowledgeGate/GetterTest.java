package in.KnowledgeGate;

import in.getterSetter.Car;
import org.w3c.dom.ls.LSOutput;

public class GetterTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Maruti", 3, 100);
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }

}
