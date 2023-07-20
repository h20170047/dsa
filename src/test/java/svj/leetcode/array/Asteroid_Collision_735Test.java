package svj.leetcode.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Asteroid_Collision_735Test {

    Asteroid_Collision_735 instance= new Asteroid_Collision_735();

    @Test
    void asteroidCollision1() {
        int[] result = instance.asteroidCollision(new int[]{5, 10, -5});
        assertThat(result).isEqualTo(new int[]{5, 10});
    }
    @Test
    void asteroidCollision2() {
        int[] result = instance.asteroidCollision(new int[]{8,-8});
        assertThat(result).isEqualTo(new int[]{});
    }
    @Test
    void asteroidCollision3() {
        int[] result = instance.asteroidCollision(new int[]{10,2,-5});
        assertThat(result).isEqualTo(new int[]{10});
    }
    @Test
    void asteroidCollision4() {
        int[] result = instance.asteroidCollision(new int[]{-2,-1,1,2});
        assertThat(result).isEqualTo(new int[]{-2,-1,1,2});
    }
    @Test
    void asteroidCollision5() {
        int[] result = instance.asteroidCollision(new int[]{-2,-2,1,-2});
        assertThat(result).isEqualTo(new int[]{-2,-2,-2});
    }
    @Test
    void asteroidCollision6() {
        int[] result = instance.asteroidCollision(new int[]{-2,-2,2,-2});
        assertThat(result).isEqualTo(new int[]{-2,-2});
    }
}