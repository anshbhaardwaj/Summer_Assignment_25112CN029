public class ques40{
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Ascending characters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            // Descending characters
            for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}
