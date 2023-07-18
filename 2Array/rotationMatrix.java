import java.util.*;

class rotationMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        rotatedMatrix(arr);

        for (var mat : arr)
            System.out.println(Arrays.toString(mat));
    }

    private static void rotatedMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int leftIndex = 0;
            int rightIndex = arr[0].length - 1;

            while (leftIndex < rightIndex) {
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;
                leftIndex++;
                rightIndex--;
            }
        }
    }
}