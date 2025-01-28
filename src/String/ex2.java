package String;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase();
        char[] arr = new char[str1.length()];

        char str2 = scanner.nextLine().toLowerCase().charAt(0);

        for(int i = 0; i < str1.length(); i++)
            arr[i] = str1.charAt(i);

        int result=0;
        for (int i = 0; i < str1.length(); i++) {
            if(arr[i] == str2)
                result++;
        }
        System.out.println(result);
    }
}
