public class Car extends Vehicle {
    //CONSTRUCTOR
    public Car(){
    }
    public Car(boolean pintura, boolean segur){
        super(pintura, segur);
    }

    public Car(String model, String color, Boolean pintura, String matricula, String tipus, Boolean segur, int any){
        super(model, color, pintura, matricula, tipus, segur, any);
    }
    //Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    //Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}
