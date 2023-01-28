package svj.leetcode.misc;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class InvertClassTest {
    private Inverter instance= new Inverter();

    @Test
    public void nullInput(){
        String result = instance.invert(null);
        assertEquals(result, "");
    }

    @Test
    public void singleCharInput(){
        String result = instance.invert("a");
        assertEquals(result, "a");
    }

    @Test
    public void multipleCharInput(){
        String result = instance.invert("abc");
        assertEquals(result, "cba");
    }

}