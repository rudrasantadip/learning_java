import java.util.function.Function;
import java.util.function.Predicate;

public class lambdaExpressionWithParam {
    public static void main(String[] args) {
        
        // Example with predicate
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));
        
        System.out.println(
            isEmpty.negate().test("")
        );


        Function<String,Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("santadip"));
    }
}
