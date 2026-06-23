import java.util.HashSet;
import java.util.Scanner;

public class ques90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (set.contains(ch)) {
                System.out.println("First repeating character: " + ch);
                return;
            }

            set.add(ch);
        }

        System.out.println("No repeating character found.");
    }
}