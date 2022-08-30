package arrays_practice;
import java.util.*;
public class input_array_and_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }

    }
}
