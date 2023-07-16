import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Enter target element");
        int target = sc.nextInt();

        int ans = bs(arr, target);
        if (ans != -1)
            System.out.println("Target is present at index : " + ans);
        else
            System.out.println("Target is not present");
        sc.close();
    }

    private static int bs(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        int m = -1;
        while (l < r) {
            m = (l + r) / 2;
            if (arr[m] >= target)
                r = m;
            else
                l = m;
            if (arr[m] == target)
                return m;
        }
        return m;
    }
}
