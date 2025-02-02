package Array;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a+1];
        arr[0] = arr[1] = 1;

        int count=0;

        for (int i=2; i<a+1; i++) {
            if(arr[i] == 0) {
                count++;
                int tmp=i;
                int index=1;
                while(tmp<=a) {
                    arr[tmp] = 1;
                    tmp = i;
                    tmp= index*tmp;
                    index++;
                }
            }
        }

        System.out.println(count);

    }
}
