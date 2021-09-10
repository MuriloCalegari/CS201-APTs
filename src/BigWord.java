import java.util.Collections;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class BigWord {
    public String most(String[] sentences) {

        HashMap<String, Integer> wordsFrequency = new HashMap<>();

        for (String sentence: sentences) {
            for (String word: sentence.split(" ")) {

                word = word.toLowerCase();

                if(!wordsFrequency.containsKey(word)) {
                    wordsFrequency.put(word, 0);
                } else {
                    // Bad implementation: has to search for the key twice,
                    // once for getting the current value and again to replace it
                    wordsFrequency.replace(word, wordsFrequency.get(word) + 1);
                }

            }

        }

        final String[] mostFreqString = {""};
        final int[] freqCount = {0};

        wordsFrequency.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer count) {
                if(freqCount[0] < count) {
                    mostFreqString[0] = s;
                    freqCount[0] = count;
                }
            }
        });

        return mostFreqString[0];
    }
}
