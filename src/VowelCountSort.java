import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class VowelCountSort {
    public String[] sort(String[] list) {

        Arrays.sort(list, (new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return countVowels(o1) - countVowels(o2);
            }
        }).thenComparing(Comparator.naturalOrder()));

        return list;
    }

    private int countVowels(String s) {
        List<String> VOWELS = Arrays.asList("a", "e", "i", "o", "u");

        int count = 0;

        for(char c: s.toCharArray()) {
            if(VOWELS.contains(String.valueOf(c))) count++;
        }

        return count;
    }
}