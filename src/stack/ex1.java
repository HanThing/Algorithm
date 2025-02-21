package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) =='(') {
                stack.push('(');
            } else {
                if(stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
