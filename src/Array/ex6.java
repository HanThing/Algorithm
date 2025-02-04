package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < a; i++) {
            int tmp = arr[i];
           int res = 0;
           while(tmp>0) {
                int t = tmp%10;
                res = res*10 + t;
                tmp = tmp/10;
           }
        }

        for (int i = 0; i < a; i++) {
            //소수확인
        }


        System.out.print(result);


    }
}
