package Array;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] arr = new int[a];
        arr[0] = arr[1] = 1;
        for (int i = 2; i < a; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int x : arr) {
            System.out.print(x);
            if(x!=arr[a-1])
                System.out.print(" ");
        }
    }
}
