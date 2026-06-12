import java.util.Scanner;

public class ques47 {

    // Function to find nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci term at position " + n + " is: " + fibonacci(n));

        sc.close();
    }
}