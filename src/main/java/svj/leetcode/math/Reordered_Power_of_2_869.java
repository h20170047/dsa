package svj.leetcode.math;

import java.util.*;

public class Reordered_Power_of_2_869 {
    public boolean reorderedPowerOf2(int n) {
        if(n== 1 || isPowerOfTwo(n))
            return true;
        else if(isAnyPermutationPowerOfTwo(n, new HashSet(Arrays.asList(n))))
            return true;
        else
            return false;
    }

    private boolean isAnyPermutationPowerOfTwo(int n, Set<Integer> checkedInt) {
        Deque<Integer> stack= new LinkedList<>();
        stack.push(n);
        while (!stack.isEmpty()){
            char[] num= String.valueOf(stack.pop()).toCharArray();
            int numLen= num.length;
            for(int i=0; i<numLen; i++){
                for(int j= i+1; j< numLen; j++){
                    // swap i and j
                    swapTwoChars(num, i, j);
                    if(num[0]!= '0'){
                        int currentNumber= Integer.parseInt(String.valueOf(num));
                        if(!checkedInt.contains(currentNumber)){
                            checkedInt.add(currentNumber);
                            if(isPowerOfTwo(currentNumber)){
                                return true;
                            }else{
                                stack.push(currentNumber);
                            }
                        }
                    }
                    // swap back i and j
                    swapTwoChars(num, i, j);
                }
            }
        }
        return false;
    }

    private void swapTwoChars(char[] num, int i, int j) {
        char temp= num[i];
        num[i]= num[j];
        num[j]= temp;
    }

    private boolean isPowerOfTwo(int n) {
        return Integer.numberOfLeadingZeros(n)+ Integer.numberOfTrailingZeros(n)+1== 32? true: false;
    }
}
