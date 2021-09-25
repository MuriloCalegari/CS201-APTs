import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Aaagmnrs {
    public String[] anagrams(String[] phrases) {

        HashMap<String, Integer> anagrams = new HashMap<>();

        for (int i = 0; i < phrases.length; i++) {
            String canonicalPhrase = getCanonical(phrases[i]);

            anagrams.putIfAbsent(canonicalPhrase, i);
        }

        String[] result = new String[anagrams.size()];
        Integer[] indexes = anagrams.values().toArray(new Integer[0]);
        Arrays.sort(indexes);

        for(int i = 0; i < result.length; i++) {
            result[i] = phrases[indexes[i]];
        }

        return result;

    }

    private String getCanonical(String word) {
        char[] characters = word.
                replaceAll("\\s", "").
                toLowerCase().
                toCharArray();

        Arrays.sort(characters);

        return new String(characters);
    }
}