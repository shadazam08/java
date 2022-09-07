package Star_Pattern;
import java.util.*;
public class pattern_Functional_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(i * 6 + " ");
            for(int j = 1; j <= n; j=j+1){
                int t = j * 4;
                System.out.print( t + " ");
//                System.out.print(j +" ");
                for(int k =1; k <= j; k++){
                    int l = t + 4;
                    System.out.print(l + " ");
                }
            }
            System.out.println();
        }
    }
}
