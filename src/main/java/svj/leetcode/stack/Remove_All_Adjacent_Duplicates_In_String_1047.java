package svj.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Remove_All_Adjacent_Duplicates_In_String_1047 {

    public String removeDuplicates(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (stack.peek() != c)
                    stack.push(c);
                else
                    stack.poll();
            } else
                stack.push(c);
        }
        StringBuilder sb= new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
