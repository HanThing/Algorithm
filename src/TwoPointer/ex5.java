package TwoPointer;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int length = N/2+1;
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = i+1;
        }
        int lt=0;
        int sum=0, result=0;
        for (int rt=0; rt<length ; rt++) {
            sum += arr[rt];
            if(sum==N)
                result++;
            while(sum>=N) {
                sum -= arr[lt++];
                if(sum==N)
                    result++;
            }
        }
        System.out.println(result);

    }
}
