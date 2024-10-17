abstract class Car {
    protected String brand;
    protected String model;
    protected String suspension;
    protected String drive; //привод
    protected int year;
    protected boolean isAirbag;
    protected boolean isABS;
    protected int power;
    protected String transmission;


    public Car(String brand, String model, String suspension, String drive, int year, boolean isAirbag, boolean isABS, int power) {
        this.brand = brand;
        this.model = model;
        this.suspension = suspension;
        this.drive = drive;
        this.year = year;
        this.isAirbag = isAirbag;
        this.isABS = isABS;
        this.power = power;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void turnOnLowBeam(){
        System.out.println("Ближний свет включен");
    }
    public void turnOffLowBeam(){
        System.out.println("Ближний свет выключен");
    }

    public void turnOnHighBeam(){
        System.out.println("Дальний свет включен");
    }
    public void turnOffHighBeam(){
        System.out.println("Дальний свет выключен");
    }

    public static int totalCars = 0; // Статическое поле для подсчета всех автомобилей

    public static void printTotalCars() {
        System.out.println("Всего машин: " + totalCars);
    }
}
