class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        //Car car = new Car();
        //car.license = "AMQ123";
        //car.driver = "Andres Herrera";
        car.passengenger = 4;
        //System.out.println("Car License: " + car.license);
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ASD456"));
        //Car car2 = new Car();
        //car2.license = "QWE567";
        //car2.driver = "Andrea Herrera";
        car2.passengenger = 3;
        //System.out.println("Car License: " + car2.license);
        car2.printDataCar();
    }
}