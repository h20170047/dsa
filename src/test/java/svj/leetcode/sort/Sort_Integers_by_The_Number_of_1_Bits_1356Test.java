package svj.leetcode.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Sort_Integers_by_The_Number_of_1_Bits_1356Test {

    Sort_Integers_by_The_Number_of_1_Bits_1356 instance;

    @BeforeEach
    public void setup(){
        instance= new Sort_Integers_by_The_Number_of_1_Bits_1356();
    }
    @Test
    void sortByBits() {
        int[] result = instance.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        assertThat(result).isEqualTo(new int[]{0,1,2,4,8,3,5,6,7});
        result = instance.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1});
        assertThat(result).isEqualTo(new int[]{1,2,4,8,16,32,64,128,256,512,1024});
    }
}