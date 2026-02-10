import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressionWithCollection {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple","mango","banana","pear","orange","lemon");

        // For each with lambda expression
        fruits.forEach(s->System.out.println(s));


        /*
         * Filtering and Mapping with Streams
         */

         List<String> fruitsWithA=fruits.stream()
         .filter( s -> s.contains("a"))
         .map(String::toUpperCase).
         collect(Collectors.toList());

         fruitsWithA.forEach(s->System.out.println(s));

    }
}
