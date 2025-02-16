package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> result = new HashMap<>();

        for (char c : arr) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }

        int max=0;
        Character ch = null;
        Character[] abcde = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < 5; i++) {
            if(result.containsKey(abcde[i]) && result.get(abcde[i]) > max) {
                max = result.get(abcde[i]);
                ch=abcde[i];
            }
        }
        System.out.println(ch);


    }
}