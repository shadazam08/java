package Star_Pattern;

import java.util.Scanner;

public class Mirror_triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i = 1; i < n; i++){
            for(j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (j = i; j <= n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(i = n - 1; i >= 0; i--){
            for(j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(j = i; j <= n - 1; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
