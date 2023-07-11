import java.util.Arrays;

public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6 };
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] == arr[i + 1])
                System.out.print(arr[i] + " ");
    }
}
