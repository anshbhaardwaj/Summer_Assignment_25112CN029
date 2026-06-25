import java.util.Scanner;
import java.util.Arrays;

public class ques99 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] names = new String[n];

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("\nNames in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}