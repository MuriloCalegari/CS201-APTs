import java.sql.Array;
import java.util.*;

public class SyllableSorting {
    public String[] sortWords(String[] words) {

        List<Map.Entry<String, List<String>>> decomposedWords = new ArrayList<>();

        for(String word: words) {
            decomposedWords.add(new AbstractMap.SimpleEntry<>(word, decompose(word)));
        }

        decomposedWords.sort((o1, o2) -> {
            List<String> sequence1Used;
            List<String> sequence2Used;

            ArrayList<String> o1SequenceOrdered = new ArrayList<>(o1.getValue());
            ArrayList<String> o2SequenceOrdered = new ArrayList<>(o2.getValue());
            o1SequenceOrdered.sort(Comparator.naturalOrder());
            o2SequenceOrdered.sort(Comparator.naturalOrder());

            String word1 = String.join("", o1SequenceOrdered);
            String word2 = String.join("", o2SequenceOrdered);

            if(!word1.equals(word2)) {
                sequence1Used = o1SequenceOrdered;
                sequence2Used = o2SequenceOrdered;
            } else {
                sequence1Used = o1.getValue();
                sequence2Used = o2.getValue();
            }

            for(int i = 0; i < Math.min(sequence1Used.size(), sequence2Used.size()); i++) {
                int compare = String.CASE_INSENSITIVE_ORDER.compare(sequence1Used.get(i), sequence2Used.get(i));

                if(compare == 0) continue;

                return compare;
            }

            return sequence1Used.size()- sequence2Used.size(); // when the first i-th are equal but sequences are different sizes
        });

        String[] ret = new String[decomposedWords.size()];

        for (int i = 0; i < decomposedWords.size(); i++) {
            ret[i] = decomposedWords.get(i).getKey();
        }

        return ret;
    }

    /**
     * Decompose a word into syllables and sort
     */
    public ArrayList<String> decompose(String s) {
        ArrayList<String> decomposed = new ArrayList<>();

        char[] charArray = s.toCharArray();
        int first = 0;
        int last = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if(isVowel(c)) {
                last = i;
                if(i + 1 >= charArray.length || !isVowel(charArray[i + 1])) {
                    decomposed.add(s.substring(first, last + 1));
                    first = last + 1;
                }
            } else {
                last++;
            }
        }
        return decomposed;
    }

    private boolean isVowel(char character) {
        List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

        return VOWELS.contains(character);
    }
}