package Array;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int sum=0, count=0;
        for (int i = 0; i < a; i++) {
            if(arr[i]==1) {
                count++;
                sum += count;
            }
            else {
                count=0;
            }
        }
        System.out.println(sum);

    }
}
