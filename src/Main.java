public class Main {
    public static void main(String[] args) {
        GasolineCar gasolineCar = new GasolineCar("Toyota", "Corolla Ceres","пружинная","передний",1993, true, true, 160,  50, "автоматическая");
        ElectricCar electricCar = new ElectricCar("Tesla", "Y", "пружинная", "полный", 2020, true, true, 345, 451);

        gasolineCar.startEngine();
        gasolineCar.turnOnLowBeam();

        System.out.println("Электромобиль: ");
        electricCar.chargeBattery(100);
        electricCar.startEngine();
        electricCar.setDrivingMode(DrivingMode.NORMAL);
        System.out.println("Тесла проедет " + electricCar.calculateRange());

        electricCar.switchToElectricMode();
        electricCar.switchToGasolineMode();

        Car.printTotalCars();
    }
}