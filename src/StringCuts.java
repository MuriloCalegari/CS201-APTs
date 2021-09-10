import java.util.*;
import java.util.function.Predicate;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {

        ArrayList<String> ret = new ArrayList<>(list.length);

        /*
         This is a bad implementation since it scans through the entire
         list for every word in order to check duplicates.

         However, I wanted to stick with class types seen in class;
         a better implementation should use a sorted set
         to remove duplicates first (one time operation)
         and then filter word by word.
        */

        for(String word: list) {
            if(word.length() >= minLength && !ret.contains(word)) {
                ret.add(word);
            }
        }

        return ret.toArray(new String[]{});
    }
}