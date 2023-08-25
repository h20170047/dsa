package svj.exercise.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomComparators {

    public List<Employee> sortEmployeeSalAgeNam(List<Employee> inp) {
        return inp.stream()
                .sorted(Comparator.comparing(Employee::salary)
                        .thenComparing(Employee::age, Comparator.reverseOrder())
                        .thenComparing(Employee::name))
                .collect(Collectors.toList());
    }

    public List<String> sortByLenAndName(List<String> inp) {
        return inp.stream()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(String::compareTo))
                .collect(Collectors.toList());
    }

    public List<Student> sortStudentsByScoreAgeName(List<Student> list) {
        return list.stream()
                .sorted(Comparator.comparing(Student::score, Comparator.reverseOrder())
                        .thenComparing(Student::age)
                        .thenComparing(Student::name))
                .collect(Collectors.toList());
    }

    public record Employee(String name, int age, double salary){}

    public record Product(String name, double price){}

    public record Student(String name, int age, int score){}

    public List<Product> sortByPriceAndName(List<Product> list) {
        return list.stream()
                .sorted(Comparator.comparing(Product::price).reversed().thenComparing(Product::name))
                .collect(Collectors.toList());
    }


}
