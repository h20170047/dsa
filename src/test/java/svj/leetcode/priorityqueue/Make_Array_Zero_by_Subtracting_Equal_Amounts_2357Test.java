package svj.leetcode.priorityqueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Make_Array_Zero_by_Subtracting_Equal_Amounts_2357Test {

    private Make_Array_Zero_by_Subtracting_Equal_Amounts_2357 instance;
    @BeforeEach
    public void setup(){
        instance= new Make_Array_Zero_by_Subtracting_Equal_Amounts_2357();
    }

    @Test
    public void test1(){
        int result = instance.minimumOperations(new int[]{1, 5, 0, 3, 5});
        assertThat(result).isEqualTo(3);

        result = instance.minimumOperations(new int[]{0});
        assertThat(result).isEqualTo(0);

    }



}