package String;

import java.util.*;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        //char[] result = new char[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count=1;
            System.out.print(arr[i]);
            while(i<arr.length-1 && arr[i] == arr[i+1]) {
                count++;
                i++;
            }
            if(count > 1)
                System.out.print(count);

        }
    }
}
