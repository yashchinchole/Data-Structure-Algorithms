public class arrayBasic {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 15, 17, 19 };
        
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

        for (int i : arr)
            System.out.println(i);
    }
}
