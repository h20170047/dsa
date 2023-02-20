package svj.leetcode.binarysearch;

import java.util.Arrays;

public class Search_Insert_Position_35 {
    public int searchInsert(int[] nums, int target) {
        System.out.println("List: "+ Arrays.toString(nums)+", target: "+target);
        return bSearch(nums, 0, nums.length-1, target);
    }

    private int bSearch(int[] nums, int l, int r, int target) {
        int m= l+(r-l)/2;
        System.out.println("L, M, R: "+l+", "+m+", "+r);
        if(nums[m]== target)
            return m;
        if(l> r)
            return m;
        if(l== r){
            if(nums[m]< target)
                return m+1;
            else
                return m;
        }
        else if(nums[m]< target){
            return bSearch(nums, m+1, r, target);
        }
        else
            return bSearch(nums, l, m, target);
    }
}
