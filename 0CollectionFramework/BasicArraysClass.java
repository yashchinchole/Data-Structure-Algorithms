import java.util.Arrays;

public class BasicArraysClass {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 42, 5, 2, 9 };
        System.out.println(Arrays.binarySearch(arr, 7));

        Arrays.sort(arr);
        for (Integer i : arr)
            System.out.print(i + " ");

        Arrays.fill(arr, 10);
        for (Integer i : arr)
            System.out.println(i);
    }
}
