import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class FunctionalInterfaces {
    public static void main(String[] args) {
       

        /*
         * Function is an inbuilt, functional interface that takes one argument T
         * and produces one result R
         */
        Function<String,String[]> function = s ->{
            Objects.requireNonNull(s, "String cannot be empty");
            String [] letters = new String[s.length()];
            for(int i=0;i<s.length();i++){
                letters[i] = s.substring(i, i+1);
            }
            return letters;
        } ;


        try
        {
            List<String> result =  Arrays.asList(function.apply(null));
            System.out.println(result);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
