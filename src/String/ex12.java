package String;
import java.util.*;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='#')
                arr[i] = 1;
            else
                arr[i] = 0;
        }

        int sum=0;
        int counter=6;

        for (int i = 0; i < str.length(); i++) {
            if(arr[i]==1) {
                sum += (int)Math.pow(2, counter);
            }
            counter--;
            if(counter==-1) {
                System.out.print((char)sum);
                counter=6;
                sum=0;
            }
        }
    }
}
