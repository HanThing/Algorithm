package TwoPointer;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for (int i = 0; i < b; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[a+b];
        int x=0, y=0, index=0;
        while(x<a && y<b) {
            if(arr1[x] < arr2[y]) {
                result[index++] = arr1[x++];
            }
            else if(arr1[x] > arr2[y]) {
                result[index++] = arr2[y++];
            } else {
                result[index++] = arr1[x++];
                result[index++] = arr2[y++];
            }
        }

        while(x<a) {
            result[index++] = arr1[x++];
        }
        while(y<b) {
            result[index++] = arr2[y++];
        }

        for (int i = 0; i < a+b; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
