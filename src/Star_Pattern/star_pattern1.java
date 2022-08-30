package Star_Pattern;
import java.util.*;
public class star_pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = n - i; j >= 0; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("A ");
            }
            System.out.println();
        }
    }
}
