public class Arrays {
    public static void main(String[] args) {
        String[] AndroidVersions = new String[17];
        int days[] = new int[7];
        String[][] cities = new String[4][2];//4 * 2 = 8
        /*
        * +--------------------------+
        * |Country   | City          |
        * +--------------------------+
        * |Mexico    | CDMX          |
        * |Mexico    | Guadalajara   |
        * |Colombia  | Bogota        |
        * |Colombia  | Medellin      |
        * +--------------------------+
        * */
        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        AndroidVersions [0] = "Apple Pie";
        AndroidVersions [1] = "Banana Bread";
        AndroidVersions [2] = "Cupcake";
        AndroidVersions [3] = "Donut";

        /*
        for (int i = 0; i <= AndroidVersions.length - 1; i++){
            System.out.println(AndroidVersions [i]);
        }
        */

        //Foreach
        for (String AndroidVersion : AndroidVersions){
            System.out.println(AndroidVersion);
        }
/*
        System.out.println(AndroidVersions[0]);
        System.out.println(AndroidVersions[1]);
        System.out.println(AndroidVersions[2]);
        System.out.println(AndroidVersions[3]);
*/
        System.out.println();
        System.out.println();

        cities [0] [0]= "Colombia";
        cities [0] [1]= "Medellin";
        cities [1] [0]= "Colombia";
        cities [1] [1]= "Bogota";
        cities [2] [0]= "Mexico";
        cities [2] [1]= "Guadalajara";
        cities [3] [0]= "Mexico";
        cities [3] [1]= "CDMX";
/*
        System.out.println(cities [0] [0]);
        System.out.println(cities [0] [1]);
        System.out.println(cities [1] [0]);
        System.out.println(cities [1] [1]);
        System.out.println(cities [2] [0]);
        System.out.println(cities [2] [1]);
        System.out.println(cities [3] [0]);
        System.out.println(cities [3] [1]);
*/

/*
        for (int i = 0; i < cities.length; i++){
            for ( int j = 0; j < cities[i].length; j++){
                System.out.println(cities[i][j]);
            }
        }
        */

        //Foreach
        for (String[] pair: cities ) {
            for(String name : pair){
                System.out.println(name);
            }
        }


        System.out.println();
        System.out.println();

        String  animals [][][][]= new String [2][3][2][2];
        animals [1][0][0][1] = "Monkey";
        //System.out.println(animals [1][0][0][1]);

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }

                }

            }
        }

        byte i = 1;
        byte j = 1;
        byte k = i+j;
    }
}
