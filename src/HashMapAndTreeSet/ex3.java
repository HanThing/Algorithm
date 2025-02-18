package HashMapAndTreeSet;

import java.util.*;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new TreeMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < b; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        result.add(map.size());

        int tmp=0;
        while(b<a) {
            map.put(arr[tmp], map.getOrDefault(arr[tmp], 0)-1);
            if(map.get(arr[tmp])==0)
                map.remove(arr[tmp]);
            tmp++;
            map.put(arr[b], map.getOrDefault(arr[b], 0)+1);
            b++;
            result.add(map.size());
        }

        for (int x : result) {
            System.out.print(x + " ");
        }

    }
}
