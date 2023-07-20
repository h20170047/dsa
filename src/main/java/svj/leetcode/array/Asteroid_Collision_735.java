package svj.leetcode.array;

import java.util.Deque;
import java.util.LinkedList;

public class Asteroid_Collision_735 {
    public int[] asteroidCollision(int[] asteroids) {
        int ptr= 0, top, n= asteroids.length;
        Deque<Integer> stack= new LinkedList<>();
        while (ptr< n ){
            if(asteroids[ptr]> 0)
                stack.push(asteroids[ptr]);
            else {
                // remove all small elements prior to
                while(!stack.isEmpty() && (stack.peek()<0 != asteroids[ptr]< 0) && Math.abs(stack.peek())< Math.abs(asteroids[ptr]))
                    stack.pop();
                if(!stack.isEmpty() && (stack.peek()<0 != asteroids[ptr]< 0) && Math.abs(stack.peek())== Math.abs(asteroids[ptr])) {
                    stack.pop();
                    ptr++;
                    continue;
                }
                else if(!stack.isEmpty() && (stack.peek()<0 != asteroids[ptr]< 0) && Math.abs(stack.peek())> Math.abs(asteroids[ptr])){
                    ptr++;
                    continue;
                }
                if(stack.isEmpty() || (!stack.isEmpty() && (stack.peek()<0 == asteroids[ptr]< 0)) )
                    stack.push(asteroids[ptr]);
            }
            ptr++;
        }
        int count= stack.size();
        int[] result= new int[stack.size()];
        while (!stack.isEmpty()){
            result[--count]= stack.pop();
        }
        return result;
    }
}
