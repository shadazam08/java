package arrays_practice;

import java.util.Scanner;

public class Matrix_ZigZag_Traversal {
    public static int R, C;
    private static void diagonalOrder(int[][] arr){
        for (int k = 0; k < R; k++) {
            System.out.print(arr[k][0] + " ");
            int i = k - 1;
            int j = 1;
            while (isValid(i, j)){
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
            System.out.println("");
        }
        for (int k = 1; k < C; k++) {
            System.out.print(arr[R - 1][k] + " ");
            int i = R - 2;
            int j = k + 1;
            while (isValid(i, j)){
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
            System.out.println("");
        }
    }
    public static boolean isValid(int i, int j){
        if (i < 0 || i >= R || j >= C || j < 0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        R = arr.length;
        C = arr[0].length;

        diagonalOrder(arr);
    }
}
