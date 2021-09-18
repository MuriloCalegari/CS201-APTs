import java.util.HashMap;

public class Anonymous {
    public int howMany(String[] headlines, String[] messages) {

        int res = 0;

        HashMap<Character, Integer> headlineLetterCount = getCharactersCount(headlines);

        for(String message: messages) {
            boolean canBeWritten;

            HashMap<Character, Integer> wordLetterCount = getCharactersCount(new String[]{message});

            canBeWritten = true;

            for (Character c: wordLetterCount.keySet()) {
                if (wordLetterCount.get(c) > headlineLetterCount.getOrDefault(c, 0)) canBeWritten = false;
            }

            if (canBeWritten) res++;

        }

        return res;
    }

    private HashMap<Character, Integer> getCharactersCount(String[] stringArray) {
        HashMap<Character, Integer> ret = new HashMap<>();

        for(String s: stringArray) {
            s = s.replace(" ", "").toLowerCase();
            for(Character c: s.toCharArray()) {
                ret.putIfAbsent(c, 0);
                ret.replace(c, ret.get(c) + 1);
            }
        }

        return ret;

    }
}