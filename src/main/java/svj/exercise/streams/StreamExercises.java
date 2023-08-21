package svj.exercise.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamExercises {

    public List<Integer> removeEvenAndDoubleOdd(List<Integer> list){
        return list.stream().filter(x-> (x&1)!=0).map(x->x*2).collect(Collectors.toList());
    }

    List<Integer> flatsMap(List<List<Integer>> list){
        return list.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }

    public Map<Character, Long> countGroup(List<String> list){
        return list.stream().collect(Collectors.groupingBy(name-> name.charAt(0), Collectors.counting()));
    }

    public Integer sumEven(List<Integer> list){
        return list.stream().filter(num-> (num&1)==0)
                .reduce(0, (acc, n)-> acc+ n*2);
    }

    public Map<Character, List<String>> startCharMapping(List<String> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(
                        name-> name.charAt(0)
                ));
    }

    public List<Integer> flattenList(List<List<Integer>> input) {
        return input.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public String concatStr(List<String> list) {
        return list.stream()
                .collect(Collectors.joining(","));
    }

    public Map<Boolean, List<Integer>> partitionPrime(List<Integer> inp) {
        return inp.stream()
                .collect(Collectors.partitioningBy(this::isPrime));
    }

    private boolean isPrime(Integer inp) {
        for(int i=2; i*i<=inp; i++){
            if(inp%i== 0)
                return false;
        }
        return true;
    }

    public String longestStr(List<String> list) {
        return list.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String::length))
                .orElse(null);
    }

    public List<List<String>> getAnagramMap(List<String> input) {
        return input.stream()
                .collect(Collectors.groupingBy(word->sortCharArray(word)))
                .values().stream()
                .collect(Collectors.toList());
    }

    private String sortCharArray(String word) {
        char[] charArr= word.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

    public Double avgAge(List<Person> list) {
        return list.stream()
                .collect(Collectors.averagingDouble(Person::age));
    }

    public List<Integer> getFact(List<Integer> inp) {
        return inp.stream()
                .map(x->fact(x))
                .collect(Collectors.toList());
    }

    private Integer fact(Integer inp) {
        if(inp< 0)
            throw new RuntimeException("No negative number expected for factorial computation");
        if(inp== 1 || inp== 0)
            return 1;
        else
            return inp*fact(inp-1);
    }

    public Double oddIndexSum(List<Integer> list) {
        return IntStream.range(0, list.size())
                .filter(index-> (index&1)== 0)
                .mapToDouble(x-> list.get(x))
                .sum();
    }

    public record Person(String name, int age){}

    public List<Person> sortByAge(List<Person> list){
        return list.stream()
                .sorted(Comparator.comparing(Person::age))
                .collect(Collectors.toList());
    }

    public String joiningString(List<String> list){
        return list.stream().collect(Collectors.joining(" "));
    }

    public List<Integer> getOddNo(List<Integer> list){
        Map<Boolean, List<Integer>> oddMap = list.stream()
                .collect(Collectors.partitioningBy(num -> (num & 1) == 1));
        return oddMap.get(true);
    }

    public List<String> getStringByLen(List<String> list, int n){
        Map<Integer, List<String>> lenMap = list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.mapping(word -> word, Collectors.toList())));
        return lenMap.get(n);
    }

    public String getLongestWord(List<String> list){
        return list.stream()
//                .collect(Collectors.reducing())
                .reduce((w1, w2)-> w1.length()< w2.length()? w2: w1)
                .orElse(null);
    }

    public int getMin(List<Integer> list){
        return list.stream().collect(Collectors.minBy(Comparator.naturalOrder())).orElse(null);
    }

    public List<String> retrieveByLenAndFirstChar(List<String> list, int len, char firstLetter){
        Map<Integer, Map<Character, List<String>>> result = list.stream()
                .collect(Collectors.groupingBy(String::length,
                        Collectors.groupingBy(word -> word.charAt(0))));
        return result.get(len).get(firstLetter);
    }

    public Map<String, Long> countWord(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
    }

    public Map<Integer, Long> countWordLen(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
    }

    public Double avgLen(List<String> list){
        return list.stream()
                .collect(Collectors.averagingDouble(String::length));
    }

    public Character mostCommmonChar(String str){
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting())
                );
        return frequencyMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();
    }

    public Character mostPopularCharInList(List<String> list){
        Map<Character, Long> freqMap = list.stream()
                .flatMapToInt(String::chars)
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        return freqMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();

    }

    public List<Integer> mergeAndSort(List<Integer> list1, List<Integer> list2){
        return Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public Long sumSqEven(List<Integer> list){
        return list.stream()
                .filter(x-> (x&1)== 0)
                .mapToLong(x-> x*x)
                .sum();
    }
}
