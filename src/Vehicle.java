public class Vehicle {
    String model, color, matricula, tipus;
    boolean pintura, segur;
    int any;
    //CONSTRUCTORS
    //Constructor sense paràmetres amb dos atributs inicialitzats
    public Vehicle() {//Constructor sense paràmetres.
    }
    //Constructor amb paràmetres
    public Vehicle(boolean pintura, boolean segur){
        this.pintura = pintura;  //Pintura true: metàlica. Pintura false: No metàlica.
        this.segur = segur;  //Segur true: tot cobert. Segur false: a tercers.
    }
    public Vehicle(String model, String color, String matricula, String tipus, int any){
        this(true, false); //IMPORTANT: utilitzem el mètode amb dos paràmetres que hem creat sense inicialitzarlos i els inicialitzem aquí.
        this.model = model;
        this.color = color;
        this.matricula = matricula;
        this.tipus = tipus;
        this.any = any;
    }
    public Vehicle(String model, String color, Boolean pintura, String matricula, String tipus, Boolean segur, int any){
        this.pintura = pintura;
        this.segur = segur;
        this.model = model;
        this.color = color;
        this.matricula = matricula;
        this.tipus = tipus;
        this.any = any;
    }

    //MÈTODES (NO CONSTRUCTORS)
    public void mostrarInfo(){
        System.out.println("Model: " +  model + "\nColor: " + color);
        if (pintura == true) {
            System.out.println("Pintura: Metalizada");
        } else {
            System.out.println("Pintura: Mate");
        }
        System.out.println("Matricula: " + matricula + "\nTipus: " + tipus + "\nAny: " + any);
        if (segur == true) {
            System.out.println("Segur: Cobertura total");
        } else {
            System.out.println("Segur: a tercers");
        }
    }
   //PROGRAMA (MAIN)
   public static void main(String[] args){
        Vehicle cotxe1 = new Vehicle(); //Al ser sin parámetros solo se inicializan los datos que hemos puesto dentro del metodo (pintura y segur).
        Vehicle cotxe2 = new Vehicle("Corsa", "Blau", "7664KJH", "utilitari", 2020);

        //Cridem al métode mostrarInfo()
       cotxe1.mostrarInfo(); //Com nomes hem inicialitzat la pintura i el segur la resta d'atributs apareixen amb els valors per defecte de Java, null en els String i 0 en int.
       cotxe2.mostrarInfo(); //Aquí com no hem inicialitzat ni la pintura ni el segur ixen amb valors per defecte de Java, false en els boolean.
   }
}
