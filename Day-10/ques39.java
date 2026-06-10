public class ques39 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}