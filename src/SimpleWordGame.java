import java.util.Arrays;
import java.util.HashSet;

public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {

        int score = 0;
        HashSet<String> playerWords = new HashSet<>(Arrays.asList(player));

        playerWords.retainAll(Arrays.asList(dictionary));

        for(String word: playerWords) {
            score += word.length()*word.length();
        }

        return score;
    }
}