public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver me = new Driver("John", 20);

        myCar.startCar(me);
        myCar.accelerate();
        myCar.changeSpeed(80, me);
        myCar.slowing();
        myCar.changeSpeed(30, me);
        myCar.stopCar(me);
        System.out.println("fini");
    }
}
