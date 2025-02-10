package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][5];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            int cnt=0;
            for (int j = 0; j < a; j++) {
                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {

                    }
                }
            }
        }
    }
}
