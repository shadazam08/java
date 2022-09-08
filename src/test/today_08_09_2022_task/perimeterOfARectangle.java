package test.today_08_09_2022_task;
import java.util.*;
public class perimeterOfARectangle {
    public static int perimeterRectangle(int length, int breadth){
        int perimeter = 2 * (length + breadth);
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println(perimeterRectangle(length, breadth));
    }
}