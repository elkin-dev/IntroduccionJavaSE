public class DataTypes {
    public static void main(String[] args) {

        //Recibe como maximo 10 digitos
        int n = 1234567890;

        //Tener presente colocar la "L" al final del numero para que lo reconozca como long
        long nL = 12345678901L;

        //Se utiliza para calculos matematicos que se quiera tener mayor precion
        double nD = 123.5484845848;

        //Tener presente colocar la "f" al final del numero para que lo reconozca como float
        float nF = 123.5484845848F;

        //Recibe un solo caracter
        char c = 'h';


        //DESDE LA VERSION JAVA 11 O SUPERIOR SE PUEDEN DECLARAR LAS VARIABLES DE ESTA FORMA
        var salary = 1000; // int
        //Pension 3%
        var pension = salary*0.03; //double
        var totalSalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Elkin Jaramillo";
        System.out.println("EMPLOYEE: " + employeeName + " SALARY: " + totalSalary);
    }
}
