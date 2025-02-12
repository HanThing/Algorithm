package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
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
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(p1<a && p2<b) {
            if(arr1[p1]<arr2[p2]) {
                p1++;
            } else if(arr1[p1] > arr2[p2]) {
                p2++;
            } else {
                result.add(arr1[p1++]);
                p2++;
            }
        }

        for(int x : result) {
            System.out.print(x+" ");
        }
    }
}
