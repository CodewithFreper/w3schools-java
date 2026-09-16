public class CarMain {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.fullThrottle();
        myCar.speed(200);
        myCar.mostrarInfo();
        System.out.println("-----*-----");

        Car myCar2 = new Car("Focus", "Blanc", true, "8976KJS", "Familiar", false, 2018);
        System.out.println("Dades de myCar2: ");
        myCar2.speed(180);
        myCar2.mostrarInfo();
        System.out.println("-----*-----");
    }

}
