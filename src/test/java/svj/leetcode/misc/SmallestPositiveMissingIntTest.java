package svj.leetcode.misc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SmallestPositiveMissingIntTest {

    private SmallestPositiveMissingInt instance;
    @BeforeEach
    public void setup(){
        instance= new SmallestPositiveMissingInt();
    }
    @Test
    void solution() {
        int result = instance.solution(new int[]{1, 3, 6, 4, 1, 2});
        assertThat(result).isEqualTo(5);
        result = instance.solution(new int[]{1, 2, 3});
        assertThat(result).isEqualTo(4);
        result = instance.solution(new int[]{-1, -3});
        assertThat(result).isEqualTo(1);
    }
}