public class Assignatures {
    private String nom;
    private int codi, curs;

    //Cosntructor amb valors inicials
    public Assignatures(){
        nom = "Matemàtiques";
        codi = 1017;
        curs = 1;
    }

    //Getter
    public String getNom(){
        return nom;
    }

    public int getCodi(){
        return codi;
    }

    public int getCurs(){
        return curs;
    }
}

