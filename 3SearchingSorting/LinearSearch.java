import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.println("Enter target element");
        int target = sc.nextInt();

        int ans = ls(a, target);
        if (ans != -1)
            System.out.println("Target is present at index : " + ans);
        else
            System.out.println("Target is not present");
        sc.close();
    }

    public static int ls(int a[], int target) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;
        return -1;
    }
}
