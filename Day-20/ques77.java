import java.util.Scanner;

public class ques77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows1, cols1, rows2, cols2;

        System.out.print("Enter rows and columns of first matrix: ");
        rows1 = sc.nextInt();
        cols1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        rows2 = sc.nextInt();
        cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        int[][] A = new int[rows1][cols1];
        int[][] B = new int[rows2][cols2];
        int[][] C = new int[rows1][cols2];

        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}