package TwoPointer;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int tail=0;
        int sum=0, cnt=0;
        for (int i = 0; i < a; i++) {
            sum+=arr[i];
            if(sum==b)
                cnt++;
            while(sum>=b) {
                sum-=arr[tail++];
                if(sum==b)
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
