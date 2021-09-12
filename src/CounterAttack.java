import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CounterAttack {
    public int[] analyze(String str, String[] words) {

        int[] counts = new int[words.length];

        String[] sentence = str.split(" ");

        for(int i = 0; i < words.length; i++) {
            counts[i] = Collections.frequency(Arrays.asList(sentence), words[i]);
        }

        return counts;
    }
}
