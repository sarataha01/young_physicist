package tester;

public class phy {
    /*public static int[][] a1 = { {3, -1, 7}, {-5, 2, -4}, {2, -1, -3} };
    public static int[][] a2 = { {4, 1, 7}, {-2, 4, -1}, {1, -5, -3} };
    public static void main(String[] args){
        equilibrium(a1);
        equilibrium(a2);
    }*/

    public static int equilibrium(int[][] a) {
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = a[i][j];
                b[j] += x;
            }
        }

        if (b[0] == 0 && b[1] == 0 && b[2] == 0) {
            System.out.println("In Equilibrium");
            return 1;
        }
        else {
            System.out.println("Not in Equilibrium");
            return -1;
        }
    }
}

