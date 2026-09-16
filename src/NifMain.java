import java.util.Scanner;

public class NifMain {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int num;

        System.out.println("Introdueix el teu número de DNI (sense lletra).");
        num = lector.nextInt();

        Nif myNif = new Nif(num);

        System.out.println("System.out.println(myNif): ----> " + myNif); //Output: Nif@5acf9800 (puntero?)

        System.out.print("myNif.numero(): ----> ");
        myNif.numero();
        myNif.calcularLletra(num); //No imprimeix res en pantalla.
        System.out.print("myNif.lletra(): ----> ");
        myNif.lletra();
        System.out.print("myNif.nifComplet(): ----> ");
        myNif.nifComplet();


    }
}
