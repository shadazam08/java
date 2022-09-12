package arrays_practice;
import java.util.*;
public class missingSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = ((n+1) * (n+2)) / 2;
        for (int j : arr) {
            sum -= j;
        }
        System.out.print(sum);
    }
}
