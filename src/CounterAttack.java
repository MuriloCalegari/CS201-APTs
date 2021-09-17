import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {

        int[] counts = new int[words.length];

        ArrayList<String> sentence = (ArrayList<String>) Arrays.asList(str.split(" "));

        for(int i = 0; i < words.length; i++) {
            counts[i] = Collections.frequency(sentence, words[i]);
        }

        return counts;
    }
}
