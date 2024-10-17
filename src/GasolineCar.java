class GasolineCar extends Car implements AutomaticTransmission {
    private int fuelTankCapacity;
    private String transmission;
    boolean isStarted = false;

    public GasolineCar(String brand, String model, String suspension, String drive, int year, boolean isAirbag, boolean isABS, int power,  int fuelTankCapacity, String transmission) {
        super(brand, model, suspension, drive, year, isAirbag, isABS,power);
        this.fuelTankCapacity = fuelTankCapacity;
        this.transmission = transmission;
        totalCars++;
    }

    @Override
    public void startEngine() {
        if(year > 2010){
            System.out.println("Двигатель завелся");
        }
        else {
            if (Math.random() < 0.5)
                System.out.println("Двигатель не завелся");
            else {
                isStarted = true;
                System.out.println("Двигатель завелся");
            }
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель остановлен");
    }

    @Override
    public void shiftUp() {
        System.out.println("Повышается передача");
    }

    @Override
    public void shiftDown() {
        System.out.println("Понижается передача");
    }

}