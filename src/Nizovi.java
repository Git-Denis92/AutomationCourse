public class Nizovi {

    public static void main(String[] args) {

        int a = 5;
        int mojNiz[] = new int[6]; // ---------> @uehkfhess
        mojNiz[0] = 15;
        mojNiz[1] = 20;
        mojNiz[5] = 50;

        for (int i = 0; i < mojNiz.length; i++) {
            System.out.println(mojNiz[i]);
        }

        int niz[] = new int[]{55,3,7,2,6,47}; // indexi krecu od 0 ---- mjesto u memoriji --> [I@75bd9247



        for (int i = 0; i < niz.length; i++){
            System.out.println(niz[i]);

        }


        String nizDanaUnedjelji [] = new String[]{"Pon","Uto","Sri","Cet","Pet","Sub","Ned"};

        int[][] niz2D = new int[][]{
                {1,2,5,7,5,2},
                {2,3,57},
                {3242,3342,392}
        };
            System.out.println(niz2D[2][2]);

            for (int i = 0; i < niz2D.length; i++) {
            for (int j =0; j < niz2D[i].length; j++) {
                System.out.println(niz2D[i][j]);
            }
            System.out.println();
        }

      }
}
