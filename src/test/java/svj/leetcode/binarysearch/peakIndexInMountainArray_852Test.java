package svj.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class peakIndexInMountainArray_852Test {

    PeakIndexInMountainArray_852 instance= new PeakIndexInMountainArray_852();

    @Test
    void peakIndexInMountainArray1() {
        int result = instance.peakIndexInMountainArray(new int[]{0, 1, 0});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void peakIndexInMountainArray2() {
        int result = instance.peakIndexInMountainArray(new int[]{0, 2, 1, 0});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void peakIndexInMountainArray3() {
        int result = instance.peakIndexInMountainArray(new int[]{0, 10, 5, 2});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void peakIndexInMountainArray4() {
        int result = instance.peakIndexInMountainArray(new int[]{0, 10, 7, 5, 2});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void peakIndexInMountainArray5() {
        int result = instance.peakIndexInMountainArray(new int[]{40,48,61,75,100,99,98,39,30,10});
        assertThat(result).isEqualTo(4);
    }

    @Test
    void peakIndexInMountainArray6() {
        int result = instance.peakIndexInMountainArray(new int[]{3,5,3,2,0});
        assertThat(result).isEqualTo(1);
    }

    @Test
    void peakIndexInMountainArray7() {
        int result = instance.peakIndexInMountainArray(new int[]{3,4,5,1});
        assertThat(result).isEqualTo(2);
    }

    @Test
    void peakIndexInMountainArray8() {
        int result = instance.peakIndexInMountainArray(new int[]{55,59,63,99,97,94,84,81,79,66,40,38,33,23,22,21,17,9,7});
        assertThat(result).isEqualTo(3);
    }

    @Test
    void peakIndexInMountainArray9() {
        int result = instance.peakIndexInMountainArray(new int[]{3,4,11,15,18,24,30,36,44,57,62,64,68,88,90,91,99,100,81,74,61,55,49,39,23,15,11});
        assertThat(result).isEqualTo(17);
    }

}