package svj.exercise.streams;

import org.junit.jupiter.api.Test;
import svj.exercise.streams.CustomComparators.*;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CustomComparatorsTest {

    CustomComparators instance= new CustomComparators();

    @Test
    void testSortByPriceAndName(){
        List<Product> input= Arrays.asList(
                new Product("Mouse", 50.0),
                new Product("Monitor", 300.0),
                new Product("Keyboard", 50.0),
                new Product("Phone", 800.0)
        );
        List<Product> expected= Arrays.asList(
                new Product("Phone", 800.0),
                new Product("Monitor", 300.0),
                new Product("Keyboard", 50.0),
                new Product("Mouse", 50.0)
        );
        assertThat(instance.sortByPriceAndName(input)).isEqualTo(expected);
    }

    @Test
    void testEmployeeSort(){
        List<Employee> inp= Arrays.asList(
                new Employee("Alice", 30, 60000.0),
                new Employee("Bob", 25, 55000.0),
                new Employee("Carol", 27, 65000.0),
                new Employee("Roger", 28, 65000.0),
                new Employee("Dennis", 30, 65000.0),
                new Employee("Dan", 30, 65000.0)
        );
        List<Employee> exp= Arrays.asList(
                new Employee("Bob", 25, 55000.0),
                new Employee("Alice", 30, 60000.0),
                new Employee("Dan", 30, 65000.0),
                new Employee("Dennis", 30, 65000.0),
                new Employee("Roger", 28, 65000.0),
                new Employee("Carol", 27, 65000.0)
        );
        assertThat(instance.sortEmployeeSalAgeNam(inp)).isEqualTo(exp);
    }

    @Test
    void testStrLenAndAlpha(){
        List<String> inp= Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        List<String> exp= Arrays.asList("fig", "date", "apple", "grape", "banana", "cherry");
        assertThat(instance.sortByLenAndName(inp)).isEqualTo(exp);
    }

    @Test
    void testStudentSort(){
        List<Student> inp= Arrays.asList(
                new Student("Eve", 21, 92),
                new Student("Bob", 21, 92),
                new Student("Carol", 22, 78),
                new Student("David", 19, 95),
                new Student("Alice", 20, 92)
        );
        List<Student> exp= Arrays.asList(
                new Student("David", 19, 95),
                new Student("Alice", 20, 92),
                new Student("Bob", 21, 92),
                new Student("Eve", 21, 92),
                new Student("Carol", 22, 78)
        );
        assertThat(instance.sortStudentsByScoreAgeName(inp)).isEqualTo(exp);
    }

}

