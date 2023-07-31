import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = findNumber(num);
        System.out.println("Square root: " + ans);
        sc.close();
    }

    private static int findNumber(int num) {
        int low = 1;
        int high = num;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid <= num) {
                low = mid + 1;
                ans = mid;
            } else
                high = mid - 1;
        }
        return ans;
    }
}
