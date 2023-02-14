package svj.leetcode.dfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Add_Binary_67Test {

    Add_Binary_67 instance= new Add_Binary_67();

    @Test
    void test1() {
        String result = instance.addBinary("11", "1");
        assertThat(result).isEqualTo("100");
    }

    @Test
    void test2() {
        Add_Binary_67 instance= new Add_Binary_67();
        String result = instance.addBinary("1010", "1011");
        assertThat(result).isEqualTo("10101");
    }
}