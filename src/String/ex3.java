package String;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int index = 0;
        String result = null;
        for (String s : arr) {
            if (index < s.length()) {
                index = s.length();
                result = s;
            }
        }
        System.out.println(result);
    }
}
