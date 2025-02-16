package TwoPointer;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int lt=0;
        int cnt=0;
        int result=0;
        for (int rt=0; rt<a; rt++) {
            if(arr[rt]==0)
                cnt++;
            while(cnt>b) {
                if(arr[lt]==0)
                    cnt--;
                lt++;
            }
            result = Math.max(result, rt-lt+1);
        }
        System.out.println(result);
    }
}
