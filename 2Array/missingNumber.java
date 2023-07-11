public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7 };
        int possibleSum = ((arr.length + 1) * (arr.length + 2)) / 2;
        int actualSum = 0;

        // Arrays.stream(arr).sum();
        for (int i = 0; i < arr.length; i++)
            actualSum += arr[i];

        System.out.println(possibleSum - actualSum);
    }
}
