package svj.exercise.streams;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import svj.exercise.streams.StreamExercises.Person;

import static org.assertj.core.api.Assertions.assertThat;

class StreamExercisesTest {

    StreamExercises instance= new StreamExercises();
    @Test
    void removeEvenAndDoubleOdd() {
        List<Integer> result= instance.removeEvenAndDoubleOdd(IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList()));
        List<Integer> expected= Arrays.asList(2,6,10,14,18);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void flatsMap() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );
        assertThat(instance.flatsMap(listOfLists)).isEqualTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
    }

    @Test
    void countGroup() {
        Map<Character, Long> result = instance.countGroup(Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace"));
        Map<Character, Integer> expected= new HashMap(){{
            put('A', 1L);
            put('B', 1L);
            put('C', 1L);
            put('D', 1L);
            put('E', 1L);
            put('F', 1L);
            put('G', 1L);
        }};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void addEvenTest(){
        assertThat(instance.sumEven(Arrays.asList(1,2,3,4,5,6))).isEqualTo(24);
    }

    @Test
    void testSortByAge(){
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 40)
        );
        List<Person> expected = Arrays.asList(
                new Person("Bob", 25),
                new Person("Alice", 30),
                new Person("Charlie", 40)
        );
        assertThat(instance.sortByAge(people)).isEqualTo(expected);
    }

    @Test
    void joiningStringTest(){
        assertThat(instance.joiningString(Arrays.asList("I am", "John", "Honai"))).isEqualTo("I am John Honai");
    }

    @Test
    void getOddNumbersTest(){
        assertThat(instance.getOddNo(Arrays.asList(1,2,3,4,5,6))).isEqualTo(Arrays.asList(1,3,5));
    }

    @Test
    void testListByLen(){
        List<String> result = instance.getStringByLen(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi"), 5);
        assertThat(result).isEqualTo(Arrays.asList("apple", "grape"));
    }

    @Test
    void testLongestWord(){
        assertThat(instance.getLongestWord(Arrays.asList("axyz", "bc", "def"))).isEqualTo("axyz");
    }

    @Test
    void testLongestWord2(){
        assertThat(instance.getLongestWord(Arrays.asList())).isEqualTo(null);
    }

    @Test
    void testGetMin(){
        assertThat(instance.getMin(Arrays.asList(1,2,3,0))).isEqualTo(0);
    }
    
    @Test
    void testLenAndFirstChar(){
        assertThat(instance.retrieveByLenAndFirstChar(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", "kiwi"), 5, 'a')).isEqualTo(Arrays.asList("apple"));
    }

    @Test
    void testCountWord(){
        Map<String, Long> expected= new HashMap(){{
            put("apple",  2L);
            put("banana",  1L);
            put("cherry",  1L);
            put("date",  1L);
            put("fig",  1L);
            put("grape",  1L);
            put("kiwi",  1L);
        }};

        assertThat(instance.countWord(Arrays.asList("apple", "apple", "banana", "cherry", "date", "fig", "grape", "kiwi"))).isEqualTo(expected);
    }

    @Test
    void countByLenTest(){
        Map<Integer, Long> expected= new HashMap<>(){{
            put(3, 1L);
            put(4, 2L);
            put(5, 3L);
            put(6, 2L);
        }};
        assertThat(instance.countWordLen(Arrays.asList("apple", "apple", "banana", "cherry", "date", "fig", "grape", "kiwi"))).isEqualTo(expected);
    }

    @Test
    void avgLenTest(){
        assertThat(instance.avgLen(Arrays.asList("apple", "apple", "banana", "cherry", "date", "fig", "grape", "kiwi"))).isEqualTo(4.75);
    }

    @Test
    void testMaxCount(){
        assertThat(instance.mostCommmonChar("apple")).isEqualTo('p');
    }

    @Test
    void testCommonCharInListTest(){
        assertThat(instance.mostPopularCharInList(Arrays.asList("apple", "apple", "banana", "cherry", "date", "fig", "grape", "kiwi"))).isEqualTo('a');
    }

    @Test
    void testMergeAndSort(){
        assertThat(instance.mergeAndSort(Arrays.asList(1,1,1,1,2), Arrays.asList(9, 2, 23, 5))).isEqualTo(Arrays.asList(1, 2, 5, 9, 23));
    }

    @Test
    void testSumSqTest(){
        assertThat(instance.sumSqEven(Arrays.asList(1,2,3,4))).isEqualTo(20);
    }

    @Test
    void testStartCharMap(){
        Map<Character, List<String>> expected= new HashMap<>(){{
            put('A', Arrays.asList("Alice", "Anna", "Alex"));
            put('B', Arrays.asList("Bob", "Ben"));
            put('C', Arrays.asList("Charlie"));
        }};
        assertThat(instance.startCharMapping(Arrays.asList(null, "Alice", "Bob", "Anna", "Alex", "Ben", "Charlie"))).isEqualTo(expected);
    }

    @Test
    void testFlattenList(){
        List<List<Integer>> input= Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(5,6,7));
        assertThat(instance.flattenList(input)).isEqualTo(Arrays.asList(1,2,3,5,6,7));
    }

    @Test
    void testConcatStr(){
        assertThat(instance.concatStr(Arrays.asList("a","b","c"))).isEqualTo("a,b,c");
    }

    @Test
    void testPrimePartition(){
        List<Integer> inp= Arrays.asList(2, 4, 5, 6, 7, 9, 10, 11);
        Map<Boolean, List<Integer>> expected= new HashMap<>(){{
            put(true, Arrays.asList(2, 5, 7, 11));
            put(false, Arrays.asList(4, 6, 9, 10));
        }};
        assertThat(instance.partitionPrime(inp)).isEqualTo(expected);
    }

    @Test
    void testLongestStr(){
        assertThat(instance.longestStr(Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape", null))).isEqualTo("banana");
    }

    @Test
    void testAnagram(){
        List<String> input= Arrays.asList("listen", "silent", "act", "cat", "debit", "bad", "elbow", "below");
        List<List<String>> expected= Arrays.asList(Arrays.asList("listen", "silent"), Arrays.asList("act", "cat"), Arrays.asList("elbow", "below"), Arrays.asList("bad"), Arrays.asList("debit"));
        assertThat(instance.getAnagramMap(input)).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void testAvgAge(){
        List<Person> inp= Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie",28), new Person("David", 22), new Person("Eve", 35));
        assertThat(instance.avgAge(inp)).isEqualTo(28);
    }

    @Test
    void testFact(){
        List<Integer> inp= Arrays.asList(3, 5, 4, 0, 1);
        assertThat(instance.getFact(inp)).isEqualTo(Arrays.asList(6, 120, 24, 1, 1));
    }

    @Test
    void testOddSumIndex(){
        assertThat(instance.oddIndexSum(Arrays.asList(1,2,3,4,5))).isEqualTo(9);
    }
}