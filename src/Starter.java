import java.util.Arrays;
import java.util.HashSet;

public class Starter {
    public int begins(String[] words, String first) {

        int result = 0;
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        for(String s: uniqueWords){
            if (s.startsWith(first)) {
                result++;
            }
        }

        return result;
    }
}