package Hashing;
import java.io.*;
import java.util.*;
public class Count_unique_elements {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            hs.add(arr[i]);
        }
        // int ans = hs.size();
        System.out.print(hs.size());
    }
}
