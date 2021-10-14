import java.util.*;

public class ManyMany {
    public String[] filter(String[] data){

        String[] ret = new String[data.length];

        for(int i = 0; i < data.length; i++) {
            HashMap<String, Integer> wordCount = new HashMap<>();

            String[] words = data[i].split(" ");

            for(String word: words) {
                wordCount.put(
                        word,
                        wordCount.getOrDefault(word, 0) + 1
                );
            }

            Collection<String> datumResult = new TreeSet<>();

            for(String word: wordCount.keySet()) {
                if(wordCount.get(word) > 1) {
                    datumResult.add(word);
                }
            }

            ret[i] = String.join(" ", datumResult);
        }

        return ret;
    }
}