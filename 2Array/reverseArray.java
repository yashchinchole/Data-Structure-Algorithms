public class reverseArray {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 15, 17, 19 };

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i : arr)
            System.out.println(i);
    }
}
