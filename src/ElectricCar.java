class ElectricCar extends Car implements Hybrid {
    private int batteryCapacity;
    private int batteryLevel;
    private DrivingMode drivingMode;
    private int maxSpeed;
    private double regenerativeBrakeIntensity;
    private double accelerationFactor;

    public ElectricCar(String brand, String model, String suspension, String drive, int year, boolean isAirbag, boolean isABS, int power, int batteryCapacity) {
        super(brand, model, suspension, drive, year, isAirbag, isABS, power);
        this.batteryCapacity = batteryCapacity;
        totalCars++;
    }

    public void chargeBattery(int amount) {
        batteryLevel += amount;
        if (batteryLevel > batteryCapacity) {
            batteryLevel = batteryCapacity;
        }
        System.out.println("Заряд батареи: " + batteryLevel + "%");
    }

    public void regenerativeBrake() {
        System.out.println("Запуск регенеративного торможения");
        batteryLevel += 5; // Например, увеличиваем заряд на 5%
        System.out.println("Заряд батареи увеличен за счет регенеративного торможения");
    }

    public void setDrivingMode(DrivingMode mode) {
        drivingMode = mode;
        switch (mode) {
            case ECO:
                accelerationFactor = 0.8;
                maxSpeed = 120;
                regenerativeBrakeIntensity = 0.9;
                break;
            case NORMAL:
                accelerationFactor = 1.0;
                maxSpeed = 180;
                regenerativeBrakeIntensity = 0.5;
                break;
            case SPORT:
                accelerationFactor = 1.2;
                maxSpeed = 220;
                regenerativeBrakeIntensity = 0.2;
                break;
        }
        System.out.println("Режим вождения установлен: " + mode);
    }

    public double calculateRange() {
        double efficiency = 25;
        double range = (int) (batteryLevel / efficiency * 100);

        return range;
    }


    @Override
    public void startEngine() {
        System.out.println("Электродвигатели запущены");
    }

    @Override
    public void stopEngine() {
        System.out.println("Электродвигатели остановлены");
    }

    @Override
    public void switchToElectricMode() {
        System.out.println("Режим электромобиля включен");
    }

    @Override
    public void switchToGasolineMode() {
        System.out.println("Бензинового мотора нет");
    }
}