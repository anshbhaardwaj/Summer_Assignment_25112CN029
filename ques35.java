public class ques35 {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            for (int j = 1; j <= (ch - 'A' + 1); j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}