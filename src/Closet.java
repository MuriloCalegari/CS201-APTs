import java.util.Arrays;
import java.util.TreeSet;

public class Closet {
    public String anywhere(String[] list) {

        TreeSet<String> words = new TreeSet<>();

        for(String phrase: list) {
            words.addAll(Arrays.asList(phrase.split(" ")));
        }

        return String.join(" ", words);
    }
}