import java.util.Arrays;

public class maxandmin {
    public static void main(String[] args) {
        int[] arr = {14, 16, 87, 36, 25, 89, 34};
        int M = 1;
        int N = 3;

        // Finding Mth maximum and Nth minimum numbers
        int[] result = findMthMaxAndNthMin(arr, M, N);

        // Output
        System.out.println(M + "st Maximum Number = " + result[0]);
        System.out.println(N + "rd Minimum Number = " + result[1]);
        System.out.println("Sum = " + (result[0] + result[1]));
        System.out.println("Difference = " + (result[0] - result[1]));
    }

    public static int[] findMthMaxAndNthMin(int[] arr, int m, int n) {
        // Sort the array in descending order for finding maximum
        Arrays.sort(arr);
        int[] result = new int[2];

        // Mth maximum number
        result[0] = arr[arr.length - m];

        // Nth minimum number
        result[1] = arr[n - 1];

        return result;
    }
}
