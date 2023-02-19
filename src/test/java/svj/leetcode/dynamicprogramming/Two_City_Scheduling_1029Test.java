package svj.leetcode.dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Two_City_Scheduling_1029Test {

    Two_City_Scheduling_1029 instance= new Two_City_Scheduling_1029();

    @Test
    void test1() {
        int result = instance.twoCitySchedCost(new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}});
        assertThat(result).isEqualTo(110);
    }

    @Test
    void test2() {
        int result = instance.twoCitySchedCost(new int[][]{{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}});
        assertThat(result).isEqualTo(1859);
    }

    @Test
    void test3() {
        int result = instance.twoCitySchedCost(new int[][]{{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}});
        assertThat(result).isEqualTo(3086);
    }



}