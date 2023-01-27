package svj.leetcode.misc;

import java.util.Arrays;

public class SmallestPositiveMissingInt {
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int count= 1;
        for(int a: A){
            if(a<=0)
                continue;
            else if(count== a){
                count++;
                continue;
            }
            else if(count> a)
                continue;
            else
                return count;
        }
        return A[A.length-1]+1>0? A[A.length-1]+1: 1;
    }
}
