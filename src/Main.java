import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {

            int a;
            double x, y, z;

            for (int i = 0; i < 3; i++) {
                list.add(sc.nextInt());
                list.sort(Collections.reverseOrder());
            }

            if(list.get(0)==0 && list.get(1)==0 && list.get(2)==0) {
                break;
            }

            x = Math.pow(list.get(0),2);
            y = Math.pow(list.get(1),2);
            z = Math.pow(list.get(2),2);

            if(x == y+z)
                System.out.println("right");
            else
                System.out.println("wrong");

            list.clear();

        }

    }
}
