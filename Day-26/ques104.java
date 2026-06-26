import java.util.Scanner;

public class ques104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Welcome to the Quiz =====\n");

        // Question 1
        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) New Delhi");
        System.out.println("c) Kolkata");
        System.out.println("d) Chennai");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        System.out.println("d) PHP");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'a' || ans2 == 'A') {
            score++;
        }

        // Question 3
        System.out.println("\n3. How many days are there in a leap year?");
        System.out.println("a) 364");
        System.out.println("b) 365");
        System.out.println("c) 366");
        System.out.println("d) 367");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'c' || ans3 == 'C') {
            score++;
        }

        // Display Result
        System.out.println("\n===== Quiz Result =====");
        System.out.println("Your Score: " + score + "/3");

        if (score == 3) {
            System.out.println("Excellent!");
        } else if (score == 2) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}