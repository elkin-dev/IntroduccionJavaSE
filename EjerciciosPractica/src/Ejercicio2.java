/*
Ejercicio 2.
Usando los dos tipos de casting que aprendiste (implícito y explícito), resuelve los siguientes casteos indicando qué tipo es y si se está calculando
estimación o exactitud.

char c = ‘z’; conviertelo a int
int i = 250; conviertelo a long y luego de long a short
double d = 301.067; conviertelo a long
int i = 100; súmale 5000.66 y conviertelo a float
int i = 737; multiplícalo por 100 y conviertelo a byte
double d = 298.638; divídelo entre 25 y conviertelo a long
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        //Casteo auctomatico
        char c = 'Z';
        int iC = c;


       int i = 100;
       long iL = i; //Casteo auctomatico
       short iLS = (short) iL; // Casteo Forzado

        double d = 301.067;
        long dL = (long) d; // Casteo Forzado


        int a = 100;
        double b = 5000.66;
        double rfs = a + b;
        System.out.println((float) rfs);

        int e = 737;
        int o = 100;
        int rf = e * o;
        System.out.println((byte) rf);

        double n = 298.638;
        int n2 = 25;
        System.out.println((long) n / n2);


    }


}
