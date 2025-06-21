class CarFinal {
    final int noWheels;
    final String model;
    final String engineInLitres;

    public CarFinal(int noWheels, String model, String engineInLitres) {
        this.noWheels = noWheels;
        this.model = model;
        this.engineInLitres = engineInLitres;
//        this.noWheels++;  // This will give error
    }
}
