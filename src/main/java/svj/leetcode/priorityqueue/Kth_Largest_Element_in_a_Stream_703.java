package svj.leetcode.priorityqueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Kth_Largest_Element_in_a_Stream_703 {
    private List<Integer> kLargest= new LinkedList<>();
    private int smallest= Integer.MAX_VALUE, k= 0;
    public Kth_Largest_Element_in_a_Stream_703(int k, int[] nums) {
        for(int num: nums){
            kLargest.add(num);
        }
        this.k= k;
        kLargest = Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).limit(k).collect(Collectors.toList());
        if(kLargest.size()== k)
            smallest= Math.min(smallest, kLargest.get(k-1));
        else
            smallest= Integer.MIN_VALUE;
    }

    public int add(int val) {
        boolean added= false;
        if(val> smallest){
            for(int i=0; i< kLargest.size(); i++){
                if(val> kLargest.get(i)){
                    kLargest.add(i, val);
                    added= true;
                    if(kLargest.size()== k+1)
                        kLargest.remove(k);
                    i= k;
                }
            }
            if(!added && kLargest.size()<k)
                kLargest.add(val);
        }
        return kLargest.get(k-1);
    }
}
