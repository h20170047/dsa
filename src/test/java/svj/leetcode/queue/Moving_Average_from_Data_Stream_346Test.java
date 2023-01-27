package svj.leetcode.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Moving_Average_from_Data_Stream_346Test {

    private Moving_Average_from_Data_Stream_346 instance;
    @BeforeEach
    void setUp() {
    }

    @Test
    void next() {
        instance= new Moving_Average_from_Data_Stream_346(3);
        List<Double> result= new LinkedList<>();
        List<Double> expected= Arrays.asList(null, 1.0, 5.5, 4.66667, 6.0);
        result.add(null);
        result.add(instance.next(1));
        result.add(instance.next(10));
        result.add(instance.next(3));
        result.add(instance.next(5));
        assertThat(result).usingRecursiveComparison().isEqualTo(expected);
    }
}