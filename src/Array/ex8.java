package Array;

import java.util.*;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int count=1;
        int[] answer = new int[a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if(arr[i]<arr[j]) {
                    count++;
                }
            }
            answer[i] = count;
            count=1;
        }
        for (int i = 0; i < a; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
