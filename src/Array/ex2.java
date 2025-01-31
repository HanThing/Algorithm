package Array;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        sc.nextLine();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int tmp=arr[0];
        int count = 1;

        for (int x : arr) {
            if(tmp < x) {
                count++;
                tmp = x;
            }
        }

        System.out.println(count);
    }
}
