package Hashing;
import java.util.*;

public class non_repeating_character {
    public static char getFirstNonRepeatedChar(String str)
    {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();

        for (int i = 0; i < str.length(); i++)
        {
            char letter = str.charAt(i);

            if (repeating.contains(letter))
            {
                continue;
            }

            // Remove character from nonRepeating if letter exist otherwise add
            if (nonRepeating.contains(letter))
            {
                nonRepeating.remove((Character) letter);
                repeating.add(letter);
            }
            else
            {
                nonRepeating.add(letter);
            }
        }
        // First element in nonRepeated is first non repeated char.
        return nonRepeating.get(0);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(getFirstNonRepeatedChar(s));
//        System.out.println("First non repeated Char: " + getFirstNonRepeatedChar("newtonschool"));
//        System.out.println("First non repeated Char: " + getFirstNonRepeatedChar("Hello World Hey World"));
//        System.out.println("First non repeated Char: " + getFirstNonRepeatedChar("Hey Hey"));
    }
}