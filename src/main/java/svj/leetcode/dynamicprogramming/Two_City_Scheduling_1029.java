package svj.leetcode.dynamicprogramming;

import java.util.Arrays;

public class Two_City_Scheduling_1029 {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b)->{
            return (a[0]-a[1])-(b[0]-b[1]);
        });
        int res= 0;
        for(int i=0; i<costs.length/2; i++)
            res+= costs[i][0];
        for(int i= costs.length/2; i< costs.length; i++)
            res+= costs[i][1];
        return res;
    }
}
