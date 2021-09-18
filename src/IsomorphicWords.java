import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicWords {
    public int countPairs(String[] words) {

        int count = 0;

        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(iso(words[i]).equals(iso(words[j]))) {
                    count++;
                }
            }
        }

        return count;

    }

    public String iso(String word) {
        char[] ret = new char[word.length()];
        HashMap<Character, Character> mappedCharacters = new HashMap<>();

        char[] charArray = word.toCharArray();
        int greatestChar = 97;

        for (int i = 0; i < charArray.length; i++) {

            char c = charArray[i];

            if(!mappedCharacters.containsKey(c)) {
                mappedCharacters.put(c, (char) greatestChar);
                greatestChar++;
            }

            ret[i] = mappedCharacters.get(c);

        }

        return new String(ret);
    }
}