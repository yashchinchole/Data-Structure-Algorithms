public class palindromeArray {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 15, 17, 19, 17, 15, 13, 11 };
        boolean isPalindrome = true;

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
