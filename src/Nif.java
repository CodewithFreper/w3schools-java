public class Nif {
    //Atributs
    int num;
    String lletra;

    //Constructor (public + nomDeLaClasse --> NO VOID)
    public Nif(int num){
        this.num = num;
    }

    //Mètode per a mostrar el número
    public void numero(){
        System.out.println(num);
    }
    //Mètode per calcular la lletra
    public void calcularLletra(int num){
        int numDeLletra;
        String[] lletres ={"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J","Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        numDeLletra = num % 23;

        /*La meua manía de complicar-ho tot...
        for(int i=1; i<lletres.length+1; i++){  A MÉS A MÉS, IMPORTANT, ELS VALORS DEL RESTO DE LA DIVISIÓ VAN DE 0 A 22. NO DE 1 A 23.
            if (i == numDeLletra){              NO CALDRIA SUMAR-LI 1.
                lletra = lletres[numDeLletra];
            }
        }
        /////////////////////////////////////*/

        lletra = lletres[numDeLletra];

    }

    public void lletra(){
        System.out.println(lletra);
    }

    public void nifComplet(){
        System.out.println(num + lletra); //No posa el número i la lletra sinó que suma al número. ??????
        numero();
        lletra(); //Així m'ho posa baix.

        System.out.println(num + "-" + lletra);

    }
}
