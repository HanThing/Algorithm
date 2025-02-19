package HashMapAndTreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char[] arr = S.toCharArray();
        String T = sc.nextLine();
        char[] Tarr = T.toCharArray();

        HashMap<Character, Integer> Tmap = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            if(Tmap.containsKey(Tarr[i]))
                Tmap.put(Tarr[i], Tmap.get(Tarr[i])+1);
            else {
                Tmap.put(Tarr[i], 1);
            }
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else {
                map.put(arr[i], 1);
            }
        }


        int result=0, lt=0;
        for (int rt = T.length(); rt <= S.length(); rt++) {
            if(map.equals(Tmap))
                result++;
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0)
                map.remove(arr[lt]);
            lt++;
            if(rt!=S.length())
                map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
        }

        
        System.out.println(result);

    }
}
