import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@FunctionalInterface
interface ListCutter {
    public List<String> cutter(List<String> args);
}

@FunctionalInterface
interface ListSum {
    public List<Integer> intSum(List<Integer> intNum);
}

public class CustomFunctionalInterface {

    /**
     * {@return List<String> A lower case representation of all the string objects
     * provided in the argument
     *
     * @implNote
     * This method constructs a List of the type string for a list of the type String without calling
     * any overridable methods of the object.
     *
     * 
     *
     * @param list a list of String
     * @throws NullPointerException if the argument is null
     * @see Object#toString
     * @see System#identityHashCode(Object)
     * @since 19
     */

    public List<String> lowerCase(List<String> list) {
        Objects.requireNonNull(list, "input cannot be empty");
        return list.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        /*
         * Functional Interface with lambda expressions
         */

        /*
         * the lambda expression takes a list of string and convets it to upper case
         */
        ListCutter lc = (List<String> list) -> {
            list = Objects.requireNonNull(list);
            return list.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        };

        List<String> resuList=lc.cutter(Arrays.asList("abc", "bcd", "cde", "def"));
        System.out.println(resuList);

        //functional in terface implementation with method referencing
        lc = new CustomFunctionalInterface()::lowerCase;

        System.out.println(lc.cutter(resuList));
    }
}
