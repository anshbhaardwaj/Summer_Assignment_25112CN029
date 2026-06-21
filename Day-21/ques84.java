import java.util.Scanner;

public class ques84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string in lowercase: ");
        String str = sc.nextLine();

        String upperStr = str.toUpperCase();

        System.out.println("Uppercase string: " + upperStr);

        sc.close();
    }
}