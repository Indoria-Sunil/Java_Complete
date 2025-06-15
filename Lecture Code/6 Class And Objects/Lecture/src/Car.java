public class Car {
    static int noOfCarSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLitres;
    int noOfSeats;
    static {
        noOfCarSold = 0;
        System.out.println("I'm in static block");
    }
    {
        noOfCarSold++;
        System.out.println("I'm in init block.");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSeats = 5;
    }
//    Car() {
//        noOfWheels = 4;
//        color = "Black";
//        maxSpeed = 150;
//        currentFuelInLitres = 2;
//        noOfSeats = 5;
//    }

    Car() {
        this("Black");
    }


    public Car start()
    {
        if (currentFuelInLitres == 0) {
            int pop = 5;
            System.out.println("Car is out of fuel :/");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserved mode, pls refuel");
        }
        else {
            System.out.println("Car is started.....");
        }
        return this;
    }

    public void drive() {
        System.out.println("Car is driving");
        currentFuelInLitres--;
    }

    public void addFuel(float currentFuelInLitres) {
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelInLevel() {
        return currentFuelInLitres;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println();
    }
}
