import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class LetterFreq {
    public String findFreqs(String[] words) {

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        TreeMap<Character, Integer> charCount = new TreeMap<>();

        for(char c: alphabet) {
            charCount.put(c, 0);
        }

        for(String word: words) {
            char[] chars = word.toCharArray();
            for(char c: chars) {
                if(c != ' ' && c != ',') {
                    charCount.put(c, charCount.get(c) + 1);
                }
            }
        }

        List<String> res = new ArrayList<>();

        for(Integer i: charCount.values()) {
            res.add(String.valueOf(i));
        }

        return String.join(":", res);
    }
}