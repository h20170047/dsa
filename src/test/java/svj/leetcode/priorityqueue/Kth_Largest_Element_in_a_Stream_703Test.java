package svj.leetcode.priorityqueue;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Kth_Largest_Element_in_a_Stream_703Test {

    @Test
    public void test1(){
        Kth_Largest_Element_in_a_Stream_703 instance= new Kth_Largest_Element_in_a_Stream_703(3, new int[]{4, 5, 8, 2});
        List<Integer> result= new LinkedList<>();
        result.add(null);
        result.add(instance.add(3));
        result.add(instance.add(5));
        result.add(instance.add(10));
        result.add(instance.add(9));
        result.add(instance.add(4));
        List<Integer> expected= Arrays.asList(null, 4, 5, 5, 8, 8);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void test2(){
        Kth_Largest_Element_in_a_Stream_703 instance= new Kth_Largest_Element_in_a_Stream_703(1, new int[]{});
        List<Integer> result= new LinkedList<>();
        result.add(null);
        result.add(instance.add(-3));
        result.add(instance.add(-2));
        result.add(instance.add(-4));
        result.add(instance.add(0));
        result.add(instance.add(4));
        List<Integer> expected= Arrays.asList(null, -3, -2, -2, 0, 4);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void test3(){
        Kth_Largest_Element_in_a_Stream_703 instance= new Kth_Largest_Element_in_a_Stream_703(2, new int[]{0});
        List<Integer> result= new LinkedList<>();
        result.add(null);
        result.add(instance.add(-1));
        result.add(instance.add(1));
        result.add(instance.add(-2));
        result.add(instance.add(-4));
        result.add(instance.add(3));
        List<Integer> expected= Arrays.asList(null, -1, 0, 0, 0, 1);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    public void test4(){
        Kth_Largest_Element_in_a_Stream_703 instance= new Kth_Largest_Element_in_a_Stream_703(3, new int[]{5, -1});
        List<Integer> result= new LinkedList<>();
        result.add(null);
        result.add(instance.add(2));
        result.add(instance.add(1));
        result.add(instance.add(-1));
        result.add(instance.add(3));
        result.add(instance.add(4));
        List<Integer> expected= Arrays.asList(null, -1,1,1,2,3);
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }

}