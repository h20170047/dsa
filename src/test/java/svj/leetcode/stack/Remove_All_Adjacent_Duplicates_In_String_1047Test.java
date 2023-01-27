package svj.leetcode.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Remove_All_Adjacent_Duplicates_In_String_1047Test {

    private Remove_All_Adjacent_Duplicates_In_String_1047 instance;

    @BeforeEach
    public void setup(){
        instance= new Remove_All_Adjacent_Duplicates_In_String_1047();
    }
    @Test
    void removeDuplicates() {
        String output= instance.removeDuplicates("abbaca");
        assertThat(output).isEqualTo("ca");
        output= instance.removeDuplicates("azxxzy");
        assertThat(output).isEqualTo("ay");
    }
}