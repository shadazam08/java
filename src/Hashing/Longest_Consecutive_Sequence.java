package Hashing;
//import  java.util.Arrays;
import java.util.*;

public class Longest_Consecutive_Sequence {
        static int findLongestsubseq(int[] arr)
        {
            if(arr.length == 0){
                return 0;
            }else{
                Arrays.sort(arr);
            }
            int ans = 0, count = 0;
            ArrayList<Integer> v = new ArrayList<>();
             v.add(ans);
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1])
                    v.add(arr[i]);
            }
            for (int i = 0; i < v.size(); i++) {
                if (i > 0 && v.get(i) == v.get(i - 1) + 1)
                    count++;
                else
                    count = 0;
                ans = Math.max(ans, count);
            }
            return ans;
        }
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = sc.nextInt();

            }
//            findLongestsubseq(arr);
            System.out.print(findLongestsubseq(arr));
        }
    }
