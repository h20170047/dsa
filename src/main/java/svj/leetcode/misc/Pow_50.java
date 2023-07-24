package svj.leetcode.misc;

import java.math.BigDecimal;

public class Pow_50 {
    public double myPow(double x, int n) {
        double result= 1;
        if(n<0)
            x= 1/x;
        long absN= Math.abs((long)n);
        while (absN> 0){
            if((absN&1)== 1) result*= x;
            x*= x;
            absN>>= 1;
        }
        return Double.valueOf(String.format("%.5f", result));
    }
}
