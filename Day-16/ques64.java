import java.util.*;

public class ques64{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};

        // Using LinkedHashSet to remove duplicates and maintain order
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicates:");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}