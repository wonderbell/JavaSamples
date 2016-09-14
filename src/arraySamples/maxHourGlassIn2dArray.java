package arraySamples;

import java.util.Scanner;

public class maxHourGlassIn2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // -9 <= a[i][j] <= 9, so min for a 3x3 hour glass is -63
        int maxSum = -65;

        for (int row = 0; row < 4; row++) {
            int hourGlassSum = 0;
            for (int col = 0; col < 4; col++) {
                hourGlassSum = arr[row][col] + arr[row][col + 1] + arr[row][col + 2]
                        + arr[row + 1][col + 1]
                        + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];

                maxSum = maxSum > hourGlassSum ? maxSum:hourGlassSum;
            }
        }

        System.out.println(maxSum);
    }
}
