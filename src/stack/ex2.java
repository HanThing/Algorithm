package stack;

import java.util.*;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Deque<Character> stack = new ArrayDeque<>();
        List<Character> result = new ArrayList<>();
        for(Character x : s.toCharArray()) {
            if(x=='(')
                stack.push(x);
            if(x==')')
                stack.pop();
            if(stack.isEmpty()&&x!=')')
                result.add(x);
        }
        for(Character x : result) {
            System.out.print(x);
        }
    }
}
