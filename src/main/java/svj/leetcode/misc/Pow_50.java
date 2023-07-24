package svj.leetcode.misc;

import java.math.BigDecimal;

public class Pow_50 {
    public double myPow(double x, int n) {
//        BigDecimal result= BigDecimal.valueOf(1);
//        if(n< 0){
//            // divide
//            n= Math.abs(n);
//            while (n-- > 0) {
//                result= result.divide(BigDecimal.valueOf(x));
//            }
//        }else{
//            // multiply
//            while (n-- > 0) {
//                result= result.multiply(BigDecimal.valueOf(x));
//            }
//        }
//        return result.doubleValue();



//        if(x==0 || x==1)
//            return x;
//        if(x== -1)
//            return n%2==0? 1: -1;
//        if(n== -2147483648 && x<=100 && x>=2)
//            return 0;
//        double result= 1.0;
//        if(n< 0){
//            // divide
//            while (n <0) {
//                if(n/2< -1) {
//                    result /= (x * x);
//                    n -= 2;
//                }else {
//                    result = result / x;
//                    n++;
//                }
//            }
//        }else{
//            // multiply
//            while (n-- > 0) {
//                result= result*x;
//            }
//        }
//        return Double.valueOf(String.format("%.5f",result));

//        if(n == 0)
//            return 1;
//        if(x==0 || x==1)
//            return x;
//        if(x== -1)
//            return n%2==0? 1: -1;
//        if(n== -2147483648 && x<=100 && x>=2)
//            return 0;
//        if(n<0){
//            n = -n;
//            x = 1/x;
//        }
//        return Double.valueOf(String.format("%.5f", (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2) ));


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
