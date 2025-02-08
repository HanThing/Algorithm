package Array;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a+2][a+2];

        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < a+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int result = 0;
        for (int i = 1; i < a+1; i++) {
            for (int j = 1; j < a+1; j++) {
                if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j+1])
                    result++;
            }
        }

        System.out.println(result);
    }
}
