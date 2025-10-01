import java.util.*;
import java.util.stream.*;

class TestMain{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anmol", "Rahul", "Aman", "Ravi", "Sita");

        // Using Stream API
        names.stream()
             .filter(name -> name.startsWith("A")) // filter condition
             .forEach(System.out::println);       // print result
    }
}
