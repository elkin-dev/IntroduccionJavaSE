/*
Ejercicio 1.
Ponte creativo y preséntanos a tu familia con variables, utiliza todos los tipos y cantidad de variables que puedas, no olvides las convenciones de nombres Camel Case.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        String myName = "Elkin";
        String [] fathers = {"Judith", "Enrique"};
        String [] brothers = {"Patricia", "Luz Daris", "Esteban", "Robert", "Jose Luis", "Deiby"};

        System.out.println("Hello here I present my family");
        System.out.println("My name is, " + myName);

        System.out.println("My parents are: ");
        for(int i = 0; i<fathers.length; i++){
            System.out.println(fathers[i]);
        }
        System.out.println("My brothers are: ");
        for(int i = 0; i<brothers.length; i++){
            System.out.println(brothers[i]);
        }

    }
}
