package svj.leetcode.sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort_Integers_by_The_Number_of_1_Bits_1356 {

    private static int compareOnes(Pair o1, Pair o2) {
        if (o1.ones == o2.ones)
            return Integer.compare(o1.value, o2.value);
        return Integer.compare(o1.ones, o2.ones);
    }

    class Pair{
        int ones;
        int value;
        Pair(int ones, int value){
            this.ones= ones;
            this.value= value;
        }
    }
    public int[] sortByBits(int[] arr) {
        List<Pair> list= new LinkedList<>();
        for(int ele: arr){
            list.add(new Pair(Integer.bitCount(ele), ele));
        }
        Collections.sort(list, Sort_Integers_by_The_Number_of_1_Bits_1356::compareOnes);
        return list.stream().mapToInt(x-> x.value).toArray();
    }

    private int getOnes(int ele) {
        int count= 0;
        while (ele > 0) {
            if(ele%2== 1)
                count++;
            ele/= 2;
        }
        return count;
    }
}
