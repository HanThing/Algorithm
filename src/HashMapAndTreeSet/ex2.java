package HashMapAndTreeSet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        HashMap<Character, Integer> hash = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if(hash.containsKey(ch1[i])) {
                hash.put(ch1[i], hash.get(ch1[i])+1);
            }else {
                hash.put(ch1[i], 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if(hash2.containsKey(ch2[i])) {
                hash2.put(ch2[i], hash2.get(ch2[i])+1);
            }else {
                hash2.put(ch2[i], 1);
            }
        }
        if(hash.equals(hash2))
            System.out.println("YES");
        else {
            System.out.println("NO");
        }


    }
}
