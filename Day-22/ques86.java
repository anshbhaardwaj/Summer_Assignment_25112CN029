import java.util.Scanner;

public class ques86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        int count = words.length;

        System.out.println("Number of words = " + count);

        sc.close();
    }
}