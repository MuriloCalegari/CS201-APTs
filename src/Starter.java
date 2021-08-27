import java.util.Arrays;
import java.util.HashSet;

public class Starter {
    public int begins(String[] words, String first) {

        int result = 0;

        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));

        for(String s: uniqueWords){
            if (s.charAt(0) == first.charAt(0)) {
                result++;
            }
        }

        return result;
    }
}