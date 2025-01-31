package Array;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[a];
        for (int i = 0; i < a; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            arrB[i] = sc.nextInt();
        }

        //1:가위, 2:바위, 3:보
        for (int i = 0; i < a; i++) {
            if(arrA[i] == arrB[i])
                System.out.println("D");
            else if (arrA[i]==1) {
                if(arrB[i]==2)
                    System.out.println("B");
                else if(arrB[i]==3)
                    System.out.println("A");
            }
            else if (arrA[i]==2) {
                if(arrB[i]==1)
                    System.out.println("A");
                else
                    System.out.println("B");
            }
            else if (arrA[i]==3) {
                if(arrB[i]==1)
                    System.out.println("B");
                else
                    System.out.println("A");
            }
        }
    }
}
