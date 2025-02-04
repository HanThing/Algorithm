package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ex6 {
    public static boolean isTrue(int num) {
        if(num <= 1)
            return false;
        else {
            for (int i = 2; i < num; i++) {
                if(num%i==0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

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
           result.add(res);
        }

        for (int i = 0; i < a; i++) {
            //소수확인
            if(isTrue(result.get(i))) {
                list.add(result.get(i));
            }
        }
        System.out.print(list);




    }
}
