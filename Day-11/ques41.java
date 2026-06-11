import java.util.Scanner;

public class ques41{

    // Function to find sum of two numbers
    static int findSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int sum = findSum(num1, num2);

        System.out.println("Sum = " + sum);

        sc.close();
    }
}