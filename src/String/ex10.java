package String;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        char[] arr = str.toCharArray();
        int front, rear;



        for (int i = 0; i < arr.length; i++) {
            int count=0;
            front = rear = i;
            if(i!=0)
                System.out.print(" ");
            while(front>=0 && rear<=arr.length-1) {
                if(arr[front]==t) {
                    System.out.print(count);
                    break;
                }
                else if(arr[rear]==t) {
                    System.out.print(count);
                    break;
                }
                if(front > 0)
                    front--;
                if(rear < arr.length-1)
                    rear++;
                count++;
            }
        }
    }
}
