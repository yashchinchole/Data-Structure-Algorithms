import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        reverse(0, arr);
        for (int i : arr)
            System.out.print(i);
    }

    private static void reverse(int i, int[] arr) {
        int n = arr.length;
        if (i >= n / 2)
            return;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverse((i + 1), arr);
    }
}
