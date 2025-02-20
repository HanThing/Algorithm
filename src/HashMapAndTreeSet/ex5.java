package HashMapAndTreeSet;

import java.util.*;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add(sc.nextInt());
        }
        list.sort(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        for (int i = 0; i < b; i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
        }
        for (int i = 0; i < b; i++) {
            sum+=list.get(i);
        }

        map.put(list.get(2), map.getOrDefault(list.get(2), 0)-1);
        if(map.get(list.get(2))==0)
            map.remove(list.get(2));

        int cnt=1;
        int sumMap=0;
        for (int pt=b-1; pt < a; pt++) {
            map.put(list.get(pt), map.getOrDefault(list.get(pt), 0)+1);
            for(int x : map.keySet()) {
                sumMap += x * map.get(x);
            }
            if(sum>sumMap)
                cnt++;
            if(cnt==3)
                break;
            sumMap=0;
            map.put(list.get(pt), map.getOrDefault(list.get(pt), 0)-1);
            if(map.get(list.get(pt))==0)
                map.remove(list.get(pt));
        }
        if(cnt==3)
            System.out.println(sumMap);
        else {
            System.out.println(-1);
        }
    }
}
