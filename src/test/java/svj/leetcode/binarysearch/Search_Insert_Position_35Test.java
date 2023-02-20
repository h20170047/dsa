package svj.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Search_Insert_Position_35Test {

    Search_Insert_Position_35 instance= new Search_Insert_Position_35();

    @Test
    void test1() {
        int result = instance.searchInsert(new int[]{1, 3, 5, 6}, 5);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void test2() {
        int result = instance.searchInsert(new int[]{1, 3, 5, 6}, 2);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void test3() {
        int result = instance.searchInsert(new int[]{1, 3, 5, 6}, 7);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void test4() {
        int result = instance.searchInsert(new int[]{1, 3}, 2);
        assertThat(result).isEqualTo(1);
    }
}