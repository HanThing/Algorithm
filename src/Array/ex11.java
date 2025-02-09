package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //학생수
        int a = sc.nextInt();
        //행:학생, 열:학년
        int[][] arr = new int[a][5];
        //학생
        //int[] st = new int[a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            int cnt=0;
            //i학생이
            for (int j = 0; j < a; j++) {
                //j는 나머지학생
                for (int k = 0; k < j; k++) {
                    //k 학년일때
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
        }

        int max=-1;
        for (int x : st) {
            max = Math.max(max, x);
        }
        for (int i = 0; i < a; i++) {
            if(max == st[i]) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
