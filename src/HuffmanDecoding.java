import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class HuffmanDecoding {
    public String decode(String archive, String[] dictionary) {

        HashMap<String, Character> dic = new HashMap<>();

        for (int i = 0; i < dictionary.length; i++) {
            dic.put(dictionary[i], (char) (i + 65));
        }

        StringBuilder ret = new StringBuilder();

        char[] bits = archive.toCharArray();

        String current = "";

        for(int i = 0; i < bits.length; i++) {
            current += bits[i];

            if(dic.containsKey(current)) {
                ret.append(dic.get(current));
                current = "";
            }
        }

        return ret.toString();
    }
}