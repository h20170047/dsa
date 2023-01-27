package svj.leetcode.priorityqueue;

public class Make_Array_Zero_by_Subtracting_Equal_Amounts_2357 {
    public int minimumOperations(int[] nums) {
        int count= 0, nLen= nums.length;
        boolean allZero= isAllZero(nums);
        while(!allZero){
            count++;
            int small= Integer.MAX_VALUE;
            for(int num: nums){ // get smallest in list
                if(num!= 0 && num<small){
                    small= num;
                }
            }
            for(int i=0; i<nLen; i++){
                if(nums[i]!= 0){
                    nums[i]-= small;
                }
            }
            allZero= isAllZero(nums);
        }
        return count;
    }
    public boolean isAllZero(int[] nums){
        for(int num: nums){
            if(num!= 0)
                return false;
        }
        return true;
    }
}
