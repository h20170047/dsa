package svj.leetcode.misc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthofaConcatenatedStringwithUniqueCharactersTest {

    MaximumLengthofaConcatenatedStringwithUniqueCharacters instance= new MaximumLengthofaConcatenatedStringwithUniqueCharacters();

    @Test
    void maxLength_zeroLen() {
        List<String> arr= Arrays.asList();
        int result = instance.maxLength(arr);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void maxLength_Duplicated() {
        List<String> arr= Arrays.asList("aa", "bb");
        int result = instance.maxLength(arr);
        assertThat(result).isEqualTo(0);
    }

//    @Test
//    void maxLength() {
//        List<String> arr= Arrays.asList("un","iq","ue");
//        int result = instance.maxLength(arr);
//        assertThat(result).isEqualTo(4);
//    }
}