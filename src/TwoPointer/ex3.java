package TwoPointer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int peek = sc.nextInt();
        int[] arr = new int[day];
        for (int i = 0; i < day; i++) {
            arr[i] = sc.nextInt();
        }

        int sum=0;
        for (int i = 0; i < peek; i++) {
            sum += arr[i];
        }

        int answer = sum;
        for (int i = peek; i < day; i++) {
           sum+=arr[i];
           sum-=arr[i-peek];
           if(answer<sum) {
               answer=sum;
           }
        }
        System.out.println(answer);


    }
}
