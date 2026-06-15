public class ques60 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeroes
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        System.out.println("\nArray after moving zeroes to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
