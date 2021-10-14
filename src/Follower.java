import java.util.ArrayList;

public class Follower {
    public int[] follows(String[] words) {

        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    res.add(i);
                    break;
                }
            }
        }

        int[] ret = new int[res.size()];

        for (int j = 0; j < res.size(); j++) {
            ret[j] = res.get(j);
        }

        return ret;
    }
}