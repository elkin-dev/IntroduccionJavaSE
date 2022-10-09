import javax.swing.*;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        //Area de un circulo
        //PI * r2
        circleArea(y);


        //Area de una esfera
        //4*PI*r2!
        areaEsfera(y);


        //Volumen de una esfera
        //(4/3)*PI * r3
        volumenEsfera(y);


        System.out.println("PESOS A DOLARES: " + coverToDolar(1000, "MXN"));
        System.out.println("PESOS A DOLARES: " + coverToDolar(1000, "COP"));

    }

    public static double circleArea(double areaCirculo){
        return Math.PI * Math.pow(areaCirculo,2);
    }
    public static double areaEsfera(double areaEsfera){
        return (4 * Math.PI * Math.pow(areaEsfera, 2));
    }

    public static double volumenEsfera(double volumenEsfera){
        return ((4/3) * Math.PI * Math.pow(volumenEsfera, 3));
    }

    /**
     * Descripción: Función que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static  double coverToDolar(double quantity, String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
