import java.util.Scanner;

// time complexityO(m * n)
// space complexity: O(1)

public class prefixSum {
    private static void prefixSumMatrix(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r; i++)
            for (int j = 1; j < c; j++)
                arr[i][j] += arr[i][j - 1];

        for (int j = 0; j < c; j++)
            for (int i = 1; i < r; i++)
                arr[i][j] += arr[i - 1][j];
    }

    private static int sumRegion(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = arr[r2][c2];
        int upArea = arr[r1 - 1][c2];
        int leftArea = arr[r2][c1 - 1];
        int repeatedArea = arr[r1 - 1][c1 - 1];

        return sum - upArea - leftArea + repeatedArea;
    }

    // Brute Force Approach
    // public static int findSumMatrix(int[][] arr, int r1, int c1, int r2, int c2)
    // {
    // int sum = 0;
    // for (int i = r1; i <= r2; i++)
    // for (int j = c1; j <= c2; j++)
    // sum += arr[i][j];
    // return sum;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int r = sc.nextInt();

        System.out.println("Enter number of columns");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter matrix elements");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        System.out.println("Enter r1");
        int r1 = sc.nextInt();
        System.out.println("Enter c1");
        int c1 = sc.nextInt();
        System.out.println("Enter r2");
        int r2 = sc.nextInt();
        System.out.println("Enter c2");
        int c2 = sc.nextInt();

        sc.close();

        // int result = findSumMatrix(arr, r1, c1, r2, c2);

        prefixSumMatrix(arr);
        int result = sumRegion(arr, r1, c1, r2, c2);
        System.out.println("Sum of elements of given rectangle is: " + result);
    }
}