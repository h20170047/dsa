package svj.leetcode.misc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Pow_50Test {
    Pow_50 instance= new Pow_50();

    @Test
    void myPow1() {
        double result = instance.myPow(2, 10);
        assertThat(result).isEqualTo(1024.0);
    }

    @Test
    void myPow2() {
        double result = instance.myPow(2.1, 3);
        assertThat(result).isEqualTo(9.261);
    }

    @Test
    void myPow3() {
        double result = instance.myPow(2, -2);
        assertThat(result).isEqualTo(.25);
    }

    @Test
    void myPow4() {
        double result = instance.myPow(1, 2147483647);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void myPow5() {
        double result = instance.myPow(2, -2147483648);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void myPow6() {
        double result = instance.myPow(-1, 2147483647);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void myPow7() {
        double result = instance.myPow(-1, -2147483648);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void myPow8() {
        double result = instance.myPow(1.0000000000001, -2147483648);
        assertThat(result).isEqualTo(.99979);
    }
}