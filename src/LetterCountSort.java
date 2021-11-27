import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LetterCountSort {

    Set<Character> specialChars = new HashSet<>();

    public String[] sort(String[] list, String specialChars) {

        char[] array = specialChars.toCharArray();

        for(Character c: array) {
            this.specialChars.add(c);
        }

        Arrays.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return getCount(o1) - getCount(o2);
            }
        }.thenComparing(Comparator.naturalOrder()));

        return list;
    }

    private int getCount(String word) {
        char[] chars = word.toCharArray();

        int count = 0;

        for(Character c: chars) {
            if(specialChars.contains(c)) count++;
        }

        return count;
    }
}