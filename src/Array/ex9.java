package Array;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[] row = new int[a];
        int[] col = new int[a];
        int side1=0;
        int side2=0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                row[i] += arr[i][j];
                col[i] += arr[j][i];
            }
            side1 += arr[i][i];
            side2 += arr[a-(i+1)][i];
        }

        int max=0;
        for (int i = 0; i < a; i++) {
            if(max<row[i])
                max = row[i];
            if(max<col[i])
                max = col[i];
        }
        if(max<side1)
            max = side1;
        if(max<side2)
            max = side2;
        System.out.println(max);

    }
}
