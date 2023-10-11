package svj.leetcode.string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstingTest {

    @Test
    public void test1(){
        String inp1= "abbaaba";
        String out1 = LongestSubsting.longestBalancedString(inp1);
//        String exp1= "abbaab";
//        assertThat(out1).isEqualTo(exp1);
        String exp2= "bbaaba";
        assertThat(out1).isEqualTo(exp2);
    }

    @Test
    public void test2(){
        String inp1= "baaab";
        String out1 = LongestSubsting.longestBalancedString(inp1);
        String exp2= "ba";
        assertThat(out1).isEqualTo(exp2);
    }

    @Test
    public void test3(){
        String inp1= "xyz";
        String out1 = LongestSubsting.longestBalancedString(inp1);
        String exp2= "";
        assertThat(out1).isEqualTo(exp2);
    }

}