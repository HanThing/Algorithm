package Array;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        sc.nextLine();
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        int result = arr[0];
        System.out.print(result + " ");
        for (int i = 1; i < a; i++) {
            if(result < arr[i]) {
                System.out.print(arr[i] + " ");
            }
            result = arr[i];
        }

    }
}
