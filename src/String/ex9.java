package String;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().replaceAll("[^0-9]", "").replaceFirst("^0+", "");
        System.out.println(str);
    }
}
