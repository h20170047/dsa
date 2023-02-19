package svj.leetcode.breadthfirstsearch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Find_if_Path_Exists_in_Graph_1971Test {

    private Find_if_Path_Exists_in_Graph_1971 instance;

    @BeforeEach
    public void setup(){
        instance= new Find_if_Path_Exists_in_Graph_1971();
    }

    @Test
    void test1() {
        boolean result = instance.validPath(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}, 0, 2);
        assertThat(result).isTrue();
    }

    @Test
    void test2() {
        boolean result = instance.validPath(6, new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}}, 0, 5);
        assertThat(result).isFalse();
    }

    @Test
    void test3() {
        boolean result = instance.validPath(1, new int[][]{{}}, 0, 0);
        assertThat(result).isTrue();
    }
}