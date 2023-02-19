package svj.leetcode.math;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Reordered_Power_of_2_869Test {

    Reordered_Power_of_2_869 instance= new Reordered_Power_of_2_869();

    @Test
    void test1() {
        boolean result = instance.reorderedPowerOf2(1);
        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        boolean result = instance.reorderedPowerOf2(10);
        assertThat(result).isFalse();
    }

    @Test
    void test3() {
        boolean result = instance.reorderedPowerOf2(5);
        assertThat(result).isFalse();
    }

    @Test
    void test4() {
        boolean result = instance.reorderedPowerOf2(8);
        assertThat(result).isTrue();
    }

    @Test
    void test5() {
        boolean result = instance.reorderedPowerOf2(61);
        assertThat(result).isTrue();
    }

    @Test
    void test6() {
        boolean result = instance.reorderedPowerOf2(16);
        assertThat(result).isTrue();
    }

    @Test
    void test7() {
        boolean result = instance.reorderedPowerOf2(218);
        assertThat(result).isTrue();
    }

    @Test
    void test8() {
        boolean result = instance.reorderedPowerOf2(4960);
        assertThat(result).isTrue();
    }

    @Test
    void test9() {
        boolean result = instance.reorderedPowerOf2(679213508);
        assertThat(result).isTrue();
    }

    @Test
    void test10() {
        boolean result = instance.reorderedPowerOf2(46);
        assertThat(result).isTrue();
    }
}